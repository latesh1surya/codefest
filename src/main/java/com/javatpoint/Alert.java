package com.javatpoint;

import org.springframework.format.annotation.DateTimeFormat;

public class Alert {

    private int idr;
    private int apptIdr;
    private DateTimeFormat responseTime;
    private String responseValue;

    
    public Alert(int idr, int apptIdr, DateTimeFormat responseTime, String responseValue) {
        this.idr = idr;
        this.apptIdr = apptIdr;
        this.responseTime = responseTime;
        this.responseValue = responseValue;
    }
    public int getIdr() {
        return idr;
    }
    public void setIdr(int idr) {
        this.idr = idr;
    }
    public int getApptIdr() {
        return apptIdr;
    }
    public void setApptIdr(int apptIdr) {
        this.apptIdr = apptIdr;
    }
    public DateTimeFormat getResponseTime() {
        return responseTime;
    }
    public void setResponseTime(DateTimeFormat responseTime) {
        this.responseTime = responseTime;
    }
    public String getResponseValue() {
        return responseValue;
    }
    public void setResponseValue(String responseValue) {
        this.responseValue = responseValue;
    }

    
    
}
