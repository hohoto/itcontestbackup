package com.itbs.business;

import com.itbs.persistence.entity.Resourcemanage;
import com.itbs.persistence.entity.TBasicCompany;

import java.util.List;

public interface resourceSearch {
    List<Resourcemanage> queryResourceList();
    List<Resourcemanage> querystatusResourceList(int resourcestatue);
}
