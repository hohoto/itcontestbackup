package com.itbs.constant;

import com.itbs.persistence.mapper.*;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by shaoxuhang on 20/11/28.
 */
public class BaseDb {
    @Autowired
    public TBasicCompanyMapper tBasicCompanyMapper;

    @Autowired
    public TBasicDepartmentMapper tBasicDepartmentMapper;

    @Autowired
    public TBasicRoleMapper tBasicRoleMapper;

    @Autowired
    public TBasicSkuMapper tBasicSkuMapper;

    @Autowired
    public TBasicSpuMapper tBasicSpuMapper;

    @Autowired
    public TBasicUserMapper tBasicUserMapper;

    @Autowired
    public TCenterRoleMapper tCenterRoleMapper;

    @Autowired
    public TCenterPandianMapper tCenterPandianMapper;

    @Autowired
    public TCenterPandianDetailMapper tCenterPandianDetailMapper;

    @Autowired
    public TCenterResourceMapper tCenterResourceMapper;

    @Autowired
    public TDdApplyMapper tDdApplyMapper;
}
