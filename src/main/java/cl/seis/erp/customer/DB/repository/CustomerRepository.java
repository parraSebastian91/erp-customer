package cl.seis.erp.customer.DB.repository;

import cl.seis.erp.customer.DB.entity.CustomerEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends MongoRepository<CustomerEntity, Integer> {
}
