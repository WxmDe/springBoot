package com.wxm.domain;

import java.util.Date;

import org.springframework.boot.orm.jpa.EntityScan;

public class Tablea {
    private Long id;

    private String num;

    private Date date;

    private Float price;

    private String flightnum;

    private String leg;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num == null ? null : num.trim();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getFlightnum() {
        return flightnum;
    }

    public void setFlightnum(String flightnum) {
        this.flightnum = flightnum == null ? null : flightnum.trim();
    }

    public String getLeg() {
        return leg;
    }

    public void setLeg(String leg) {
        this.leg = leg == null ? null : leg.trim();
    }
}