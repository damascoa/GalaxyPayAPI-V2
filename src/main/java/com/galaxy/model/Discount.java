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
public class Discount {

    private Integer qtdDaysBeforePayDay;
    private String type;
    private Integer value;

    public Discount() {
    }

    public Integer getQtdDaysBeforePayDay() {
        return qtdDaysBeforePayDay;
    }

    public void setQtdDaysBeforePayDay(Integer qtdDaysBeforePayDay) {
        this.qtdDaysBeforePayDay = qtdDaysBeforePayDay;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

}
