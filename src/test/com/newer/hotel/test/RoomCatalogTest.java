package com.newer.hotel.test;

import com.newer.hotel.bean.RoomCatalog;
import com.newer.hotel.service.RoomCatalogService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class RoomCatalogTest {

    @Test
    public void test1(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        RoomCatalogService service=ctx.getBean("roomCatalogService",RoomCatalogService.class);

        RoomCatalog rc=new RoomCatalog();
        rc.setRcName("标准间");
        rc.setRcBedNumber("2");
        rc.setRcPrePrice(260.00);
        rc.setRcPreDiscount(40.00);
        rc.setRcHourBasePrice(150.00);
        rc.setRcPerHourPrice(40.00);
        int row=service.addRoomCatalog(rc);
        System.out.println(row);
    }

    @Test
    public void test2(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        RoomCatalogService service=ctx.getBean("roomCatalogService",RoomCatalogService.class);

        RoomCatalog rc=service.findById(1);
        rc.setRcPreDiscount(10.00);
        System.out.println(service.updateRoomCatalog(rc));
    }

    @Test
    public void test3(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        RoomCatalogService service=ctx.getBean("roomCatalogService",RoomCatalogService.class);

        List<RoomCatalog> list=service.findAll();
        System.out.println(list.get(0).getRcName());
    }

    @Test
    public void test4(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        RoomCatalogService service=ctx.getBean("roomCatalogService",RoomCatalogService.class);

        System.out.println(service.deleteRoomCatalog(1));
    }


}
