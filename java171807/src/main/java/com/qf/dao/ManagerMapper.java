package com.qf.dao;

import com.qf.pojo.Manager;
import com.qf.pojo.ManagerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ManagerMapper {
    long countByExample(ManagerExample example);

    int deleteByExample(ManagerExample example);

    int deleteByPrimaryKey(Long managerId);

    int insert(Manager record);

    int insertSelective(Manager record);

    List<Manager> selectByExample(ManagerExample example);

    Manager selectByPrimaryKey(Long managerId);

    int updateByExampleSelective(@Param("record") Manager record, @Param("example") ManagerExample example);

    int updateByExample(@Param("record") Manager record, @Param("example") ManagerExample example);

    int updateByPrimaryKeySelective(Manager record);

    int updateByPrimaryKey(Manager record);
}