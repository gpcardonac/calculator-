package com.example.calculator.controller;
import org.springframework.boot.test.web.server.LocalServerPort;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CalculatorIntegrationTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void testSumEndpointWithPositiveNumbers() {
        String url = "http://localhost:" + port + "/calculator/sum?a=5&b=3";
        Integer result = restTemplate.getForObject(url, Integer.class);
        assertEquals(8, result);
    }

    @Test
    void testSumEndpointWithZero() {
        String url = "http://localhost:" + port + "/calculator/sum?a=5&b=0";
        Integer result = restTemplate.getForObject(url, Integer.class);
        assertEquals(5, result);
    }

    @Test
    void testSumEndpointWithNegativeNumbers() {
        String url = "http://localhost:" + port + "/calculator/sum?a=-2&b=-3";
        Integer result = restTemplate.getForObject(url, Integer.class);
        assertEquals(-5, result);
    }
}
