package com.rocket.rest;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MealRestController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public MealDTO greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new MealDTO(counter.incrementAndGet(),
                            String.format(template, name));
    }
}