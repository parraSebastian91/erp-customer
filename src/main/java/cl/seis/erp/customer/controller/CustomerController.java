package cl.seis.erp.customer.controller;


import cl.seis.erp.customer.DB.entity.CustomerEntity;
import cl.seis.erp.customer.DTO.CustomerRequestDTO;
import cl.seis.erp.customer.services.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    CustomerServiceImpl customerService;

    @PostMapping
    public CustomerEntity setCustomer(@RequestBody CustomerRequestDTO DTO){
        return customerService.setCustomer(DTO);
    }

    @GetMapping
    public List<CustomerEntity> getCustomer(){
        return customerService.getCustomers();
    }

}
