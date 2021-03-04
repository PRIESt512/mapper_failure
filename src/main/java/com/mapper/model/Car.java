package com.mapper.model;

public class Car {
    private String make;
    private SeatConfiguration seatConfiguration;

    public String getMake() {
        return make;
    }

    public void setMake(final String make) {
        this.make = make;
    }

    public SeatConfiguration getSeatConfiguration() {
        return seatConfiguration;
    }

    public void setSeatConfiguration(final SeatConfiguration seatConfiguration) {
        this.seatConfiguration = seatConfiguration;
    }
}
