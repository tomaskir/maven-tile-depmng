package com.github.tomaskir;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Slf4j
@SpringBootApplication
public class Test {

    public static void main(String[] args) {
        SpringApplication.run(Test.class, args);
    }

    @Component
    public static class TestComponent {
        @PostConstruct
        public void helloWorld() {
            log.info("Hello world!");
        }
    }

}
