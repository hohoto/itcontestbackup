package com.itbs.business.impl;

import com.fasterxml.jackson.databind.ser.Serializers;
import com.itbs.business.InStorageBusinessServiceI;
import com.itbs.constant.BaseDb;
import com.itbs.persistence.entity.TCenterResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InStorageBusinessService implements InStorageBusinessServiceI {
    @Autowired
    private BaseDb baseDb;

    @Override
    public int inStorage (TCenterResource tCenterResource){
        return baseDb.tCenterResourceMapper.insert(tCenterResource);
    }
}
