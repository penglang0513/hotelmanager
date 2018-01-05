package com.newer.hotel.bean;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

public class CheckInOrder implements Serializable{

        private Integer cioId;
        private List<CheckInItem> checkInItems;
        private String cioGuestName;
        private Integer cioManNumber;
        private String cioGuestCatalog;
        private String cioGuestType;
        private String cioGroupName;
        private String cioGuestCardCatalog;
        private String cioGuestCardId;
        private String cioCause;
        private String cioState;
        private Timestamp cioInDateTime;
        private Timestamp cioPreOutDateTime;
        private Timestamp cioPrctOutDateTime;
        private String cioPaymentModel;
        private Double cioPaidMoney;
        private String cioIsReservId;
        private String cioOperator;
        private String cioGuestGender;
        private Double cioTotalRate;
        private Double cioBedRate;
        private String cioOrderId;

    public Integer getCioId() {
        return cioId;
    }

    public void setCioId(Integer cioId) {
        this.cioId = cioId;
    }

    public List<CheckInItem> getCheckInItems() {
        return checkInItems;
    }

    public void setCheckInItems(List<CheckInItem> checkInItems) {
        this.checkInItems = checkInItems;
    }

    public String getCioGuestName() {
        return cioGuestName;
    }

    public void setCioGuestName(String cioGuestName) {
        this.cioGuestName = cioGuestName;
    }

    public Integer getCioManNumber() {
        return cioManNumber;
    }

    public void setCioManNumber(Integer cioManNumber) {
        this.cioManNumber = cioManNumber;
    }

    public String getCioGuestCatalog() {
        return cioGuestCatalog;
    }

    public void setCioGuestCatalog(String cioGuestCatalog) {
        this.cioGuestCatalog = cioGuestCatalog;
    }

    public String getCioGuestType() {
        return cioGuestType;
    }

    public void setCioGuestType(String cioGuestType) {
        this.cioGuestType = cioGuestType;
    }

    public String getCioGroupName() {
        return cioGroupName;
    }

    public void setCioGroupName(String cioGroupName) {
        this.cioGroupName = cioGroupName;
    }

    public String getCioGuestCardCatalog() {
        return cioGuestCardCatalog;
    }

    public void setCioGuestCardCatalog(String cioGuestCardCatalog) {
        this.cioGuestCardCatalog = cioGuestCardCatalog;
    }

    public String getCioGuestCardId() {
        return cioGuestCardId;
    }

    public void setCioGuestCardId(String cioGuestCardId) {
        this.cioGuestCardId = cioGuestCardId;
    }

    public String getCioCause() {
        return cioCause;
    }

    public void setCioCause(String cioCause) {
        this.cioCause = cioCause;
    }

    public String getCioState() {
        return cioState;
    }

    public void setCioState(String cioState) {
        this.cioState = cioState;
    }

    public Timestamp getCioInDateTime() {
        return cioInDateTime;
    }

    public void setCioInDateTime(Timestamp cioInDateTime) {
        this.cioInDateTime = cioInDateTime;
    }

    public Timestamp getCioPreOutDateTime() {
        return cioPreOutDateTime;
    }

    public void setCioPreOutDateTime(Timestamp cioPreOutDateTime) {
        this.cioPreOutDateTime = cioPreOutDateTime;
    }

    public Timestamp getCioPrctOutDateTime() {
        return cioPrctOutDateTime;
    }

    public void setCioPrctOutDateTime(Timestamp cioPrctOutDateTime) {
        this.cioPrctOutDateTime = cioPrctOutDateTime;
    }

    public String getCioPaymentModel() {
        return cioPaymentModel;
    }

    public void setCioPaymentModel(String cioPaymentModel) {
        this.cioPaymentModel = cioPaymentModel;
    }

    public Double getCioPaidMoney() {
        return cioPaidMoney;
    }

    public void setCioPaidMoney(Double cioPaidMoney) {
        this.cioPaidMoney = cioPaidMoney;
    }

    public String getCioIsReservId() {
        return cioIsReservId;
    }

    public void setCioIsReservId(String cioIsReservId) {
        this.cioIsReservId = cioIsReservId;
    }

    public String getCioOperator() {
        return cioOperator;
    }

    public void setCioOperator(String cioOperator) {
        this.cioOperator = cioOperator;
    }

    public String getCioGuestGender() {
        return cioGuestGender;
    }

    public void setCioGuestGender(String cioGuestGender) {
        this.cioGuestGender = cioGuestGender;
    }

    public Double getCioTotalRate() {
        return cioTotalRate;
    }

    public void setCioTotalRate(Double cioTotalRate) {
        this.cioTotalRate = cioTotalRate;
    }

    public Double getCioBedRate() {
        return cioBedRate;
    }

    public void setCioBedRate(Double cioBedRate) {
        this.cioBedRate = cioBedRate;
    }

    public String getCioOrderId() {
        return cioOrderId;
    }

    public void setCioOrderId(String cioOrderId) {
        this.cioOrderId = cioOrderId;
    }
}
