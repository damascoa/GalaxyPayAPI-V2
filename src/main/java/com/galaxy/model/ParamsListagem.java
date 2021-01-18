/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.galaxy.model;

import com.galaxy.config.Constantes;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.http.client.utils.URIBuilder;

/**
 *
 * @author Renato
 */
public class ParamsListagem {

    private String[] myIds;
    private String[] galaxPayIds;
    private String[] customerMyIds;
    private String[] customerGalaxPayIds;
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

    public String[] getMyIds() {
        return myIds;
    }

    public void setMyIds(String[] myIds) {
        this.myIds = myIds;
    }

    public String[] getGalaxPayIds() {
        return galaxPayIds;
    }

    public void setGalaxPayIds(String[] galaxPayIds) {
        this.galaxPayIds = galaxPayIds;
    }

    public String[] getCustomerMyIds() {
        return customerMyIds;
    }

    public void setCustomerMyIds(String[] customerMyIds) {
        this.customerMyIds = customerMyIds;
    }

    public String[] getCustomerGalaxPayIds() {
        return customerGalaxPayIds;
    }

    public void setCustomerGalaxPayIds(String[] customerGalaxPayIds) {
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
            URIBuilder b = new URIBuilder(Constantes.urlBase);
            if (myIds != null && myIds.length > 0) {
                b.addParameter("myIds", String.join(",", myIds));
            }
            if (galaxPayIds != null && galaxPayIds.length > 0) {
                b.addParameter("galaxPayIds", String.join(",", galaxPayIds));
            }
            if (customerMyIds != null && customerMyIds.length > 0) {
                b.addParameter("customerMyIds", String.join(",", customerMyIds));
            }
            if (customerGalaxPayIds != null && customerGalaxPayIds.length > 0) {
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
            b.addParameter("order", "createdAt.desc");
            return b.toString();
        } catch (Exception e) {
        }
        return "";

    }

}
