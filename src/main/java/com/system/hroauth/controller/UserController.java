package com.system.hroauth.controller;

import com.netflix.discovery.converters.Auto;
import com.system.hroauth.entities.User;
import com.system.hroauth.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/search")
    public ResponseEntity<User> findByEmail(@RequestParam String email){
        User user =  userService.findByEmail(email);
        return ResponseEntity.ok(user);
    }

}
