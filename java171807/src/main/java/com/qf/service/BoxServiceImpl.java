package com.qf.service;

import com.qf.dao.DiningRoomMapper;
import com.qf.dto.BoxDTO;
import com.qf.pojo.DiningRoom;
import com.qf.pojo.DiningRoomExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/3/26 0026.
 */
@Service("boxService")
public class BoxServiceImpl implements BoxService {

    @Autowired
    private DiningRoomMapper diningRoomMapper;

    @Override
    public int updateStatus(DiningRoom diningRoom) {
        int i = diningRoomMapper.updateByPrimaryKeySelective(diningRoom);
        return i;
    }

    @Override
    public DiningRoom findById(Long roomId) {
        DiningRoom pojo = diningRoomMapper.selectByPrimaryKey(roomId);
        return pojo;
    }

    @Override
    public List<BoxDTO> findAll() {
        DiningRoomExample example = new DiningRoomExample();
        List<DiningRoom> diningRooms = diningRoomMapper.selectByExample(example);
        List<BoxDTO> list = new ArrayList<BoxDTO>();
        for (DiningRoom diningRoom : diningRooms) {
            BoxDTO dto = new BoxDTO();
            dto.setRoomId(diningRoom.getRoomId().toString());
            dto.setRoomName(diningRoom.getRoomName());
            dto.setRoomStatus(diningRoom.getRoomStatus().toString());
            list.add(dto);
        }
        return list;
    }
}
