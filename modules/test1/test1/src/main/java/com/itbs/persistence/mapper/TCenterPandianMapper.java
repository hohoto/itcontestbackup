package com.itbs.persistence.mapper;

import com.itbs.persistence.entity.TCenterPandian;
import com.itbs.persistence.entity.TCenterPandianExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCenterPandianMapper {
    long countByExample(TCenterPandianExample example);

    int deleteByExample(TCenterPandianExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TCenterPandian record);

    int insertSelective(TCenterPandian record);

    List<TCenterPandian> selectByExample(TCenterPandianExample example);

    TCenterPandian selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TCenterPandian record, @Param("example") TCenterPandianExample example);

    int updateByExample(@Param("record") TCenterPandian record, @Param("example") TCenterPandianExample example);

    int updateByPrimaryKeySelective(TCenterPandian record);

    int updateByPrimaryKey(TCenterPandian record);
}