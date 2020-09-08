package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication
{
    
    public static void main(String[] args) // det der sker i vores program lige nu er: vores SpringApplication kører
    // en enkelt metode som hedder run()
    {
        SpringApplication.run(DemoApplication.class, args);
    }
    
}
