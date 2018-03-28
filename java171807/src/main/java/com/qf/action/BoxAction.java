package com.qf.action;

import com.qf.dto.BoxDTO;
import com.qf.pojo.DiningRoom;
import com.qf.service.BoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by Administrator on 2018/3/26 0026.
 */
@Controller
public class BoxAction {

    @Autowired
    private BoxService boxService;

    @RequestMapping("/updateBox.do")
    public String updateBox(HttpServletRequest request){
        String roomId = request.getParameter("roomId");
        String roomStatus = request.getParameter("roomStatus");

        DiningRoom byId = boxService.findById(Long.parseLong(roomId));
        DiningRoom diningRoom = new DiningRoom();
        diningRoom.setRoomId(Long.parseLong(roomId));
        diningRoom.setRoomName(byId.getRoomName());
        diningRoom.setRoomStatus(Integer.parseInt(roomStatus));
        boxService.updateStatus(diningRoom);
        return "redrect:/listBox.do";
    }

    @RequestMapping("/listBox.do")
    public ModelAndView listBox(HttpServletRequest request){
        ModelAndView mv = new ModelAndView();
        List<BoxDTO> all = boxService.findAll();
        mv.addObject("listBox",all);
        mv.setViewName("/listBox.jsp");
        return mv;
    }

}
