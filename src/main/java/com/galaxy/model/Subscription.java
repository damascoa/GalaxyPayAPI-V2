/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.galaxy.model;

import java.util.List;

/**
 *
 * @author Renato
 */
public class Subscription {

    private String myId;
    private String galaxPayId;

    private Integer value;
    private Integer quantity;
    private String periodicity;
    private String firstPayDayDate;
    private Boolean payedOutsideGalaxPay;
    private String paymentLink;
    private String mainPaymentMethodId;

    private String status;
    private String additionalInfo;
    private String createdAt;
    private String updatedAt;
    private Customer Customer;
    private List<Transactions> Transactions;
    private PaymentMethodBoleto PaymentMethodBoleto;

    public Subscription() {
    }

    public String getMyId() {
        return myId;
    }

    public void setMyId(String myId) {
        this.myId = myId;
    }

    public String getMainPaymentMethodId() {
        return mainPaymentMethodId;
    }

    public void setMainPaymentMethodId(String mainPaymentMethodId) {
        this.mainPaymentMethodId = mainPaymentMethodId;
    }

    public String getPaymentLink() {
        return paymentLink;
    }

    public void setPaymentLink(String paymentLink) {
        this.paymentLink = paymentLink;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Boolean getPayedOutsideGalaxPay() {
        return payedOutsideGalaxPay;
    }

    public void setPayedOutsideGalaxPay(Boolean payedOutsideGalaxPay) {
        this.payedOutsideGalaxPay = payedOutsideGalaxPay;
    }

    public Customer getCustomer() {
        return Customer;
    }

    public void setCustomer(Customer Customer) {
        this.Customer = Customer;
    }

    public List<Transactions> getTransactions() {
        return Transactions;
    }

    public void setTransactions(List<Transactions> Transactions) {
        this.Transactions = Transactions;
    }

    public PaymentMethodBoleto getPaymentMethodBoleto() {
        return PaymentMethodBoleto;
    }

    public void setPaymentMethodBoleto(PaymentMethodBoleto PaymentMethodBoleto) {
        this.PaymentMethodBoleto = PaymentMethodBoleto;
    }

    public String getGalaxPayId() {
        return galaxPayId;
    }

    public void setGalaxPayId(String galaxPayId) {
        this.galaxPayId = galaxPayId;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getPeriodicity() {
        return periodicity;
    }

    public void setPeriodicity(String periodicity) {
        this.periodicity = periodicity;
    }

    public String getFirstPayDayDate() {
        return firstPayDayDate;
    }

    public void setFirstPayDayDate(String firstPayDayDate) {
        this.firstPayDayDate = firstPayDayDate;
    }

}
