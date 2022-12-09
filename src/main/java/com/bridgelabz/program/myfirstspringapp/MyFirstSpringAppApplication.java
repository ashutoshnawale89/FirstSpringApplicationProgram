package com.bridgelabz.program.myfirstspringapp;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class MyFirstSpringAppApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(MyFirstSpringAppApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
   System.out.println("Welcome To The Spring Application");
    }
}
