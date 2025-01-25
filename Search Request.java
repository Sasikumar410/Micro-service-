package com.hoenscanner.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SearchRequest {
    @JsonProperty("location")
    private String location;

    @JsonProperty("check_in_date")
    private String checkInDate;

    @JsonProperty("check_out_date")
    private String checkOutDate;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(String checkInDate) {
        this.checkInDate = checkInDate;
    }

    public String getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(String checkOutDate) {
        this.checkOutDate = checkOutDate;
    }
}
