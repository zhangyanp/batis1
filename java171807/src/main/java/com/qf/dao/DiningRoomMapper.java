package com.qf.dao;

import com.qf.pojo.DiningRoom;
import com.qf.pojo.DiningRoomExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DiningRoomMapper {
    long countByExample(DiningRoomExample example);

    int deleteByExample(DiningRoomExample example);

    int deleteByPrimaryKey(Long roomId);

    int insert(DiningRoom record);

    int insertSelective(DiningRoom record);

    List<DiningRoom> selectByExample(DiningRoomExample example);

    DiningRoom selectByPrimaryKey(Long roomId);

    int updateByExampleSelective(@Param("record") DiningRoom record, @Param("example") DiningRoomExample example);

    int updateByExample(@Param("record") DiningRoom record, @Param("example") DiningRoomExample example);

    int updateByPrimaryKeySelective(DiningRoom record);

    int updateByPrimaryKey(DiningRoom record);
}