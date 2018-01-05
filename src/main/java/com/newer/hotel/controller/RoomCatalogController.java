package com.newer.hotel.controller;

import com.newer.hotel.bean.RoomCatalog;
import com.newer.hotel.service.RoomCatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/rc")
public class RoomCatalogController {

    @Autowired
    private RoomCatalogService roomCatalogService;

    @ResponseBody
    @RequestMapping("/findAll")
    public Map<String,Object> findAll(){
        List<RoomCatalog> list=roomCatalogService.findAll();
        Map<String,Object> maps=new HashMap<String, Object>();
        maps.put("data",list);
        return maps;
    }
}
