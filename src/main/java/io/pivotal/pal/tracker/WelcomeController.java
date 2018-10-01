package io.pivotal.pal.tracker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class WelcomeController {

    private final String message;

    public WelcomeController(@Value("${message:WELCOME_MESSAGE}") String message){
        this.message = message;
    }

    @GetMapping("/")
    public String sayHello() {
        return message;
    }
}