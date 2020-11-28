package com.itbs.business;

import com.itbs.persistence.entity.TBasicSku;
import com.itbs.persistence.entity.TBasicSpu;
import com.itbs.persistence.entity.TCenterResource;

import java.util.List;

public interface ResourceBusinessServiceI {

    /**
     * 资产入库
     * @param param
     * @return
     */
    boolean insertResource(TCenterResource param);

    /**
     * 查询SPU清单
     * @return
     */
    List<TBasicSpu> querySpuList();

    /**
     * 根据spuId list查询sku 未分组
     * @param spuIds
     * @return
     */
    List<TBasicSku> querySkuListBySpuIds(List<Integer> spuIds);

    /**
     * 根据skuId或spuId查询资源
     * @param spuId
     * @param skuId
     * @return
     */
    List<TCenterResource> queryResourceListsBySpuIdOrSkuId(Integer spuId, Integer skuId);

}
