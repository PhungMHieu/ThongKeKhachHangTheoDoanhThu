package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Contract;
import com.example.demo.repository.ContractRepository;

import java.util.List;

@Service
public class ContractService {

    @Autowired
    private ContractRepository repository;

    public List<Contract> getContractsByCustomer(Long customerId) {
        return repository.findByCustomerId(customerId);
    }

    public Contract saveContract(Contract contract) {
        return repository.save(contract);
    }

    public List<Contract> getAll() {
        return repository.findAll();
    }
}
