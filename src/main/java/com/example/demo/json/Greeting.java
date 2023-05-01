package com.example.demo.json;

import org.springframework.stereotype.Component;
//@Component to make the class to bean
@Component
public class Greeting {
    private  String message;

    public Greeting(String message){
         this.message=message;
    }
    public Greeting(){}

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "Greeting{" +
                "message='" + message + '\'' +
                '}';
    }


}
