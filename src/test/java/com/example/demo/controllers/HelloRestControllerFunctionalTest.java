package com.example.demo.controllers;

import com.example.demo.json.Greeting;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;

// start actual server run the app and the test then shut down the server
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HelloRestControllerFunctionalTest {

    @Autowired
    private TestRestTemplate template;

    @Test
    public void greetWithName() {
        // get the url where we are heading to and the class to convert the return json response
        Greeting response = template.getForObject("/rest?name=abs", Greeting.class);
        assertEquals("Hello, abs", response.getMessage());
    }

    @Test
    public void greetWithoutName() {
        //the entity is to get the whole response and access all the functions like (status, mediaType)
        ResponseEntity<Greeting> entity = template.getForEntity("/rest", Greeting.class);
        assertEquals(HttpStatus.OK, entity.getStatusCode());
        assertEquals(MediaType.APPLICATION_JSON, entity.getHeaders().getContentType());

        //declare a variable from the kind greeting and save the response into it
        Greeting response = entity.getBody();

        if (response != null) {
            assertEquals("Hello, World", response.getMessage());

        }
    }




}

