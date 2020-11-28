package com.itbs.business.impl;

import com.itbs.business.UserBusinessServiceI;
import com.itbs.persistence.entity.*;
import com.itbs.service.ItMatchDaoServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by shaoxuhang on 20/11/28.
 */
@Component
public class UserBusinessService implements UserBusinessServiceI{

    @Autowired
    ItMatchDaoServiceI itMatchDaoServiceI;

    @Override
    public List<TBasicCompany> queryCompany(String companyCode){
        TBasicCompanyExample example = new TBasicCompanyExample();
        TBasicCompanyExample.Criteria criteria = example.createCriteria();
        criteria.andCompanyCodeEqualTo(companyCode);
        List<TBasicCompany> tBasicCompanies = itMatchDaoServiceI.selectTBasicCompany(example);
        return tBasicCompanies;
    }

    @Override
    public List<TBasicUser> queryUserinfo(String usercode){
        TBasicUserExample example = new TBasicUserExample();
        TBasicUserExample.Criteria criteria = example.createCriteria();
        criteria.andUserCodeEqualTo(usercode);
        List<TBasicUser> tBasicUsersc = itMatchDaoServiceI.selectTBasicUser(example);
        return tBasicUsersc;
    }

    @Override
    public List<TBasicDepartment> queryloginDepartmentinfo(String departmentCode){
        TBasicDepartmentExample example = new TBasicDepartmentExample();
        TBasicDepartmentExample.Criteria criteria = example.createCriteria();
        criteria.andDepartmentCodeEqualTo(departmentCode);
        List<TBasicDepartment> tBasicUsersc = itMatchDaoServiceI.selectTBasicDepartment(example);
        return tBasicUsersc;
    }



}
