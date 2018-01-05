package com.newer.hotel.service;

import com.newer.hotel.bean.RoomCatalog;
import com.newer.hotel.dao.RoomCatalogMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("roomCatalogService")
@Transactional(propagation = Propagation.NOT_SUPPORTED,readOnly = true)
public class RoomCatalogServiceImpl implements RoomCatalogService{

    @Autowired
    private RoomCatalogMapper roomCatalogMapper;

    public List<RoomCatalog> findAll() {
        return roomCatalogMapper.findAll();
    }

    public RoomCatalog findById(int rcId) {
        return roomCatalogMapper.findById(rcId);
    }

    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class,isolation = Isolation.DEFAULT)
    public int addRoomCatalog(RoomCatalog roomCatalog) {
        return roomCatalogMapper.addRoomCatalog(roomCatalog);
    }

    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class,isolation = Isolation.DEFAULT)
    public int updateRoomCatalog(RoomCatalog roomCatalog) {
        return roomCatalogMapper.updateRoomCatalog(roomCatalog);
    }

    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class,isolation = Isolation.DEFAULT)
    public int deleteRoomCatalog(int rcId) {
        return roomCatalogMapper.deleteRoomCatalog(rcId);
    }
}
