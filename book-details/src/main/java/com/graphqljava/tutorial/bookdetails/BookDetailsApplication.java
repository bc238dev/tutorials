package com.graphqljava.tutorial.bookdetails;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookDetailsApplication {

    public static void main(String[] args) {
        System.out.println("GraphQL demo starting on " + new Date());
        SpringApplication.run(BookDetailsApplication.class, args);
    }
}

