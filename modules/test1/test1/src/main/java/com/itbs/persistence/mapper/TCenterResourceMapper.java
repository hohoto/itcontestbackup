package com.itbs.persistence.mapper;

import com.itbs.persistence.entity.TCenterResource;
import com.itbs.persistence.entity.TCenterResourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCenterResourceMapper {
    long countByExample(TCenterResourceExample example);

    int deleteByExample(TCenterResourceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TCenterResource record);

    int insertSelective(TCenterResource record);

    List<TCenterResource> selectByExample(TCenterResourceExample example);

    TCenterResource selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TCenterResource record, @Param("example") TCenterResourceExample example);

    int updateByExample(@Param("record") TCenterResource record, @Param("example") TCenterResourceExample example);

    int updateByPrimaryKeySelective(TCenterResource record);

    int updateByPrimaryKey(TCenterResource record);
}