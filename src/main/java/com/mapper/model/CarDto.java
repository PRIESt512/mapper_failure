package com.mapper.model;

import lombok.Data;

@Data
public class CarDto {
    private String make;
    private SeatConfigurationDto seats;
}
