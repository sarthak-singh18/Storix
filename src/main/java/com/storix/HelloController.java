package com.storix;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Tells Spring that this class handles web requests and returns response data.
public class HelloController {

    @GetMapping("/hello")//Maps HTTP GET requests to the /hello path.
    public String hello() {//	Defines the Java method that handles the request.
        return "Storix is running!";//Sends this text back as the HTTP response.
    }
}