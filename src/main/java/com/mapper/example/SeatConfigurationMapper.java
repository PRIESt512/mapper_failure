package com.mapper.example;

import com.mapper.model.SeatConfiguration;
import com.mapper.model.SeatConfigurationDto;
import org.mapstruct.Mapper;
import org.springframework.core.convert.converter.Converter;

// uncomment the @Mapper - everything will break
// and vice versa

@Mapper(config = MapperSpringConfig.class)
public interface SeatConfigurationMapper extends Converter<SeatConfiguration, SeatConfigurationDto> {
    SeatConfigurationDto convert(SeatConfiguration seatConfiguration);
}
