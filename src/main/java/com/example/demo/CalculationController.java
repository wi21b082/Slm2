package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculationController {

    private Calculator calculator = new Calculator();

    @RequestMapping("/mul")
    public int mul(@RequestParam int a, @RequestParam int b) {
        return calculator.mul(a,b);

    }

    @RequestMapping("/sum")
    public int sum(@RequestParam int a, @RequestParam int b) {
        return calculator.sum(a,b);
    }

    @RequestMapping("/sub")
    public int sub(@RequestParam int a, @RequestParam int b) {
        return calculator.sub(a,b);
    }

    @RequestMapping("/div")
    public String div(@RequestParam int a,@RequestParam int b){
        if(b != 0){
            return calculator.div(a,b);
        }
        return "Division durch 0 nicht möglich";
    }

    @RequestMapping("/quad")
    public int quad( @RequestParam int a, @RequestParam int b){
        return calculator.quad(a, b);
     }

    @RequestMapping("/pow")
    public int pow( @RequestParam int a, @RequestParam int b){
        return calculator.pow(a,b);
    }
    }

