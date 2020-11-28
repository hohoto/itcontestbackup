package com.itbs.persistence.mapper;

import com.itbs.persistence.entity.TDdApply;
import com.itbs.persistence.entity.TDdApplyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TDdApplyMapper {
    long countByExample(TDdApplyExample example);

    int deleteByExample(TDdApplyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TDdApply record);

    int insertSelective(TDdApply record);

    List<TDdApply> selectByExample(TDdApplyExample example);

    TDdApply selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TDdApply record, @Param("example") TDdApplyExample example);

    int updateByExample(@Param("record") TDdApply record, @Param("example") TDdApplyExample example);

    int updateByPrimaryKeySelective(TDdApply record);

    int updateByPrimaryKey(TDdApply record);
}