package com.example.bike;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
@AllArgsConstructor
@Controller("/api/v1/")
public class BikeController {

    protected BikeRepositoryClient client;

    @Get("bikes")
    public List<Bike> getBikes() {
        log.info("BikeController.getBikes() is called...");

        var result = client.getBikes();
        log.info("Bikes Fetched: {}", result);

        return result;
    }

}
