/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.galaxy.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Renato
 */
public class GerarPDF {

    private List<String> myIds;

    public GerarPDF() {
    }

    public GerarPDF(String myIds) {
        this.myIds = new ArrayList();
        this.myIds.add(myIds);
    }

    public GerarPDF(List<String> myIds) {
        this.myIds = myIds;
    }

    public List<String> getMyIds() {
        return myIds;
    }

    public void setMyIds(List<String> myIds) {
        this.myIds = myIds;
    }

}
