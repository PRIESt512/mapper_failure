package com.mapper.model;

public class CarDto {
    private String make;
    private SeatConfigurationDto seats;

    public String getMake() {
        return make;
    }

    public void setMake(final String make) {
        this.make = make;
    }

    public SeatConfigurationDto getSeats() {
        return seats;
    }

    public void setSeats(final SeatConfigurationDto seats) {
        this.seats = seats;
    }

    @Override
    public String toString() {
        return "CarDto{" +
                "make='" + make + '\'' +
                ", seats=" + seats +
                '}';
    }
}
