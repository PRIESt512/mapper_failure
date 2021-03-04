package com.mapper.model;

public class SeatConfiguration {
    private int seatCount;
    private SeatMaterial material;

    public int getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }

    public SeatMaterial getMaterial() {
        return material;
    }

    public void setMaterial(SeatMaterial material) {
        this.material = material;
    }
}
