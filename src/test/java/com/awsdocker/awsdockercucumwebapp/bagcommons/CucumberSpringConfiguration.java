package com.awsdocker.awsdockercucumwebapp.bagcommons;

import io.cucumber.spring.CucumberContextConfiguration;

import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest
//@AutoConfigureMockMvc
@CucumberContextConfiguration
//@ContextConfiguration()
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CucumberSpringConfiguration {
}
