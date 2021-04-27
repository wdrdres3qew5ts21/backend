package com.napzz.entity.location;

public class Location {

    private String city;

    private String detail;

    public Location() {
    }

    public Location(String city, String detail) {
        this.city = city;
        this.detail = detail;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "Location [city=" + city + ", detail=" + detail + "]";
    }

}
