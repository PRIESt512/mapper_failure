package com.mapper.model;

public class SeatConfigurationDto {
    private int seatCount;
    private String material;

    public int getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(final int seatCount) {
        this.seatCount = seatCount;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(final String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "SeatConfigurationDto{" +
                "seatCount=" + seatCount +
                ", material='" + material + '\'' +
                '}';
    }
}
