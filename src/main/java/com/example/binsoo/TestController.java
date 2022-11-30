package com.example.binsoo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {

    @GetMapping("/yes")
    public String yesBinsoo() {
        System.out.println("Intercepter Yes.");
        return "Intercepter Yes.";
    }

    @GetMapping("/no")
    public String noBinsoo() {
        System.out.println("Intercepter No.");
        return "Intercepter No.";
    }
}
