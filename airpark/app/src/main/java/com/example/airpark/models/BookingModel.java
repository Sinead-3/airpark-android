package com.example.airpark.models;

import org.json.JSONException;
import org.json.JSONObject;
import java.io.Serializable;
import java.util.Date;

public class BookingModel implements Serializable {

    private int bookingId;
    private double carparkLat;
    private double carparkLong;
    private String carparkName;
    private String airportName;
    private String carparkImage;
    private Date startDateTime;
    private Date endDateTime;
    private String uniqueCode;
    private double finalPrice;
    private boolean isLongTerm;

    public BookingModel(JSONObject object) throws JSONException {
        this.bookingId = object.getInt("booking_id");
        this.carparkLat = object.getDouble("carpark_lat");
        this.carparkLong = object.getDouble("carpark_long");
        this.carparkName = object.getString("carpark_name");
        this.airportName = object.getString("airport_name");
        this.startDateTime = new Date(object.getLong("start_date") * 1000);
        this.endDateTime = new Date(object.getLong("end_date") * 1000);
        this.finalPrice = object.getDouble("total_price");
        this.carparkImage = object.getString("carpark_image");
        this.uniqueCode = object.getString("alphanumeric_string");
        this.isLongTerm = object.getBoolean("is_long_term");
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public double getCarparkLat() {
        return carparkLat;
    }

    public void setCarparkLat(double carparkLat) {
        this.carparkLat = carparkLat;
    }

    public double getCarparkLong() {
        return carparkLong;
    }

    public void setCarparkLong(double carparkLong) {
        this.carparkLong = carparkLong;
    }

    public String getCarparkName() {
        return carparkName;
    }

    public void setCarparkName(String carparkName) {
        this.carparkName = carparkName;
    }

    public String getAirportName() {
        return airportName;
    }

    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }

    public String getCarparkImage() {
        return carparkImage;
    }

    public void setCarparkImage(String carparkImage) {
        this.carparkImage = carparkImage;
    }

    public Date getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(Date startDateTime) {
        this.startDateTime = startDateTime;
    }

    public Date getEndDateTime() {
        return endDateTime;
    }

    public void setEndDateTime(Date endDateTime) {
        this.endDateTime = endDateTime;
    }

    public String getUniqueCode() {
        return uniqueCode;
    }

    public void setUniqueCode(String uniqueCode) {
        this.uniqueCode = uniqueCode;
    }

    public double getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(double finalPrice) {
        this.finalPrice = finalPrice;
    }

    public boolean isLongTerm() {
        return isLongTerm;
    }

    public void setLongTerm(boolean longTerm) {
        isLongTerm = longTerm;
    }
}
