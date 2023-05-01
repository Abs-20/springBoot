package com.example.demo;

import com.example.demo.json.Greeting;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import java.sql.SQLOutput;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;

@SpringBootTest
class DemoApplicationTests {
    @Autowired
    private ApplicationContext con;

    @Test
    void contextLoads() {
        assertNotNull(con);
        //how many beans in the context
        int count = con.getBeanDefinitionCount();
        System.out.println("there are " + count + "beans in the app context ");

        Arrays.stream(con.getBeanDefinitionNames()).forEach(System.out::println);

    }

    @Test
    void getBeansTwice(){
        Greeting greeting1 =con.getBean("defaultGreeting",Greeting.class);
        Greeting greeting2 =con.getBean(Greeting.class);
        assertSame(greeting1,greeting2);
        System.out.println(greeting1);

    }

}
