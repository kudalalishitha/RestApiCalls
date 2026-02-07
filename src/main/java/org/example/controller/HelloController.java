package org.example.controller;

import org.example.dto.UserDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    // UC1
    @GetMapping
    public String sayHello() {
        return "Hello from BridgeLabz";
    }

    // UC2
    @GetMapping("/query")
    public String sayHelloQuery(@RequestParam String name) {
        return "Hello " + name + " from BridgeLabz";
    }

    // UC3
    @GetMapping("/param/{name}")
    public String sayHelloPath(@PathVariable String name) {
        return "Hello " + name + " from BridgeLabz";
    }

    // UC4
    @PostMapping("/post")
    public String sayHelloPost(@RequestBody UserDTO userDTO) {
        return "Hello " + userDTO.getFirstName() + " " + userDTO.getLastName() + " from BridgeLabz";
    }

    // UC5
    @PutMapping("/put/{firstName}")
    public String sayHelloPut(@PathVariable String firstName,
                              @RequestParam String lastName) {
        return "Hello " + firstName + " " + lastName + " from BridgeLabz";
    }
}
