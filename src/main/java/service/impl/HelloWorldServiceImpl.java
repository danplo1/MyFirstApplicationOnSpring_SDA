package service.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;



    @Service
    @Primary
//@Profile("reg")
    public class HelloWorldServiceImpl implements service.HelloWorldService {

        @Override
        public String hello() {
            return "Hello World";
        }
    }

