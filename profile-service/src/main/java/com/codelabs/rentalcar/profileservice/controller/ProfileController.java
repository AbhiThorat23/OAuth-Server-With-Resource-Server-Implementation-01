package com.codelabs.rentalcar.profileservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.codelabs.rentalcar.commons.models.Customer;
import com.codelabs.rentalcar.profileservice.services.CustomerService;

@RestController
@RequestMapping("/service")
public class ProfileController {

	@Autowired
	private CustomerService customerService;

	@PostMapping("/customer")
	public Customer save(@RequestBody Customer customer) {
		return customerService.save(customer);
	}
	
	@GetMapping(value = "/profile")
    public Customer fetch(@RequestParam int profileId) {
        return customerService.fetchById(profileId);
    }

    @GetMapping(value = "/profiles")
    public List<Customer> fetchAll() {
        return customerService.fetchAllProfiles();
    }
}
