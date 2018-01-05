package com.newer.hotel.dao;

import com.newer.hotel.bean.RoomCatalog;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("roomCatalogMapper")
public interface RoomCatalogMapper {

    @Select("select * from tb_roomcatalog")
    List<RoomCatalog> findAll();

    @Select("select * from tb_roomcatalog where rcid=#{rcId}")
    RoomCatalog findById(@Param("rcId") int rcId);

    @Insert("insert into tb_roomcatalog(rcname,rcbednumber,rcpreprice,rcprediscount," +
            "rchourbaseprice,rcperhourprice)values(#{rcName},#{rcBedNumber},#{rcPrePrice}," +
            "#{rcPreDiscount},#{rcHourBasePrice},#{rcPerHourPrice})")
    int addRoomCatalog(RoomCatalog roomCatalog);

    @Update("update tb_roomcatalog set rcname=#{rcName},rcbednumber=#{rcBedNumber}," +
            "rcpreprice=#{rcPrePrice},rcprediscount=#{rcPreDiscount},rchourbaseprice=#{rcHourBasePrice}" +
            ",rcperhourprice=#{rcPerHourPrice} where rcid=#{rcId}")
    int updateRoomCatalog(RoomCatalog roomCatalog);

    @Delete("delete from tb_roomcatalog where rcid=#{rcId}")
    int deleteRoomCatalog(@Param("rcId")int rcId);
}
