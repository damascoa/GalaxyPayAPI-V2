/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.galaxy.model;

/**
 *
 * @author Renato
 */
public class Transactions {

    private String myId;
    private String galaxPayId;
    private String subscriptionMyId;
    private String subscriptionGalaxPayId;
    private Boolean payedOutsideGalaxPay;
    private String chargeGalaxPayId;
    private String chargeMyId;

    private Integer value;
    private String payday;
    private String paydayDate;
    private String additionalInfo;
    private Integer installment;
    private String createdAt;
    private String status;
    private Boleto Boleto;

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public String getPayday() {
        return payday;
    }

    public void setPayday(String payday) {
        this.payday = payday;
    }

    public Integer getInstallment() {
        return installment;
    }

    public void setInstallment(Integer installment) {
        this.installment = installment;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMyId() {
        return myId;
    }

    public void setMyId(String myId) {
        this.myId = myId;
    }

    public String getGalaxPayId() {
        return galaxPayId;
    }

    public void setGalaxPayId(String galaxPayId) {
        this.galaxPayId = galaxPayId;
    }

    public String getChargeGalaxPayId() {
        return chargeGalaxPayId;
    }

    public void setChargeGalaxPayId(String chargeGalaxPayId) {
        this.chargeGalaxPayId = chargeGalaxPayId;
    }

    public String getChargeMyId() {
        return chargeMyId;
    }

    public void setChargeMyId(String chargeMyId) {
        this.chargeMyId = chargeMyId;
    }

    public String getPaydayDate() {
        return paydayDate;
    }

    public void setPaydayDate(String paydayDate) {
        this.paydayDate = paydayDate;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public Boleto getBoleto() {
        return Boleto;
    }

    public void setBoleto(Boleto Boleto) {
        this.Boleto = Boleto;
    }

    public String getSubscriptionMyId() {
        return subscriptionMyId;
    }

    public void setSubscriptionMyId(String subscriptionMyId) {
        this.subscriptionMyId = subscriptionMyId;
    }

    public String getSubscriptionGalaxPayId() {
        return subscriptionGalaxPayId;
    }

    public void setSubscriptionGalaxPayId(String subscriptionGalaxPayId) {
        this.subscriptionGalaxPayId = subscriptionGalaxPayId;
    }

    public Boolean getPayedOutsideGalaxPay() {
        return payedOutsideGalaxPay;
    }

    public void setPayedOutsideGalaxPay(Boolean payedOutsideGalaxPay) {
        this.payedOutsideGalaxPay = payedOutsideGalaxPay;
    }

}
