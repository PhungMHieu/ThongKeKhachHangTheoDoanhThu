package com.example.demo.controller;

import com.example.demo.model.Payment;
import com.example.demo.service.PaymentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping
    public Payment create(@RequestBody Payment payment) {
        return paymentService.save(payment);
    }

    @GetMapping("/contract/{contractId}")
    public List<Payment> getByContract(@PathVariable Long contractId) {
        return paymentService.getByContract(contractId);
    }

    @GetMapping
    public List<Payment> getAll() {
        return paymentService.getAll();
    }
}
