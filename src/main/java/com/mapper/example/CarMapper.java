package com.mapper.example;

import com.mapper.model.Car;
import com.mapper.model.CarDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.core.convert.converter.Converter;

@Mapper(config = MapperSpringConfig.class)
public interface CarMapper extends Converter<Car, CarDto> {
    @Mapping(target = "seats", source = "seatConfiguration")
    CarDto convert(Car car);
}
