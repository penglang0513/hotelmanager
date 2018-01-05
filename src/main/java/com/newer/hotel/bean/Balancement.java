package com.newer.hotel.bean;

import java.io.Serializable;
import java.sql.Timestamp;

public class Balancement implements Serializable{

    private Integer bmId;
    private Integer bmCheckInOrderId;
    private Integer bmGuestId;
    private String bmType;
    private Double bmTotalRate;
    private Double bmPaidMoney;
    private Double bmReceivMoney;
    private Timestamp bmCreateTime;
    private String bmOperator;
    private String bmPaymentModel;
    private String bmRemark;

    public Integer getBmId() {
        return bmId;
    }

    public void setBmId(Integer bmId) {
        this.bmId = bmId;
    }

    public Integer getBmCheckInOrderId() {
        return bmCheckInOrderId;
    }

    public void setBmCheckInOrderId(Integer bmCheckInOrderId) {
        this.bmCheckInOrderId = bmCheckInOrderId;
    }

    public Integer getBmGuestId() {
        return bmGuestId;
    }

    public void setBmGuestId(Integer bmGuestId) {
        this.bmGuestId = bmGuestId;
    }

    public String getBmType() {
        return bmType;
    }

    public void setBmType(String bmType) {
        this.bmType = bmType;
    }

    public Double getBmTotalRate() {
        return bmTotalRate;
    }

    public void setBmTotalRate(Double bmTotalRate) {
        this.bmTotalRate = bmTotalRate;
    }

    public Double getBmPaidMoney() {
        return bmPaidMoney;
    }

    public void setBmPaidMoney(Double bmPaidMoney) {
        this.bmPaidMoney = bmPaidMoney;
    }

    public Double getBmReceivMoney() {
        return bmReceivMoney;
    }

    public void setBmReceivMoney(Double bmReceivMoney) {
        this.bmReceivMoney = bmReceivMoney;
    }

    public Timestamp getBmCreateTime() {
        return bmCreateTime;
    }

    public void setBmCreateTime(Timestamp bmCreateTime) {
        this.bmCreateTime = bmCreateTime;
    }

    public String getBmOperator() {
        return bmOperator;
    }

    public void setBmOperator(String bmOperator) {
        this.bmOperator = bmOperator;
    }

    public String getBmPaymentModel() {
        return bmPaymentModel;
    }

    public void setBmPaymentModel(String bmPaymentModel) {
        this.bmPaymentModel = bmPaymentModel;
    }

    public String getBmRemark() {
        return bmRemark;
    }

    public void setBmRemark(String bmRemark) {
        this.bmRemark = bmRemark;
    }
}
