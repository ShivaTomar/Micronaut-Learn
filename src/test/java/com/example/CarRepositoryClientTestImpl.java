package com.example;

import com.example.car.Car;
import com.example.car.CarRepositoryClient;
import io.micronaut.context.annotation.Replaces;
import jakarta.inject.Singleton;

import java.util.Arrays;
import java.util.List;

@Singleton
@Replaces(CarRepositoryClient.class)
public class CarRepositoryClientTestImpl implements CarRepositoryClient {

    @Override
    public List<Car> getCars() {
        return Arrays.asList(
                new Car("Car1", "$10k"),
                new Car("Car2", "$15k"),
                new Car("Car3", "$16k")
        );
    }

}
