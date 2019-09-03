package com.test.mapper;

import com.test.pojo.Apply;
import com.test.pojo.ApplyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApplyMapper {
    long countByExample(ApplyExample example);

    int deleteByExample(ApplyExample example);

    int deleteByPrimaryKey(Integer aid);

    int insert(Apply record);

    int insertSelective(Apply record);

    int selectcount(String sid);

    List<Apply> selectByExample(ApplyExample example);

    List<Apply> list(@Param("apply")Apply apply);

    Apply selectByPrimaryKey(Integer aid);

    int updateByExampleSelective(@Param("record") Apply record, @Param("example") ApplyExample example);

    int updateByExample(@Param("record") Apply record, @Param("example") ApplyExample example);

    int updateByPrimaryKeySelective(Apply record);

    int updateByPrimaryKey(Apply record);
}