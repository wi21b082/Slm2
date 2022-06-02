package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculationController {

    @RequestMapping("/mul")
    public int mul(@RequestParam int a, @RequestParam int b) {
        return a * b;

    }

    @RequestMapping("/sum")
    public int sum(@RequestParam int a, @RequestParam int b) {
        return a + b;
    }

    @RequestMapping("/sub")
    public int sub(@RequestParam int a, @RequestParam int b) {
        return a - b;
    }

    @RequestMapping("/div")
    public String div(@RequestParam int a,@RequestParam int b){
        if(b != 0){
            return String.format("%d", a/b);
        }
        return "Division durch 0 nicht möglich";
    }
        @RequestMapping("/exp")
        public int exp ( @RequestParam int a, @RequestParam int b){
            return a^b;
        }

    @RequestMapping("/quad")
    public int quad( @RequestParam int a, @RequestParam int b){
        return a * b;
     }

    @RequestMapping("/pow")
    public int pow( @RequestParam int a, @RequestParam int b){
        return (int) Math.pow(a, b);
    }
    }

