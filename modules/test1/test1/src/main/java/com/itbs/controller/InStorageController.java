package com.itbs.controller;

import com.alibaba.fastjson.JSONObject;
import com.itbs.entity.TestData;
import com.itbs.persistence.entity.Resourcemanage;
import com.itbs.persistence.mapper.InsertDataMapper;
import com.itbs.service.InsertDataServiceImpl;
import com.itbs.service.TestDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

@RestController
@RequestMapping("itmatch/insertData")
public class InsertController {

    @Autowired
    private TestDataService testDataService;

    @Autowired
    private InsertDataServiceImpl insertDataServiceImpl;


    @RequestMapping(value = "/ruku", method = RequestMethod.POST)
    public Object newruku(@RequestBody JSONObject requestbody){
        return insertDataServiceImpl.insertData(resourcemanage);
    }

}
