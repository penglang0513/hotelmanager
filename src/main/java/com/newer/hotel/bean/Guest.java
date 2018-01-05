package com.newer.hotel.bean;

import java.io.Serializable;
import java.sql.Timestamp;

public class Guest implements Serializable{

    private Integer gtId;
    private String gtName;
    private String gtType;
    private String gtCardCatalog;
    private String gtCardId;
    private String gtCountry;
    private String gtAddress;
    private String gtZip;
    private String gtCompany;
    private String gtTelephone;
    private String gtMobile;
    private String gtGender;
    private String gtEmail;
    private Timestamp gtCreateTime;

    public Integer getGtId() {
        return gtId;
    }

    public void setGtId(Integer gtId) {
        this.gtId = gtId;
    }

    public String getGtName() {
        return gtName;
    }

    public void setGtName(String gtName) {
        this.gtName = gtName;
    }

    public String getGtType() {
        return gtType;
    }

    public void setGtType(String gtType) {
        this.gtType = gtType;
    }

    public String getGtCardCatalog() {
        return gtCardCatalog;
    }

    public void setGtCardCatalog(String gtCardCatalog) {
        this.gtCardCatalog = gtCardCatalog;
    }

    public String getGtCardId() {
        return gtCardId;
    }

    public void setGtCardId(String gtCardId) {
        this.gtCardId = gtCardId;
    }

    public String getGtCountry() {
        return gtCountry;
    }

    public void setGtCountry(String gtCountry) {
        this.gtCountry = gtCountry;
    }

    public String getGtAddress() {
        return gtAddress;
    }

    public void setGtAddress(String gtAddress) {
        this.gtAddress = gtAddress;
    }

    public String getGtZip() {
        return gtZip;
    }

    public void setGtZip(String gtZip) {
        this.gtZip = gtZip;
    }

    public String getGtCompany() {
        return gtCompany;
    }

    public void setGtCompany(String gtCompany) {
        this.gtCompany = gtCompany;
    }

    public String getGtTelephone() {
        return gtTelephone;
    }

    public void setGtTelephone(String gtTelephone) {
        this.gtTelephone = gtTelephone;
    }

    public String getGtMobile() {
        return gtMobile;
    }

    public void setGtMobile(String gtMobile) {
        this.gtMobile = gtMobile;
    }

    public String getGtGender() {
        return gtGender;
    }

    public void setGtGender(String gtGender) {
        this.gtGender = gtGender;
    }

    public String getGtEmail() {
        return gtEmail;
    }

    public void setGtEmail(String gtEmail) {
        this.gtEmail = gtEmail;
    }

    public Timestamp getGtCreateTime() {
        return gtCreateTime;
    }

    public void setGtCreateTime(Timestamp gtCreateTime) {
        this.gtCreateTime = gtCreateTime;
    }
}
