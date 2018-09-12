package com.nursh.webcustomerapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@ImportResource({ "classpath:hibernate-config.xml" })
public class WebCustomerAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebCustomerAppApplication.class, args);
    }
}
