package com.newer.hotel.bean;

import java.io.Serializable;

public class Room implements Serializable{

    public static final String[] STATES={"空闲","预定","租用","结账","清洁","锁房"};
    public static final String[] COLORSTATES={"#008CD2","#FF7D00","#FFE000","#E40090","#00AF4D","#E80033"};

    public static final int STATE_VACANT=0;
    public static final int STATE_RESERVED=1;
    public static final int STATE_RENTED=2;
    public static final int STATE_CHECKOUT=3;
    public static final int STATE_CLEANED=4;
    public static final int STATE_BLOCKED=5;

    private Integer rmId;
    private String rmArea;
    private String rmFloor;
    private Double rmPrctPrice;
    private String rmTelephone;
    private Integer rmState;
    private Boolean rmAvailable;
    private String rmCatalog;
    private String rmPicture;
    private Double rmPrctDiscount;

    public Integer getRmId() {
        return rmId;
    }

    public void setRmId(Integer rmId) {
        this.rmId = rmId;
    }

    public String getRmArea() {
        return rmArea;
    }

    public void setRmArea(String rmArea) {
        this.rmArea = rmArea;
    }

    public String getRmFloor() {
        return rmFloor;
    }

    public void setRmFloor(String rmFloor) {
        this.rmFloor = rmFloor;
    }

    public Double getRmPrctPrice() {
        return rmPrctPrice;
    }

    public void setRmPrctPrice(Double rmPrctPrice) {
        this.rmPrctPrice = rmPrctPrice;
    }

    public String getRmTelephone() {
        return rmTelephone;
    }

    public void setRmTelephone(String rmTelephone) {
        this.rmTelephone = rmTelephone;
    }

    public Integer getRmState() {
        return rmState;
    }

    public void setRmState(Integer rmState) {
        this.rmState = rmState;
    }

    public Boolean getRmAvailable() {
        return rmAvailable;
    }

    public void setRmAvailable(Boolean rmAvailable) {
        this.rmAvailable = rmAvailable;
    }

    public String getRmCatalog() {
        return rmCatalog;
    }

    public void setRmCatalog(String rmCatalog) {
        this.rmCatalog = rmCatalog;
    }

    public String getRmPicture() {
        return rmPicture;
    }

    public void setRmPicture(String rmPicture) {
        this.rmPicture = rmPicture;
    }

    public Double getRmPrctDiscount() {
        return rmPrctDiscount;
    }

    public void setRmPrctDiscount(Double rmPrctDiscount) {
        this.rmPrctDiscount = rmPrctDiscount;
    }
}
