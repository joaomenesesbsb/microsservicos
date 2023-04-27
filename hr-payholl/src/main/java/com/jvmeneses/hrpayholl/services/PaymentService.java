package com.jvmeneses.hrpayholl.services;

import com.jvmeneses.hrpayholl.entities.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public Payment getPayment(long id , int days){
        return new Payment("bob", 200.0, days);
    }
}
