package com.projects.customer_services;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class customerController {
    @PostMapping("/fetchAccountDetails/")
    public userDTO fetchAccountDetails (@RequestBody Long accountNumber){

        userDTO UserDTO =new userDTO();
        return UserDTO;
    }

}
