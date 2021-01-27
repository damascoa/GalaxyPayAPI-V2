/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.galaxy.model;

import com.galaxy.config.Constantes;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.apache.http.client.utils.URIBuilder;

/**
 *
 * @author Renato
 */
public class ParamsListagem {
    
    private List<String> myIds;
    private List<String> galaxPayIds;
    private List<String> customerMyIds;
    private List<String> customerGalaxPayIds;
    private Date createdAtFrom;
    private Date createdAtTo;
    private Date createdOrUpdatedAtFrom;
    private Date createdOrUpdatedAtTo;
    //active
    //canceled
    //closed
    private String status;
    private Integer startAt;
    private Integer limit;
    
    public ParamsListagem() {
    }
    
    public ParamsListagem(String myIds) {
        this.myIds = Arrays.asList(new String[]{myIds});
    }
    
    public List<String> getMyIds() {
        return myIds;
    }
    
    public void setMyIds(List<String> myIds) {
        this.myIds = myIds;
    }
    
    public List<String> getGalaxPayIds() {
        return galaxPayIds;
    }
    
    public void setGalaxPayIds(List<String> galaxPayIds) {
        this.galaxPayIds = galaxPayIds;
    }
    
    public List<String> getCustomerMyIds() {
        return customerMyIds;
    }
    
    public void setCustomerMyIds(List<String> customerMyIds) {
        this.customerMyIds = customerMyIds;
    }
    
    public List<String> getCustomerGalaxPayIds() {
        return customerGalaxPayIds;
    }
    
    public void setCustomerGalaxPayIds(List<String> customerGalaxPayIds) {
        this.customerGalaxPayIds = customerGalaxPayIds;
    }
    
    public Date getCreatedAtFrom() {
        return createdAtFrom;
    }
    
    public void setCreatedAtFrom(Date createdAtFrom) {
        this.createdAtFrom = createdAtFrom;
    }
    
    public Date getCreatedAtTo() {
        return createdAtTo;
    }
    
    public void setCreatedAtTo(Date createdAtTo) {
        this.createdAtTo = createdAtTo;
    }
    
    public Date getCreatedOrUpdatedAtFrom() {
        return createdOrUpdatedAtFrom;
    }
    
    public void setCreatedOrUpdatedAtFrom(Date createdOrUpdatedAtFrom) {
        this.createdOrUpdatedAtFrom = createdOrUpdatedAtFrom;
    }
    
    public Date getCreatedOrUpdatedAtTo() {
        return createdOrUpdatedAtTo;
    }
    
    public void setCreatedOrUpdatedAtTo(Date createdOrUpdatedAtTo) {
        this.createdOrUpdatedAtTo = createdOrUpdatedAtTo;
    }
    
    public String getStatus() {
        return status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    
    public Integer getStartAt() {
        return startAt;
    }
    
    public void setStartAt(Integer startAt) {
        this.startAt = startAt;
    }
    
    public Integer getLimit() {
        return limit;
    }
    
    public void setLimit(Integer limit) {
        this.limit = limit;
    }
    
    private String formatarData(Date d) {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        return df.format(d);
    }
    
    public String gerarParametrosURI() {
        try {
            URIBuilder b = new URIBuilder(Constantes.urlBase + "charges?");
            if (myIds != null && myIds.size() > 0) {
                b.addParameter("myIds", String.join(",", myIds));
            }
            if (galaxPayIds != null && galaxPayIds.size() > 0) {
                b.addParameter("galaxPayIds", String.join(",", galaxPayIds));
            }
            if (customerMyIds != null && customerMyIds.size() > 0) {
                b.addParameter("customerMyIds", String.join(",", customerMyIds));
            }
            if (customerGalaxPayIds != null && customerGalaxPayIds.size() > 0) {
                b.addParameter("customerGalaxPayIds", String.join(",", customerGalaxPayIds));
            }
            if (createdAtFrom != null) {
                b.addParameter("createdAtFrom", formatarData(createdAtFrom));
            }
            if (createdAtTo != null) {
                b.addParameter("createdAtTo", formatarData(createdAtTo));
            }
            if (createdOrUpdatedAtFrom != null) {
                b.addParameter("createdOrUpdatedAtFrom", formatarData(createdOrUpdatedAtFrom));
            }
            if (createdOrUpdatedAtTo != null) {
                b.addParameter("createdOrUpdatedAtTo", formatarData(createdOrUpdatedAtTo));
            }
            if (status != null) {
                b.addParameter("status", status);
            }
            if (startAt != null) {
                b.addParameter("startAt", startAt + "");
            }
            if (limit != null) {
                b.addParameter("limit", limit + "");
            }
            b.addParameter("startAt", "0");
            b.addParameter("limit", "100");
            b.addParameter("order", "createdAt.desc");
            return b.toString();
        } catch (Exception e) {
        }
        return "";
        
    }
    
}
