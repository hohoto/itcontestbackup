package com.itbs.business.impl;

import com.itbs.business.resourceSearch;
import com.itbs.persistence.entity.Resourcemanage;
import com.itbs.persistence.mapper.ResourcemanageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class resourceSearchipml implements resourceSearch {

    @Autowired
    private ResourcemanageMapper ResourcemanageMapper;

    @Override
    public List<Resourcemanage> queryResourceList() {
        List<Resourcemanage> resourcemsgs = ResourcemanageMapper.findResourcemanagesList();
        return resourcemsgs;
    }

    @Override
    public List<Resourcemanage> querystatusResourceList(int resourcestatue) {
        List<Resourcemanage> resourcemsgs = ResourcemanageMapper.querystatusResourceList(resourcestatue);
        return resourcemsgs;
    }
}
