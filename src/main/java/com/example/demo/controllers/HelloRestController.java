package com.example.demo.controllers;

import com.example.demo.json.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

@GetMapping("/rest")
    public Greeting greet(@RequestParam(required = false,defaultValue = "World")String name){
        return new Greeting("Hello, "+ name);
    }
}





// modern app send amd receive Json data because every device has it user interface
// we generate the Json data at the backend
// er return actual instances not only redirect to view
//data need to be serialized to json form