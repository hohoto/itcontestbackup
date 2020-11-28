package com.itbs.service;

import com.itbs.persistence.entity.*;

import java.util.List;

/**
 * Created by shaoxuhang on 20/11/28.
 */
public interface ItMatchDaoServiceI {

    int insertTBasicCompany(TBasicCompany param);
    int inertTBasicDepartment(TBasicDepartment param);
    int insertTBasicRole(TBasicRole param);
    int insertTBasicSku(TBasicSku param);
    int insertTBasicSpu(TBasicSpu param);
    int insertTBasicUser(TBasicUser param);
    int insertTCenterRole(TCenterRole param);
    int insertTCenterPandian(TCenterPandian param);
    int insertTCenterPandianDetail(TCenterPandianDetail param);
    int insertTCenterResource(TCenterResource param);
    int insertTDdApply(TDdApply param);
    int updateTBasicCompanySelective(TBasicCompany param, TBasicCompanyExample example);
    int updateTBasicCompanyByPrimaryKeySelective(TBasicCompany record);
    int updateTBasicDepartmentSelective(TBasicDepartment param, TBasicDepartmentExample example);
    int updateTBasicDepartmentByPrimaryKeySelective(TBasicDepartment record);
    int updateTBasicRoleSelective(TBasicRole param, TBasicRoleExample example);
    int updateTBasicRoleByPrimaryKeySelective(TBasicRole record);
    int updateTBasicSkuSelective(TBasicSku param, TBasicSkuExample example);
    int updateTBasicSkuByPrimaryKeySelective(TBasicSku record);
    int updateTBasicSpuSelective(TBasicSpu param, TBasicSpuExample example);
    int updateTBasicSpuByPrimaryKeySelective(TBasicSpu record);
    int updateTBasicUserSelective(TBasicUser param, TBasicUserExample example);
    int updateTBasicUserByPrimaryKeySelective(TBasicUser record);
    int updateTCenterRoleSelective(TCenterRole param, TCenterRoleExample example);
    int updateTCenterRoleByPrimaryKeySelective(TCenterRole record);
    int updateTCenterPandianSelective(TCenterPandian param, TCenterPandianExample example);
    int updateTCenterPandianByPrimaryKeySelective(TCenterPandian record);
    int updateTCenterPandianDetailSelective(TCenterPandianDetail param, TCenterPandianDetailExample example);
    int updateTCenterPandianDetailByPrimaryKeySelective(TCenterPandianDetail record);
    int updateTCenterResourceSelective(TCenterResource param, TCenterResourceExample example);
    int updateTCenterResourceByPrimaryKeySelective(TCenterResource record);
    int updateTDdApplySelective(TDdApply param, TDdApplyExample example);
    int updateTDdApplyByPrimaryKeySelective(TDdApply record);
    List<TBasicCompany> selectTBasicCompany(TBasicCompanyExample example);
    TBasicCompany selectTBasicCompanyByPrimaryKey(Integer id);
    List<TBasicDepartment> selectTBasicDepartment(TBasicDepartmentExample example);
    TBasicDepartment selectTBasicDepartmentByPrimaryKey(Integer id);
    List<TBasicRole> selectTBasicRole(TBasicRoleExample example);
    TBasicRole selectTBasicRoleByPrimaryKey(Integer id);
    List<TBasicSku> selectTBasicSku(TBasicSkuExample example);
    TBasicSku selectTBasicSkuByPrimaryKey(Integer id);
    List<TBasicSpu> selectTBasicSpu(TBasicSpuExample example);
    TBasicSpu selectTBasicSpuByPrimaryKey(Integer id);
    List<TBasicUser> selectTBasicUser(TBasicUserExample example);
    TBasicUser selectTBasicUserByPrimaryKey(Integer id);
    List<TCenterRole> selectTCenterRole(TCenterRoleExample example);
    TCenterRole selectTCenterRoleByPrimaryKey(Integer id);
    List<TCenterPandian> selectTCenterPandian(TCenterPandianExample example);
    TCenterPandian selectTCenterPandianByPrimaryKey(Integer id);
    List<TCenterPandianDetail> selectTCenterPandianDetail(TCenterPandianDetailExample example);
    TCenterPandianDetail selectTCenterPandianDetailByPrimaryKey(Integer id);
    List<TCenterResource> selectTCenterResource(TCenterResourceExample example);
    TCenterResource selectTCenterResourceByPrimaryKey(Integer id);
    List<TDdApply> selectTDdApply(TDdApplyExample example);
    TDdApply selectTDdApplyByPrimaryKey(Integer id);






}
