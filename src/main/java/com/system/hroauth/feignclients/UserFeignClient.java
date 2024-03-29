package com.system.hroauth.feignclients;

import com.system.hroauth.entities.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@FeignClient(name = "hr-user", path = "/users") //descrobre atraves do eureka
public interface UserFeignClient {

    @GetMapping("/{id}")
    ResponseEntity<User> findById(@PathVariable Long id);

    @GetMapping("/search") ///search?.... @RequestParam
    ResponseEntity<User> findByEmail(@RequestParam String email);
}
