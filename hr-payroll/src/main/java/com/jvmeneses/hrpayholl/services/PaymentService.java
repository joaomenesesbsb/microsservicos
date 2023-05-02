package com.jvmeneses.hrpayholl.services;

import com.jvmeneses.hrpayholl.entities.Payment;
import com.jvmeneses.hrpayholl.entities.Worker;
import com.jvmeneses.hrpayholl.feignClients.WorkerFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    private WorkerFeignClient workerFeignClient;

    public Payment getPayment(long workerId , int days){

        Worker worker = workerFeignClient.findById(workerId).getBody();
        return new Payment(worker.getName(), worker.getDailyIncome(), days);
    }
}
