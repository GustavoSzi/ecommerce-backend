package com.storeapp.ecommercebackend.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class UserResource {

    @GetMapping()
    private String test() {
        return "Hello";
    }
}
