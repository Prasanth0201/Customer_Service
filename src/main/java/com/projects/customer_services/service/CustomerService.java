package com.projects.customer_services.service;

import com.projects.customer_services.model.UserDetails;
import com.projects.customer_services.utils.CustomerUtility;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    public UserDetails fetchUserDetails(long accNo) {
        String accountNumber = String.valueOf(accNo);
        if (checkAccountNumberIsValid(accountNumber)) {
            throw new RuntimeException();
        }
        String updatedAccountNumber = updateAccountNumberFormat(accountNumber);

        return fetchUserDetailsAfterDoingMaths(updatedAccountNumber);
    }

    private boolean checkAccountNumberIsValid(String accNo) {
        if (accNo.length() < 9 || accNo.length() > 16) {
            return true;
        }
        return false;
    }

    private String updateAccountNumberFormat(String accNo) {
        StringBuilder stringBuilder = new StringBuilder(accNo);
        int lengthOfAccountNumber = stringBuilder.length();
        int lengthMissing = 16 - lengthOfAccountNumber;
        if (lengthMissing == 0) {
            return accNo;
        }
        for (int i = 0; i < lengthMissing; i++) {
            stringBuilder.insert(0, '0');

        }
        return stringBuilder.toString();
    }

    private UserDetails fetchUserDetailsAfterDoingMaths(String accNo) {
        char[] value = accNo.substring(accNo.length() - 3).toCharArray();
        if (findSumValue(value) % 2 == 0) {
            return CustomerUtility.returnUmeshDetails();
        }
        return CustomerUtility.returnPrasanthDetails();
    }

    private long findSumValue(char[] value){
        int sum =0;

        for(char count : value){
            sum+= count - '0';
        }
        if(sum>9) {
            return findSumValue(String.valueOf(sum).toCharArray());
        }
        return sum;
    }
}

