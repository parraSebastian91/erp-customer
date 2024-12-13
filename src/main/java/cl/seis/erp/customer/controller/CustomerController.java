package cl.seis.erp.customer.controller;


import cl.seis.erp.customer.DB.entity.CustomerEntity;
import cl.seis.erp.customer.DTO.CustomerRequestDTO;
import cl.seis.erp.customer.services.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    CustomerServiceImpl customerService;

    @PostMapping
    public ResponseEntity<CustomerEntity> setCustomer(@RequestBody CustomerRequestDTO DTO){
        return ResponseEntity.ok(customerService.setCustomer(DTO));
    }

    @GetMapping
    public ResponseEntity<List<CustomerEntity>> getCustomer(){
        return ResponseEntity.ok(customerService.getCustomers());
    }

    @GetMapping("/{rut}")
    public ResponseEntity<CustomerEntity> customerFindByRut(@PathVariable("rut") int rut){
        return ResponseEntity.ok(customerService.findByRut(rut));
    }

}
