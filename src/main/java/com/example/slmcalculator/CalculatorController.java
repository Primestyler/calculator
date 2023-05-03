package com.example.slmcalculator;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


public class CalculatorController {
    /**
     * add two integers
     * @param a
     * @param b
     * @return
     */
    @RequestMapping("/calc/sum")
    public int sum(@RequestParam int a,
                   @RequestParam int b
    )
    {
        return a+b;
    }
}
