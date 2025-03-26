package com.example.calculator.controller;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
public class CalculatorIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void testSumEndpoint() throws Exception {
        mockMvc.perform(get("/calculator/sum?a=2&b=3"))
                .andExpect(status().isOk())
                .andExpect(content().string("5"));
    }
}
