package com.itbs.business.impl;

import com.itbs.business.ResourceBusinessServiceI;
import com.itbs.constant.Constant;
import com.itbs.persistence.entity.*;
import com.itbs.service.ItMatchDaoServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Component
public class ResourceBusinessService implements ResourceBusinessServiceI{

    @Autowired
    ItMatchDaoServiceI itMatchDaoServiceI;

    /**
     * 资产入库
     * @return
     */
    @Override
    public boolean insertResource(TCenterResource param){
        param.setResourceCode(UUID.randomUUID().toString());
        param.setStatus(Constant.ResourceStatus.XZ.getValue());
        int i = itMatchDaoServiceI.insertTCenterResource(param);
        return true;
    }

    /**
     * 查询SPU清单
     * @return
     */
    @Override
    public List<TBasicSpu> querySpuList(){
        TBasicSpuExample example = new TBasicSpuExample();
        TBasicSpuExample.Criteria criteria = example.createCriteria();
        List<TBasicSpu> tBasicSpus = itMatchDaoServiceI.selectTBasicSpu(example);
        return tBasicSpus;
    }

    /**
     * 根据spuId list查询sku 未分组
     * @param spuIds
     * @return
     */
    @Override
    public List<TBasicSku> querySkuListBySpuIds(List<Integer> spuIds){
        TBasicSkuExample example = new TBasicSkuExample();
        TBasicSkuExample.Criteria criteria = example.createCriteria();
        criteria.andSpuIdIn(spuIds);
        List<TBasicSku> tBasicSkus = itMatchDaoServiceI.selectTBasicSku(example);
        return tBasicSkus;
    }

    /**
     * 根据skuId或spuId查询资源
     * @param spuId
     * @param skuId
     * @return
     */
    @Override
    public List<TCenterResource> queryResourceListsBySpuIdOrSkuId(Integer spuId, Integer skuId){
        TCenterResourceExample example = new TCenterResourceExample();
        TCenterResourceExample.Criteria criteria = example.createCriteria();
        criteria.andSkuIdEqualTo(skuId);
        criteria.andSpuIdEqualTo(spuId);
        List<TCenterResource> tCenterResources = itMatchDaoServiceI.selectTCenterResource(example);
        return tCenterResources;
    }




}
