package com.qf.dao;

import com.qf.pojo.OrderType;
import com.qf.pojo.OrderTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderTypeMapper {
    long countByExample(OrderTypeExample example);

    int deleteByExample(OrderTypeExample example);

    int deleteByPrimaryKey(Long otypeId);

    int insert(OrderType record);

    int insertSelective(OrderType record);

    List<OrderType> selectByExample(OrderTypeExample example);

    OrderType selectByPrimaryKey(Long otypeId);

    int updateByExampleSelective(@Param("record") OrderType record, @Param("example") OrderTypeExample example);

    int updateByExample(@Param("record") OrderType record, @Param("example") OrderTypeExample example);

    int updateByPrimaryKeySelective(OrderType record);

    int updateByPrimaryKey(OrderType record);
}