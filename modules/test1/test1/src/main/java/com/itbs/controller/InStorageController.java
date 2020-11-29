package com.itbs.controller;

import com.alibaba.fastjson.JSONObject;
import com.itbs.business.InStorageBusinessServiceI;
import com.itbs.entity.TestData;

import com.itbs.persistence.entity.TCenterResource;

import com.itbs.service.TestDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("itmatch/inStorage")
public class InStorageController {

    @Autowired
    private TestDataService testDataService;

    @Autowired
    private InStorageBusinessServiceI inStorageBusinessServiceI ;


    @RequestMapping(value = "/inStorage", method = RequestMethod.POST)
    public Object inStorage(@RequestBody TCenterResource tCenterResource){
        return inStorageBusinessServiceI.inStorage(tCenterResource);
    }

}
