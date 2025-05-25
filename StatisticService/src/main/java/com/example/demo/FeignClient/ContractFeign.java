package com.example.demo.FeignClient;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.model.Contract;

@FeignClient(name="contract-service",url = "http://contract-service:8082")
public interface ContractFeign {
    @GetMapping("/contracts/customer/{customerId}")
    List<Contract> getContractsByCustomer(@PathVariable("customerId") Long customerId);
}
