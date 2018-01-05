package com.newer.hotel.bean;

import java.io.Serializable;
import java.sql.Timestamp;

public class CheckInItem implements Serializable{

    private Integer cimId;
    private CheckInOrder checkInOrder;
    private Room room;
    private Double cimPrctPrice;
    private Double cimDiscount;
    private Timestamp cimInDatetime;
    private Timestamp cimOutDatetime;
    private String cimState;

    public Integer getCimId() {
        return cimId;
    }

    public void setCimId(Integer cimId) {
        this.cimId = cimId;
    }

    public CheckInOrder getCheckInOrder() {
        return checkInOrder;
    }

    public void setCheckInOrder(CheckInOrder checkInOrder) {
        this.checkInOrder = checkInOrder;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Double getCimPrctPrice() {
        return cimPrctPrice;
    }

    public void setCimPrctPrice(Double cimPrctPrice) {
        this.cimPrctPrice = cimPrctPrice;
    }

    public Double getCimDiscount() {
        return cimDiscount;
    }

    public void setCimDiscount(Double cimDiscount) {
        this.cimDiscount = cimDiscount;
    }

    public Timestamp getCimInDatetime() {
        return cimInDatetime;
    }

    public void setCimInDatetime(Timestamp cimInDatetime) {
        this.cimInDatetime = cimInDatetime;
    }

    public Timestamp getCimOutDatetime() {
        return cimOutDatetime;
    }

    public void setCimOutDatetime(Timestamp cimOutDatetime) {
        this.cimOutDatetime = cimOutDatetime;
    }

    public String getCimState() {
        return cimState;
    }

    public void setCimState(String cimState) {
        this.cimState = cimState;
    }
}
