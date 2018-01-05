package com.newer.hotel.service;

import com.newer.hotel.bean.RoomCatalog;

import java.util.List;

public interface RoomCatalogService {

    List<RoomCatalog> findAll();

    RoomCatalog findById(int rcId);

    int addRoomCatalog(RoomCatalog roomCatalog);

    int updateRoomCatalog(RoomCatalog roomCatalog);

    int deleteRoomCatalog(int rcId);
}
