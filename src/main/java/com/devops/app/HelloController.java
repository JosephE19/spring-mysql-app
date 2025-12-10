package com.devops.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
public class HelloController {
    
    @Autowired
    private UserRepository userRepository;
    
    @GetMapping("/hello")
    public String hello() {
        return "Hello World from Spring Boot with MySQL!";
    }
    
    @GetMapping("/users")
    public List<User> getUsers() {
        return userRepository.findAll();
    }
    
    @PostMapping("/users")
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }
}
