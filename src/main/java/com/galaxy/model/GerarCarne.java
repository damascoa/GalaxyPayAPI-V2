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
public class GerarCarne {

    private List<String> subscriptionsMyIds;

    public GerarCarne() {
    }

    public GerarCarne(String subscriptionsMyIds) {
        this.subscriptionsMyIds = new ArrayList();
        this.subscriptionsMyIds.add(subscriptionsMyIds);
    }

    public List<String> getSubscriptionsMyIds() {
        return subscriptionsMyIds;
    }

    public void setSubscriptionsMyIds(List<String> subscriptionsMyIds) {
        this.subscriptionsMyIds = subscriptionsMyIds;
    }

}
