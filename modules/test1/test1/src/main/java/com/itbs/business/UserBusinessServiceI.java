package com.itbs.business;


import com.itbs.persistence.entity.TBasicCompany;
import com.itbs.persistence.entity.TBasicDepartment;
import com.itbs.persistence.entity.TBasicUser;

import java.util.List;

/**
 * Created by shaoxuhang on 20/11/28.
 */
public interface UserBusinessServiceI {

    List<TBasicCompany> queryCompany(String companyCode);
    List<TBasicUser> queryUserinfo(String usercode);
    List<TBasicDepartment> queryloginDepartmentinfo(String departmentCode);


}
