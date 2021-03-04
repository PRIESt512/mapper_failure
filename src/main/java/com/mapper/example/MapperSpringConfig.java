package com.mapper.example;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.MapperConfig;
import org.mapstruct.extensions.spring.SpringMapperConfig;

@MapperConfig(componentModel = "spring", uses = ConversionServiceAdapter.class, injectionStrategy = InjectionStrategy.CONSTRUCTOR)
@SpringMapperConfig
public interface MapperSpringConfig {
}
