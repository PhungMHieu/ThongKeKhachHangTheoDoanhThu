package com.example.demo.FeignClient;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.model.Payment;

@FeignClient(name="payment-service",url = "http://payment-service:8083")
public interface PaymentFeign {
    @GetMapping("/payments/contract/{contractId}")
    List<Payment> getPaymentsByContract(@PathVariable("contractId") Long contractId);
}
