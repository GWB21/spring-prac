package com.cas.prac;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
class Controller implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        NumService myService = new NumService();
        System.out.println(myService.createNum(3));
    }
}