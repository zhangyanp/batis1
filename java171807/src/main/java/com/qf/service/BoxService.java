package com.qf.service;

import com.qf.dto.BoxDTO;
import com.qf.pojo.DiningRoom;

import java.util.List;

/**
 * Created by Administrator on 2018/3/26 0026.
 */
public interface BoxService {

    public int updateStatus(DiningRoom diningRoom);

    public DiningRoom findById(Long roomId);

    public List<BoxDTO> findAll();

}
