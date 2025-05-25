package com.example.demo.service;

import com.example.demo.model.Payment;
import com.example.demo.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository repository;

    public Payment save(Payment payment) {
        return repository.save(payment);
    }

    public List<Payment> getByContract(Long contractId) {
        return repository.findByContractId(contractId);
    }

    public List<Payment> getAll() {
        return repository.findAll();
    }
}
