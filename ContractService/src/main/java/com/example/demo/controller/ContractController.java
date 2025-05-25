package com.example.demo.controller;

import com.example.demo.model.Contract;
import com.example.demo.service.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contracts")
public class ContractController {

    @Autowired
    private ContractService contractService;

    @GetMapping("/customer/{customerId}")
    public List<Contract> getByCustomer(@PathVariable Long customerId) {
        return contractService.getContractsByCustomer(customerId);
    }

    @PostMapping
    public Contract createContract(@RequestBody Contract contract) {
        return contractService.saveContract(contract);
    }

    @GetMapping
    public List<Contract> getAll() {
        return contractService.getAll();
    }
}
