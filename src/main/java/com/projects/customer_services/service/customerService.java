package com.projects.customer_services.service;

import com.projects.customer_services.controller.customerNumber;
import org.springframework.web.bind.annotation.RequestParam;

import static com.projects.customer_services.controller.customerNumber.*;

public class customerService {

        customerService CustomerService = new customerService();


    public  String checkAccount(@RequestParam String accountNumber) {
        if (accountNumber.length() < 16) {
            return "Account number must have at least 16 digits.";
        }else {
            return "Its Valid";
        }
    }
        public String Accountdetails(String accountNumber){
        String lastThree = accountNumber.substring(accountNumber.length() - 3);
            int sum = 0;
            for (char ch : lastThree.toCharArray()) {
                sum += Character.getNumericValue(ch);
            }

            customerNumber ccn = new customerNumber();
            ccn.setAccountNumber = "5879043234";

            if(sum %2 ==0){
            return "Umesh Account";
            }
            else
            {
                return "Prasanth Account";
             }
    }
}

