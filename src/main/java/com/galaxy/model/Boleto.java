/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.galaxy.model;

import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author Renato
 */
public class Boleto {

    private String myId;
    private Integer value;
    private Integer quantity = 1;
    private String periodicity = "monthly";
    private String firstPayDayDate;
    private String additionalInfo;
    private String mainPaymentMethodId = "boleto";
    private Customer Customer;
    private PaymentMethodBoleto paymentMethodBoleto;
    private String pdf;
    private String bankLine;
    private String bankNumber;
    private List<Transactions> Transactions;

    public Boleto(BigDecimal valor, String additionalInfo, String myId, String payday, Boolean payedOutsideGalaxPay, Customer customer,
            BigDecimal multa, BigDecimal juros, String instrucoes) {
        this.value = valor.multiply(new BigDecimal(100)).intValue();
        this.additionalInfo = additionalInfo;
        this.myId = myId;

        this.Customer = customer;
        this.paymentMethodBoleto = new PaymentMethodBoleto(multa.multiply(new BigDecimal(100)).intValue(), juros.multiply(new BigDecimal(100)).intValue(), instrucoes);
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

    public Customer getCustomer() {
        return Customer;
    }

    public void setCustomer(Customer Customer) {
        this.Customer = Customer;
    }

    public PaymentMethodBoleto getPaymentMethodBoleto() {
        return paymentMethodBoleto;
    }

    public void setPaymentMethodBoleto(PaymentMethodBoleto paymentMethodBoleto) {
        this.paymentMethodBoleto = paymentMethodBoleto;
    }

    public String getPdf() {
        return pdf;
    }

    public void setPdf(String pdf) {
        this.pdf = pdf;
    }

    public String getBankLine() {
        return bankLine;
    }

    public void setBankLine(String bankLine) {
        this.bankLine = bankLine;
    }

    public String getBankNumber() {
        return bankNumber;
    }

    public void setBankNumber(String bankNumber) {
        this.bankNumber = bankNumber;
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

    public List<Transactions> getTransactions() {
        return Transactions;
    }

    public void setTransactions(List<Transactions> Transactions) {
        this.Transactions = Transactions;
    }

}
