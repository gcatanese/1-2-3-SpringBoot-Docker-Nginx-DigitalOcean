package com.mydomain.myapp.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@AutoConfigureMockMvc
@WebMvcTest(controllers = AppController.class)
public class AppControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testUrl() throws Exception {
        this.mockMvc
                .perform(get("/test"))
                .andExpect(status().isOk());
    }

}
