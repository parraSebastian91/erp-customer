package cl.seis.erp.customer.services;

import cl.seis.erp.customer.DB.entity.CustomerEntity;
import cl.seis.erp.customer.DB.repository.CustomerRepository;
import cl.seis.erp.customer.DTO.CustomerRequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

@Service
public class CustomerServiceImpl {

    @Autowired
    CustomerRepository customerRepository;

    public List<CustomerEntity> getCustomers(){
        return customerRepository.findAll();
    }

    public CustomerEntity setCustomer(CustomerRequestDTO DTO){
        CustomerEntity customer = new CustomerEntity(
                this.autoIncrementId(),
                DTO.getRut(),
                DTO.getDvCliente(),
                DTO.getNombre(),
                DTO.getTelefono(),
                DTO.getCorreo()
        );
        return customerRepository.save(customer);
    }

    public CustomerEntity findByRut(int rut){
        return customerRepository.findByRut(rut);
    }



    // private Method

    private int autoIncrementId(){
        List<CustomerEntity> customers = customerRepository.findAll();
        return customers.isEmpty() ? 1 : customers.stream().max(Comparator.comparing(CustomerEntity::getId)).get().getId() +1;
    }


}
