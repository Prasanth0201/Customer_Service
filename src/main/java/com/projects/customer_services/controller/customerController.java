package com.projects.customer_services.controller;

import com.projects.customer_services.model.AccountNumberRequest;
import com.projects.customer_services.model.UserDetails;
import com.projects.customer_services.service.CustomerService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;

import java.awt.*;

@RestController
@RequestMapping("/api/")
public class customerController {
    CustomerService service = new CustomerService();
    @PostMapping(value = "/fetchAccountDetails/", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public UserDetails fetchUserDetails (@RequestBody AccountNumberRequest request){
        return service.fetchUserDetails(request.getAccountNumber());
    }

}
