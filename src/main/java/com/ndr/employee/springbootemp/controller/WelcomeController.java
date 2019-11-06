package com.ndr.employee.springbootemp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class WelcomeController {
    
    @RequestMapping("/hello")
    public Object sayHello(){
        System.out.println("Employee -----git hub-");
        return "Customer";
    }

}
