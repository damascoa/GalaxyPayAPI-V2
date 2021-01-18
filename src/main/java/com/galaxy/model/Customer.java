/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.galaxy.model;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Renato
 */
public class Customer {

    private String myId;
    private String name;
    private String document;
    private List<String> emails;
//   Telefones do cliente. Separe cada telefone por vírgula.
    private List<BigDecimal> phones;
    private Address Address;

    public Customer(String myId, String name, String document, List<String> emails, List<String> phones, Address Address) {
        this.myId = myId;
        this.name = name;
        this.document = document;
        this.emails = emails;
        this.phones = phones.stream().map(m -> new BigDecimal(m).setScale(0)).collect(Collectors.toList());
        this.Address = Address;
    }

    public String getMyId() {
        return myId;
    }

    public void setMyId(String myId) {
        this.myId = myId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public List<String> getEmails() {
        return emails;
    }

    public void setEmails(List<String> emails) {
        this.emails = emails;
    }

    public List<BigDecimal> getPhones() {
        return phones;
    }

    public void setPhones(List<BigDecimal> phones) {
        this.phones = phones;
    }

    public Address getAddress() {
        return Address;
    }

    public void setAddress(Address Address) {
        this.Address = Address;
    }

}
