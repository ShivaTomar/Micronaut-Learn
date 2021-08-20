package com.example;

import io.micronaut.http.HttpStatus;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import jakarta.inject.Inject;

import static io.micronaut.http.HttpRequest.GET;
import static org.junit.jupiter.api.Assertions.assertEquals;

@MicronautTest
class DemoTest {

    @Inject @Client("/api/v1/")
    HttpClient client;

    @Test
    void getBikesTest() {
        var res = client
                .toBlocking()
                .exchange(GET("bikes"));

        assertEquals(HttpStatus.OK, res.getStatus());
    }

    @Test
    void getCarsTest() {
        var res = client
                .toBlocking()
                .exchange(GET("cars"));

        assertEquals(HttpStatus.OK, res.getStatus());
    }

}
