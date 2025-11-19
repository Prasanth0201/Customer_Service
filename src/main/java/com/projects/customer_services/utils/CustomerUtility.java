package com.projects.customer_services.utils;

import com.projects.customer_services.model.UserDetails;

public class CustomerUtility {
    public static UserDetails returnUmeshDetails(){
       UserDetails userDetails = new UserDetails();
       userDetails.setDob("05-08-1999");
       userDetails.setCreditScore(750L);
       userDetails.setHouseId(9566);
       userDetails.setIncome(1700000L);
       userDetails.setLocation("Bangalore");
       userDetails.setFirstName("Umesh");
       userDetails.setLastName("Kumar");
       return userDetails;
    }

    public static UserDetails returnPrasanthDetails(){
        UserDetails userDetails = new UserDetails();
        userDetails.setDob("06-01-1997");
        userDetails.setCreditScore(792L);
        userDetails.setHouseId(7708);
        userDetails.setIncome(1800000L);
        userDetails.setLocation("Mysore");
        userDetails.setFirstName("Prasanth");
        userDetails.setLastName("Lingan");
        return userDetails;
    }
}
