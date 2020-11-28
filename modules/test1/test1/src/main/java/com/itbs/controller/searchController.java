package com.itbs.controller;

import com.itbs.business.resourceSearch;
import com.itbs.persistence.entity.Resourcemanage;
import com.itbs.persistence.entity.TBasicCompany;
import com.itbs.persistence.entity.TBasicDepartment;
import com.itbs.persistence.entity.TBasicUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("/search")
public class searchController {
    @Autowired
    private resourceSearch resourceSearch;

    @GetMapping("/getAllList")
    public List getAllList(){
        List<Resourcemanage> resourcemsgs = resourceSearch.queryResourceList();
        return resourcemsgs;
    }

    @GetMapping("/getStutasList")
    public List getStutasList(int resourcestatue){
        List<Resourcemanage> resourcemsgs = resourceSearch.querystatusResourceList(resourcestatue);
        return resourcemsgs;
    }



}
