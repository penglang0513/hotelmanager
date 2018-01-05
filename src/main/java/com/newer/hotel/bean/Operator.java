package com.newer.hotel.bean;

import java.io.Serializable;
import java.sql.Timestamp;

public class Operator implements Serializable{

    public static final int PRIVILEGE_USER=0;
    public static final int PRIVILEGE_ADMIN=0xff;

    private String opUserName;
    private String opPassword;
    private Integer opPrivilege;
    private String opAddress;
    private String opName;
    private String opTelephone;
    private String opMobile;
    private String opZip;
    private Timestamp opCreateTime;

    public String getOpUserName() {
        return opUserName;
    }

    public void setOpUserName(String opUserName) {
        this.opUserName = opUserName;
    }

    public String getOpPassword() {
        return opPassword;
    }

    public void setOpPassword(String opPassword) {
        this.opPassword = opPassword;
    }

    public Integer getOpPrivilege() {
        return opPrivilege;
    }

    public void setOpPrivilege(Integer opPrivilege) {
        this.opPrivilege = opPrivilege;
    }

    public String getOpAddress() {
        return opAddress;
    }

    public void setOpAddress(String opAddress) {
        this.opAddress = opAddress;
    }

    public String getOpName() {
        return opName;
    }

    public void setOpName(String opName) {
        this.opName = opName;
    }

    public String getOpTelephone() {
        return opTelephone;
    }

    public void setOpTelephone(String opTelephone) {
        this.opTelephone = opTelephone;
    }

    public String getOpMobile() {
        return opMobile;
    }

    public void setOpMobile(String opMobile) {
        this.opMobile = opMobile;
    }

    public String getOpZip() {
        return opZip;
    }

    public void setOpZip(String opZip) {
        this.opZip = opZip;
    }

    public Timestamp getOpCreateTime() {
        return opCreateTime;
    }

    public void setOpCreateTime(Timestamp opCreateTime) {
        this.opCreateTime = opCreateTime;
    }
}
