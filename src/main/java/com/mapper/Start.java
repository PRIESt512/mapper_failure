package com.mapper;

import com.mapper.example.ConversionServiceAdapter;
import com.mapper.model.Car;
import com.mapper.model.SeatConfiguration;
import com.mapper.model.SeatMaterial;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@Slf4j
@SpringBootApplication
public class Start {
    public static void main(String[] args) {
        SpringApplication.run(Start.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx, ConversionServiceAdapter adapter) {
        return args -> {
            var seatConf = new SeatConfiguration();
            seatConf.setMaterial(SeatMaterial.FABRIC);
            var car = new Car();
            car.setMake("make");
            car.setSeatConfiguration(seatConf);

            log.info("map start");
            var carDto = adapter.mapCarToCarDto(car);
            log.info(carDto.toString());
        };
    }
}
