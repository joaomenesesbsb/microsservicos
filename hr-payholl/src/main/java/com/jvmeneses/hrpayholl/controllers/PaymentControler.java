package com.jvmeneses.hrpayholl.controllers;

import com.jvmeneses.hrpayholl.entities.Payment;
import com.jvmeneses.hrpayholl.services.PaymentService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/payments")
public class PaymentControler {

    @Autowired
    private PaymentService paymentService;

    @HystrixCommand(fallbackMethod = "getPaymentAlternative")
    @GetMapping(value = "/{workerId}/days/{days}")
    public ResponseEntity<Payment> getPayment(@PathVariable long workerId, @PathVariable int days){
        return ResponseEntity.ok(paymentService.getPayment(workerId, days));
    }

    public ResponseEntity<Payment> getPaymentAlternative(long workerId, int days){
        Payment payment = new Payment("João", 400.0, days );
        return ResponseEntity.ok(payment);
    }
}
