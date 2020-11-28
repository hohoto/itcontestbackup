package com.itbs.business;

import com.itbs.persistence.entity.TCenterResource;
import com.itbs.persistence.entity.TDdApply;

/**
 * Created by shaoxuhang on 20/11/28.
 */
public interface ApplyBusinessServiceI {

    boolean createApply(TDdApply tDdApply, Integer resourceId) throws Exception;

    boolean shenlingShenPi(TDdApply tDdApply) throws Exception;

    boolean baofeiShenPi(TDdApply tDdApply) throws Exception;

    boolean guihuanShenPi(TDdApply tDdApply, TCenterResource resource) throws Exception;

    boolean zhuanyiShenPi(TDdApply tDdApply, TCenterResource resource) throws Exception;



}
