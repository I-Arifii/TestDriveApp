package com.example.persitance.repository;

//import java.util.List;
//import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.persitence.domain.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{
	
//	@Query("select c from Customer where c.CustomerName=?1")
//	Optional<List<Customer>> customerByName(String CustomerName);

}
