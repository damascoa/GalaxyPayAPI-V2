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
public class PaymentMethodBoleto {

//    Percentual de multa , com dois decimais sem o separador.Caso não informado será utilizado o percentual definido no sistema
    private Integer fine;
//    Percentual de juros , com dois decimais sem o separador.Caso não informado será utilizado o percentual definido no sistema
    private Integer interest;
    private String instructions;
//    Quantidade de dias que o boleto pode ser pago após o vencimento
//    Caso não informado será utilizado o padrão definido no sistema
//    Valores válidos de 0 a 59.
    private Integer deadlineDays;

    private Discount discount;

    public PaymentMethodBoleto() {
    }

    public PaymentMethodBoleto(Integer fine, Integer interest, String instructions) {
        this.fine = fine;
        this.interest = interest;
        this.instructions = instructions;
        this.deadlineDays = 0;
    }

    public Integer getFine() {
        return fine;
    }

    public void setFine(Integer fine) {
        this.fine = fine;
    }

    public Integer getInterest() {
        return interest;
    }

    public void setInterest(Integer interest) {
        this.interest = interest;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public Integer getDeadlineDays() {
        return deadlineDays;
    }

    public void setDeadlineDays(Integer deadlineDays) {
        this.deadlineDays = deadlineDays;
    }

    public Discount getDiscount() {
        return discount;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

}
