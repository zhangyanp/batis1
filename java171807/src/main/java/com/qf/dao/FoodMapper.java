package com.qf.dao;

import com.qf.pojo.Food;
import com.qf.pojo.FoodExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FoodMapper {
    long countByExample(FoodExample example);

    int deleteByExample(FoodExample example);

    int deleteByPrimaryKey(Long foodId);

    int insert(Food record);

    int insertSelective(Food record);

    List<Food> selectByExampleWithBLOBs(FoodExample example);

    List<Food> selectByExample(FoodExample example);

    Food selectByPrimaryKey(Long foodId);

    int updateByExampleSelective(@Param("record") Food record, @Param("example") FoodExample example);

    int updateByExampleWithBLOBs(@Param("record") Food record, @Param("example") FoodExample example);

    int updateByExample(@Param("record") Food record, @Param("example") FoodExample example);

    int updateByPrimaryKeySelective(Food record);

    int updateByPrimaryKeyWithBLOBs(Food record);

    int updateByPrimaryKey(Food record);
}