package com.projects.customer_services.controller;

import com.projects.customer_services.model.AccountNumberRequest;
import com.projects.customer_services.model.UserDetails;
import com.projects.customer_services.service.CustomerService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class customerController {

    CustomerService service = new CustomerService();
    @PostMapping("/fetchAccountDetails/")
    public UserDetails fetchUserDetails (@RequestBody AccountNumberRequest request){
        UserDetails newuserDetails = service.fetchUserDetails(request.getAccountNumber());

        UserDetails userDetails  =new UserDetails();
        return userDetails ;
    }

}
