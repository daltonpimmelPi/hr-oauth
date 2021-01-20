package com.system.hroauth.service;

import com.system.hroauth.entities.User;
import com.system.hroauth.feignclients.UserFeignClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


@Service
public class UserService {

    @Autowired
    private UserFeignClient userFeignClient;

    //estancia somente um cara desse
    private static Logger logger = LoggerFactory.getLogger(UserService.class);

    //metodo que esta se comunicando o microservice hr-user
    public User findByEmail(String email){
        User user = userFeignClient.findByEmail(email).getBody();
        if(user == null) {
            logger.error("Email not found: " + email);
            throw new IllegalArgumentException("Email not found");
        }
        logger.info("Email found: " + email);
        return user;
    }

}
