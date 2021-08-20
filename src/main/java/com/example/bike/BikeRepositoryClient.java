package com.example.bike;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;

import java.util.List;

@Client("https://mocki.io/v1/e6e793d8-1932-4931-b1a5-dce578e6b7f5")
public interface BikeRepositoryClient {
    @Get
    List<Bike> getBikes();
}
