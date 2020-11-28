package com.itbs.business.impl;

import com.itbs.business.PandianBusinessServiceI;
import com.itbs.constant.Constant;
import com.itbs.persistence.entity.TCenterPandian;
import com.itbs.persistence.entity.TCenterPandianDetail;
import com.itbs.persistence.entity.TCenterResource;
import com.itbs.persistence.entity.TCenterResourceExample;
import com.itbs.service.ItMatchDaoServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * Created by shaoxuhang on 20/11/29.
 */
@Component
public class PandianBusinessService implements PandianBusinessServiceI {

    @Autowired
    ItMatchDaoServiceI itMatchDaoServiceI;


    /**
     * 创建盘点单
     * @param tCenterPandian
     * @return
     */
    @Override
    public boolean insertPandian(TCenterPandian tCenterPandian) throws Exception {

        /** spuId+locationCode获取资源件数**/
        TCenterResourceExample example = new TCenterResourceExample();
        TCenterResourceExample.Criteria criteria = example.createCriteria();
        criteria.andStatusNotEqualTo(Constant.ResourceStatus.BF.getValue());
        criteria.andSpuIdEqualTo(tCenterPandian.getSpuId());
        criteria.andLiocationEqualTo(tCenterPandian.getLocationCode());
        List<TCenterResource> tCenterResources = itMatchDaoServiceI.selectTCenterResource(example);
        Integer count = 0;
        if (CollectionUtils.isEmpty(tCenterResources)){
            throw new Exception("无可盘点库存量");
        }else{
            count = tCenterResources.size();
        }
        /** 创建盘点单 **/
        tCenterPandian.setPandianCode(UUID.randomUUID().toString());
        tCenterPandian.setPlanQty(count);
        tCenterPandian.setStatus(Constant.PanDianStatus.DPD.getValue());
        int i = itMatchDaoServiceI.insertTCenterPandian(tCenterPandian);
        return true;
    }

    /**
     * 创建盘点明细
     * @param tCenterPandianDetail
     * @return
     * @throws Exception
     */
    @Override
    public boolean pandian(TCenterPandianDetail tCenterPandianDetail) throws Exception {

        /** 查询盘点单 **/
        TCenterPandian tCenterPandian = itMatchDaoServiceI.selectTCenterPandianByPrimaryKey(tCenterPandianDetail.getId());

        /** 查询资源数据 **/
        TCenterResourceExample example = new TCenterResourceExample();
        TCenterResourceExample.Criteria criteria = example.createCriteria();
        criteria.andResourceCodeEqualTo(tCenterPandianDetail.getResourceCode());
        List<TCenterResource> tCenterResources = itMatchDaoServiceI.selectTCenterResource(example);

        if (CollectionUtils.isEmpty(tCenterResources) || tCenterResources.size() != 1){
            throw new Exception("查询不到库存信息或者库存不正确");
        }else{
            boolean beCz = true;
            TCenterResource tCenterResource = tCenterResources.get(0);
            if (!tCenterResource.getSpuId().equals(tCenterPandian.getSpuId())
                    || tCenterResource.getStatus().equals(Constant.ResourceStatus.BF.getValue())
                    || !tCenterResource.getLiocation().equals(tCenterPandianDetail.getLocationCode())){
                beCz = false;
            }
            tCenterPandianDetail.setIsHl(beCz == true ? Constant.BeHl.HL.getValue() : Constant.BeHl.BHL.getValue());
            tCenterPandianDetail.setPandianDetailCode(UUID.randomUUID().toString());
            tCenterPandianDetail.setResourceCode(tCenterResource.getResourceCode());
            tCenterPandianDetail.setDate(new Date());
            int i = itMatchDaoServiceI.insertTCenterPandianDetail(tCenterPandianDetail);
        }
        return true;

    }

}
