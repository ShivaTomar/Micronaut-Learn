package com.example.car;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
@AllArgsConstructor
@Controller("/api/v1/")
public class CarController {

    protected CarRepositoryClient client;

    @Get("cars")
    public List<Car> getCars() {
        log.info("CarController.getCars() is called...");

        var result = client.getCars();
        log.info("Cars Fetched: {}", result);
        return result;
    }

}
