package com.mapper.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.boot.convert.ApplicationConversionService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.converter.Converter;
import org.springframework.format.support.DefaultFormattingConversionService;

@Slf4j
@Configuration
public class MapperConfig {
    private final ListableBeanFactory beanFactory;

    public MapperConfig(ListableBeanFactory beanFactory) {
        this.beanFactory = beanFactory;
    }

    /**
     * without spring-boot-starter-web, no custom mappers will be added automatically;
     * register manually we register manually all our {@link Converter}
     */
    @Bean
    public ConversionService conversionService() {
        log.info("ConversionService bean init");
        var service = new DefaultFormattingConversionService();
        ApplicationConversionService.addBeans(service, this.beanFactory);
        return service;
    }
}
