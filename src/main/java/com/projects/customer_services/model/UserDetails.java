package com.projects.customer_services.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDetails {
    private String firstName;
    private String lastName;
    private String dob;
    private String location;
    private Long income;
    private Long creditScore;
    private int houseId;
}
