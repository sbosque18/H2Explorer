package com.tts.h2explore.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tts.h2explore.models.Customer;

@Repository
public interface CustomerRepository extends CrudRepository <Customer, Long>{
	List<Customer> findByLastName(String lastName);
}

