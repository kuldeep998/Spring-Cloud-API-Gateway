package com.techcorp.authservice.user;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class UserController {

    @GetMapping("/user")
    public String defaultRoute() {
        return "This is default route of the user service " + new Date();
    }
}
