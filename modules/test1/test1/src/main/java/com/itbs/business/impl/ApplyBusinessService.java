package com.itbs.business.impl;

import com.itbs.business.ApplyBusinessServiceI;
import com.itbs.constant.Constant;
import com.itbs.persistence.entity.TCenterResource;
import com.itbs.persistence.entity.TCenterResourceExample;
import com.itbs.persistence.entity.TDdApply;
import com.itbs.service.ItMatchDaoServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * Created by shaoxuhang on 20/11/28.
 */
@Component
public class ApplyBusinessService implements ApplyBusinessServiceI {

    @Autowired
    ItMatchDaoServiceI itMatchDaoServiceI;

    /**
     * 创建申请单
     * @param tDdApply
     * @return
     */
    @Override
    public boolean createApply(TDdApply tDdApply, Integer resourceId) throws Exception {
        if (resourceId == null){
            throw new Exception("资源ID不能为空");
        }
        /** 查询资源库存 **/
        TCenterResourceExample example = new TCenterResourceExample();
        TCenterResourceExample.Criteria criteria = example.createCriteria();
        criteria.andResourceIdEqualTo(resourceId);
        if (tDdApply.getApplyType().equals(Constant.ApplyType.JY.getValue())
                || tDdApply.getApplyType().equals(Constant.ApplyType.SY.getValue())){
            //借用、使用
            criteria.andStatusEqualTo(Constant.ResourceStatus.XZ.getValue());
        } else if (tDdApply.getApplyType().equals(Constant.ApplyType.TZ.getValue()) ||
                tDdApply.getApplyType().equals(Constant.ApplyType.BF.getValue()) ||
                tDdApply.getApplyType().equals(Constant.ApplyType.CS.getValue()) ||
                tDdApply.getApplyType().equals(Constant.ApplyType.DQ.getValue()) ||
                tDdApply.getApplyType().equals(Constant.ApplyType.DZ.getValue())){
            //报废
            criteria.andStatusNotEqualTo(Constant.ResourceStatus.ZY.getValue());
        } else if (tDdApply.getApplyType().equals(Constant.ApplyType.GH.getValue())){
            //归还
            criteria.andStatusEqualTo(Constant.ResourceStatus.SYZ.getValue());
        } else if (tDdApply.getApplyType().equals(Constant.ApplyType.ZY.getValue())){
            //转移
            List<Integer> status = new ArrayList<>();
            status.add(Constant.ResourceStatus.ZY.getValue());
            status.add(Constant.ResourceStatus.BF.getValue());
            criteria.andStatusNotIn(status);
        }
        List<TCenterResource> tCenterResources = itMatchDaoServiceI.selectTCenterResource(example);
        /** 校验库存 **/
        if (tCenterResources.size() != 1){
            throw new Exception("库存数量或状态不可用");
        }


        /** 创建审批单 **/
        TCenterResource tCenterResource = tCenterResources.get(0);
        if (tDdApply.getApplyType().equals(Constant.ApplyType.JY.getValue())
                || tDdApply.getApplyType().equals(Constant.ApplyType.SY.getValue())){
            //借用、使用
            tDdApply.setApplyCode(UUID.randomUUID().toString());
            tDdApply.setSpuId(tCenterResource.getSpuId());
            tDdApply.setSkuId(tCenterResource.getSkuId());
            tDdApply.setResourceId(tCenterResource.getResourceId());
            tDdApply.setStatus(Constant.ApplyStatus.DSP.getValue());
            tDdApply.setApplyDate(new Date());
        } else if (tDdApply.getApplyType().equals(Constant.ApplyType.TZ.getValue()) ||
                tDdApply.getApplyType().equals(Constant.ApplyType.BF.getValue()) ||
                tDdApply.getApplyType().equals(Constant.ApplyType.CS.getValue()) ||
                tDdApply.getApplyType().equals(Constant.ApplyType.DQ.getValue()) ||
                tDdApply.getApplyType().equals(Constant.ApplyType.DZ.getValue())){
            //报废
            tDdApply.setApplyCode(UUID.randomUUID().toString());
            tDdApply.setSpuId(tCenterResource.getSpuId());
            tDdApply.setSkuId(tCenterResource.getSkuId());
            tDdApply.setResourceId(tCenterResource.getResourceId());
            tDdApply.setStatus(Constant.ApplyStatus.DSP.getValue());
            tDdApply.setApplyDate(new Date());
        } else if (tDdApply.getApplyType().equals(Constant.ApplyType.GH.getValue())){
            //归还
            tDdApply.setApplyCode(UUID.randomUUID().toString());
            tDdApply.setSpuId(tCenterResource.getSpuId());
            tDdApply.setSkuId(tCenterResource.getSkuId());
            tDdApply.setResourceId(tCenterResource.getResourceId());
            tDdApply.setStatus(Constant.ApplyStatus.DSP.getValue());
            tDdApply.setApplyDate(new Date());
        } else if (tDdApply.getApplyType().equals(Constant.ApplyType.ZY.getValue())){
            //转移
            tDdApply.setApplyCode(UUID.randomUUID().toString());
            tDdApply.setSpuId(tCenterResource.getSpuId());
            tDdApply.setSkuId(tCenterResource.getSkuId());
            tDdApply.setResourceId(tCenterResource.getResourceId());
            tDdApply.setStatus(Constant.ApplyStatus.DSP.getValue());
            tDdApply.setApplyDate(new Date());
        }
        int i = itMatchDaoServiceI.insertTDdApply(tDdApply);

        return true;

    }


    /**
     * 借用，使用->审批
     * @param tDdApply
     * @return
     */
    @Override
    public boolean shenlingShenPi(TDdApply tDdApply) throws Exception {
        if (tDdApply.getId() == null || tDdApply.getResourceId() == null){
            throw new Exception("审批单ID或者资源ID不能为空");
        }

        /** 处理单据 **/
        tDdApply.setShenpiDate(new Date());
        int i = itMatchDaoServiceI.updateTDdApplyByPrimaryKeySelective(tDdApply);


        /** 处理资源 **/
        TCenterResourceExample example = new TCenterResourceExample();
        TCenterResourceExample.Criteria criteria = example.createCriteria();
        criteria.andResourceIdEqualTo(tDdApply.getResourceId());
        criteria.andStatusEqualTo(Constant.ResourceStatus.ZY.getValue());
        List<TCenterResource> tCenterResources = itMatchDaoServiceI.selectTCenterResource(example);
        if (tCenterResources.size() != 1){
            throw new Exception("资源异常");
        }
        TCenterResource tCenterResource = tCenterResources.get(0);
        tCenterResource.setResponsibilityCenter(tDdApply.getResponsibilityCenter());
        if (tDdApply.getStatus().equals(Constant.ApplyStatus.YES.getValue())){
            //同意
            tCenterResource.setStatus(Constant.ResourceStatus.SYZ.getValue());

        }else{
            //不同意
            tCenterResource.setStatus(Constant.ResourceStatus.XZ.getValue());
        }
        int i1 = itMatchDaoServiceI.updateTCenterResourceByPrimaryKeySelective(tCenterResource);
        return true;
    }


    /**
     * 报废->审批
     * @param tDdApply
     * @return
     */
    @Override
    public boolean baofeiShenPi(TDdApply tDdApply) throws Exception {
        if (tDdApply.getId() == null || tDdApply.getResourceId() == null){
            throw new Exception("审批单ID或者资源ID不能为空");
        }

        /** 处理单据 **/
        tDdApply.setShenpiDate(new Date());
        int i = itMatchDaoServiceI.updateTDdApplyByPrimaryKeySelective(tDdApply);


        /** 处理资源 **/
        if (tDdApply.getStatus().equals(Constant.ApplyStatus.YES.getValue())){
            //同意
            TCenterResourceExample example = new TCenterResourceExample();
            TCenterResourceExample.Criteria criteria = example.createCriteria();
            criteria.andResourceIdEqualTo(tDdApply.getResourceId());
            criteria.andStatusNotEqualTo(Constant.ResourceStatus.ZY.getValue());
            List<TCenterResource> tCenterResources = itMatchDaoServiceI.selectTCenterResource(example);
            if (tCenterResources.size() != 1){
                throw new Exception("资源异常");
            }
            TCenterResource tCenterResource = tCenterResources.get(0);
            tCenterResource.setResponsibilityCenter(tDdApply.getResponsibilityCenter());
            tCenterResource.setStatus(Constant.ResourceStatus.BF.getValue());
            int i1 = itMatchDaoServiceI.updateTCenterResourceByPrimaryKeySelective(tCenterResource);
        }

        return true;
    }


    /**
     * 归还->审批
     * @param tDdApply
     * @return
     */
    @Override
    public boolean guihuanShenPi(TDdApply tDdApply, TCenterResource resource) throws Exception {
        if (tDdApply.getId() == null || tDdApply.getResourceId() == null){
            throw new Exception("审批单ID或者资源ID不能为空");
        }

        /** 处理单据 **/
        tDdApply.setShenpiDate(new Date());
        int i = itMatchDaoServiceI.updateTDdApplyByPrimaryKeySelective(tDdApply);


        /** 处理资源 **/
        if (tDdApply.getStatus().equals(Constant.ApplyStatus.YES.getValue())){
            //同意
            TCenterResourceExample example = new TCenterResourceExample();
            TCenterResourceExample.Criteria criteria = example.createCriteria();
            criteria.andResourceIdEqualTo(tDdApply.getResourceId());
            criteria.andStatusEqualTo(Constant.ResourceStatus.SYZ.getValue());
            List<TCenterResource> tCenterResources = itMatchDaoServiceI.selectTCenterResource(example);
            if (tCenterResources.size() != 1){
                throw new Exception("资源异常");
            }
            TCenterResource tCenterResource = tCenterResources.get(0);
            tCenterResource.setResponsibilityCenter(tDdApply.getResponsibilityCenter());
            tCenterResource.setStatus(Constant.ResourceStatus.XZ.getValue());
            tCenterResource.setKeeperId(resource.getKeeperId());
            tCenterResource.setKeeperName(resource.getKeeperName());
            tCenterResource.setUserId(resource.getUserId());
            tCenterResource.setUserName(resource.getUserName());
            int i1 = itMatchDaoServiceI.updateTCenterResourceByPrimaryKeySelective(tCenterResource);
        }

        return true;
    }


    /**
     * 转移->审批
     * @param tDdApply
     * @return
     */
    @Override
    public boolean zhuanyiShenPi(TDdApply tDdApply, TCenterResource resource) throws Exception {
        if (tDdApply.getId() == null || tDdApply.getResourceId() == null){
            throw new Exception("审批单ID或者资源ID不能为空");
        }

        /** 处理单据 **/
        tDdApply.setShenpiDate(new Date());
        int i = itMatchDaoServiceI.updateTDdApplyByPrimaryKeySelective(tDdApply);


        /** 处理资源 **/
        if (tDdApply.getStatus().equals(Constant.ApplyStatus.YES.getValue())){
            //同意
            TCenterResourceExample example = new TCenterResourceExample();
            TCenterResourceExample.Criteria criteria = example.createCriteria();
            criteria.andResourceIdEqualTo(tDdApply.getResourceId());
            List<Integer> status = new ArrayList<>();
            status.add(Constant.ResourceStatus.ZY.getValue());
            status.add(Constant.ResourceStatus.BF.getValue());
            criteria.andStatusNotIn(status);
            List<TCenterResource> tCenterResources = itMatchDaoServiceI.selectTCenterResource(example);
            if (tCenterResources.size() != 1){
                throw new Exception("资源异常");
            }
            TCenterResource tCenterResource = tCenterResources.get(0);
            tCenterResource.setResponsibilityCenter(tDdApply.getResponsibilityCenter());
            tCenterResource.setKeeperId(resource.getKeeperId());
            tCenterResource.setKeeperName(resource.getKeeperName());
            tCenterResource.setUserId(resource.getUserId());
            tCenterResource.setUserName(resource.getUserName());
            tCenterResource.setLiocation(resource.getLiocation());
            int i1 = itMatchDaoServiceI.updateTCenterResourceByPrimaryKeySelective(tCenterResource);
        }

        return true;
    }



}
