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
public class BaseReturn {

    private String type;
    private Charge Charge;
    private Integer totalQtdFoundInPage;
    private List<Charge> Charges;
    private Error error;
    private List<Carne> Carnes;
    private Boleto Boleto;

    public BaseReturn() {
    }

    public Integer getTotalQtdFoundInPage() {
        return totalQtdFoundInPage;
    }

    public void setTotalQtdFoundInPage(Integer totalQtdFoundInPage) {
        this.totalQtdFoundInPage = totalQtdFoundInPage;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Charge getCharge() {
        return Charge;
    }

    public void setCharge(Charge Charge) {
        this.Charge = Charge;
    }

    public List<Charge> getCharges() {
        return Charges;
    }

    public void setCharges(List<Charge> Charges) {
        this.Charges = Charges;
    }

    public Error getError() {
        return error;
    }

    public void setError(Error error) {
        this.error = error;
    }

    public List<Carne> getCarnes() {
        return Carnes;
    }

    public void setCarnes(List<Carne> Carnes) {
        this.Carnes = Carnes;
    }

    public Boleto getBoleto() {
        return Boleto;
    }

    public void setBoleto(Boleto Boleto) {
        this.Boleto = Boleto;
    }

}
