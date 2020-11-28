package com.itbs.persistence.mapper;

import com.itbs.persistence.entity.TCenterPandianDetail;
import com.itbs.persistence.entity.TCenterPandianDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCenterPandianDetailMapper {
    long countByExample(TCenterPandianDetailExample example);

    int deleteByExample(TCenterPandianDetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TCenterPandianDetail record);

    int insertSelective(TCenterPandianDetail record);

    List<TCenterPandianDetail> selectByExample(TCenterPandianDetailExample example);

    TCenterPandianDetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TCenterPandianDetail record, @Param("example") TCenterPandianDetailExample example);

    int updateByExample(@Param("record") TCenterPandianDetail record, @Param("example") TCenterPandianDetailExample example);

    int updateByPrimaryKeySelective(TCenterPandianDetail record);

    int updateByPrimaryKey(TCenterPandianDetail record);
}