package com.itbs.service.impl;

import com.itbs.constant.BaseDb;
import com.itbs.persistence.entity.*;
import com.itbs.persistence.mapper.TCenterPandianMapper;
import com.itbs.service.ItMatchDaoServiceI;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;


/**
 * Created by shaoxuhang on 20/11/28.
 */
@Service("ItMatchDaoServiceImpl")
public class ItMatchDaoServiceImpl extends BaseDb implements ItMatchDaoServiceI{


    /** standard insert */
    @Override
    public int insertTBasicCompany(TBasicCompany param){
        return tBasicCompanyMapper.insertSelective(param);
    }

    @Override
    public int inertTBasicDepartment(TBasicDepartment param){
        return tBasicDepartmentMapper.insertSelective(param);
    }

    @Override
    public int insertTBasicRole(TBasicRole param){
        return tBasicRoleMapper.insertSelective(param);
    }

    @Override
    public int insertTBasicSku(TBasicSku param){
        return tBasicSkuMapper.insertSelective(param);
    }

    @Override
    public int insertTBasicSpu(TBasicSpu param){
        return tBasicSpuMapper.insertSelective(param);
    }

    @Override
    public int insertTBasicUser(TBasicUser param){
        return tBasicUserMapper.insertSelective(param);
    }

    @Override
    public int insertTCenterRole(TCenterRole param){
        return tCenterRoleMapper.insertSelective(param);
    }

    @Override
    public int insertTCenterPandian(TCenterPandian param){
        return tCenterPandianMapper.insertSelective(param);
    }

    @Override
    public int insertTCenterPandianDetail(TCenterPandianDetail param){
        return tCenterPandianDetailMapper.insertSelective(param);
    }

    @Override
    public int insertTCenterResource(TCenterResource param){
        return tCenterResourceMapper.insertSelective(param);
    }

    @Override
    public int insertTDdApply(TDdApply param){
        return tDdApplyMapper.insertSelective(param);
    }

    /** standard update */
    @Override
    public int updateTBasicCompanySelective(TBasicCompany param, TBasicCompanyExample example){
        return tBasicCompanyMapper.updateByExampleSelective(param, example);
    }

    @Override
    public int updateTBasicCompanyByPrimaryKeySelective(TBasicCompany record) {
        return tBasicCompanyMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateTBasicDepartmentSelective(TBasicDepartment param, TBasicDepartmentExample example){
        return tBasicDepartmentMapper.updateByExampleSelective(param, example);
    }

    @Override
    public int updateTBasicDepartmentByPrimaryKeySelective(TBasicDepartment record) {
        return tBasicDepartmentMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateTBasicRoleSelective(TBasicRole param, TBasicRoleExample example){
        return tBasicRoleMapper.updateByExampleSelective(param, example);
    }

    @Override
    public int updateTBasicRoleByPrimaryKeySelective(TBasicRole record) {
        return tBasicRoleMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateTBasicSkuSelective(TBasicSku param, TBasicSkuExample example){
        return tBasicSkuMapper.updateByExampleSelective(param, example);
    }

    @Override
    public int updateTBasicSkuByPrimaryKeySelective(TBasicSku record) {
        return tBasicSkuMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateTBasicSpuSelective(TBasicSpu param, TBasicSpuExample example){
        return tBasicSpuMapper.updateByExampleSelective(param, example);
    }

    @Override
    public int updateTBasicSpuByPrimaryKeySelective(TBasicSpu record) {
        return tBasicSpuMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateTBasicUserSelective(TBasicUser param, TBasicUserExample example){
        return tBasicUserMapper.updateByExampleSelective(param, example);
    }

    @Override
    public int updateTBasicUserByPrimaryKeySelective(TBasicUser record) {
        return tBasicUserMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateTCenterRoleSelective(TCenterRole param, TCenterRoleExample example){
        return tCenterRoleMapper.updateByExampleSelective(param, example);
    }

    @Override
    public int updateTCenterRoleByPrimaryKeySelective(TCenterRole record) {
        return tCenterRoleMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateTCenterPandianSelective(TCenterPandian param, TCenterPandianExample example){
        return tCenterPandianMapper.updateByExampleSelective(param, example);
    }

    @Override
    public int updateTCenterPandianByPrimaryKeySelective(TCenterPandian record) {
        return tCenterPandianMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateTCenterPandianDetailSelective(TCenterPandianDetail param, TCenterPandianDetailExample example){
        return tCenterPandianDetailMapper.updateByExampleSelective(param, example);
    }

    @Override
    public int updateTCenterPandianDetailByPrimaryKeySelective(TCenterPandianDetail record) {
        return tCenterPandianDetailMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateTCenterResourceSelective(TCenterResource param, TCenterResourceExample example){
        return tCenterResourceMapper.updateByExampleSelective(param, example);
    }

    @Override
    public int updateTCenterResourceByPrimaryKeySelective(TCenterResource record) {
        return tCenterResourceMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateTDdApplySelective(TDdApply param, TDdApplyExample example){
        return tDdApplyMapper.updateByExampleSelective(param, example);
    }

    @Override
    public int updateTDdApplyByPrimaryKeySelective(TDdApply record) {
        return tDdApplyMapper.updateByPrimaryKeySelective(record);
    }

    /** standard select */
    @Override
    public List<TBasicCompany> selectTBasicCompany(TBasicCompanyExample example){
        return tBasicCompanyMapper.selectByExample(example);
    }

    @Override
    public TBasicCompany selectTBasicCompanyByPrimaryKey(Integer id){
        return tBasicCompanyMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<TBasicDepartment> selectTBasicDepartment(TBasicDepartmentExample example){
        return tBasicDepartmentMapper.selectByExample(example);
    }

    @Override
    public TBasicDepartment selectTBasicDepartmentByPrimaryKey(Integer id){
        return tBasicDepartmentMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<TBasicRole> selectTBasicRole(TBasicRoleExample example){
        return tBasicRoleMapper.selectByExample(example);
    }

    @Override
    public TBasicRole selectTBasicRoleByPrimaryKey(Integer id){
        return tBasicRoleMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<TBasicSku> selectTBasicSku(TBasicSkuExample example){
        return tBasicSkuMapper.selectByExample(example);
    }

    @Override
    public TBasicSku selectTBasicSkuByPrimaryKey(Integer id){
        return tBasicSkuMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<TBasicSpu> selectTBasicSpu(TBasicSpuExample example){
        return tBasicSpuMapper.selectByExample(example);
    }

    @Override
    public TBasicSpu selectTBasicSpuByPrimaryKey(Integer id){
        return tBasicSpuMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<TBasicUser> selectTBasicUser(TBasicUserExample example){
        return tBasicUserMapper.selectByExample(example);
    }

    @Override
    public TBasicUser selectTBasicUserByPrimaryKey(Integer id){
        return tBasicUserMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<TCenterRole> selectTCenterRole(TCenterRoleExample example){
        return tCenterRoleMapper.selectByExample(example);
    }

    @Override
    public TCenterRole selectTCenterRoleByPrimaryKey(Integer id){
        return tCenterRoleMapper.selectByPrimaryKey(id);
    }


    @Override
    public List<TCenterPandian> selectTCenterPandian(TCenterPandianExample example){
        return tCenterPandianMapper.selectByExample(example);
    }

    @Override
    public TCenterPandian selectTCenterPandianByPrimaryKey(Integer id){
        return tCenterPandianMapper.selectByPrimaryKey(id);
    }



    @Override
    public List<TCenterPandianDetail> selectTCenterPandianDetail(TCenterPandianDetailExample example){
        return tCenterPandianDetailMapper.selectByExample(example);
    }

    @Override
    public TCenterPandianDetail selectTCenterPandianDetailByPrimaryKey(Integer id){
        return tCenterPandianDetailMapper.selectByPrimaryKey(id);
    }



    @Override
    public List<TCenterResource> selectTCenterResource(TCenterResourceExample example){
        return tCenterResourceMapper.selectByExample(example);
    }

    @Override
    public TCenterResource selectTCenterResourceByPrimaryKey(Integer id){
        return tCenterResourceMapper.selectByPrimaryKey(id);
    }




    @Override
    public List<TDdApply> selectTDdApply(TDdApplyExample example){
        return tDdApplyMapper.selectByExample(example);
    }

    @Override
    public TDdApply selectTDdApplyByPrimaryKey(Integer id){
        return tDdApplyMapper.selectByPrimaryKey(id);
    }


}
