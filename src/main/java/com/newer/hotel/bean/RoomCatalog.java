package com.newer.hotel.bean;

import java.io.Serializable;

public class RoomCatalog implements Serializable{

    private Integer rcId;
    private String rcName;
    private String rcBedNumber;
    private Double rcPrePrice;
    private Double rcPreDiscount;
    private Double rcHourBasePrice;
    private Double rcPerHourPrice;

    public Integer getRcId() {
        return rcId;
    }

    public void setRcId(Integer rcId) {
        this.rcId = rcId;
    }

    public String getRcName() {
        return rcName;
    }

    public void setRcName(String rcName) {
        this.rcName = rcName;
    }

    public String getRcBedNumber() {
        return rcBedNumber;
    }

    public void setRcBedNumber(String rcBedNumber) {
        this.rcBedNumber = rcBedNumber;
    }

    public Double getRcPrePrice() {
        return rcPrePrice;
    }

    public void setRcPrePrice(Double rcPrePrice) {
        this.rcPrePrice = rcPrePrice;
    }

    public Double getRcPreDiscount() {
        return rcPreDiscount;
    }

    public void setRcPreDiscount(Double rcPreDiscount) {
        this.rcPreDiscount = rcPreDiscount;
    }

    public Double getRcHourBasePrice() {
        return rcHourBasePrice;
    }

    public void setRcHourBasePrice(Double rcHourBasePrice) {
        this.rcHourBasePrice = rcHourBasePrice;
    }

    public Double getRcPerHourPrice() {
        return rcPerHourPrice;
    }

    public void setRcPerHourPrice(Double rcPerHourPrice) {
        this.rcPerHourPrice = rcPerHourPrice;
    }
}
