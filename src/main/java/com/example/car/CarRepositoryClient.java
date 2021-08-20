package com.example.car;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;

import java.util.List;

@Client("https://mocki.io/v1/4ce15aac-9c15-4949-97cb-80d8b6be95b7")
public interface CarRepositoryClient {
    @Get
    List<Car> getCars();
}
