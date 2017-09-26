package service.impl;

import org.springframework.stereotype.Service;
import service.HelloWorldService;


    @Service
//@Profile(value = "cap")
//@Primary
    public class HelloWorldServiceCapitalized implements HelloWorldService {

        @Override
        public String hello() {
            return "HELLO WORLD!";
        }

    }

