package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    /**
     *
     * @param a
     * @param b
     * @return
     */


    @RequestMapping("/sum")
    public int sum(@RequestParam int a, @RequestParam int b) {
        return a + b;
    }
}
