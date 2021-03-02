package com.customerapp.controller;

import java.util.Date;

import com.customerapp.dao.Customer;
import com.customerapp.service.CustomerService;
import com.customerapp.service.CustomerServiceImpl;

public class CutomerAppController {
	public static void main(String[] args) {
		CustomerService customerService = new CustomerServiceImpl();
		 
	    Date date = new Date();

		Customer customer1 = new Customer("Keshav", "Rohtak", "8901122055",date);
		Customer customer2 = new Customer("Raghav", "Rohtak", "7988796962",date);

		customerService.addCustomer(customer1);
		customerService.addCustomer(customer2);
		

		 System.out.println("--Get customer by id--");
         System.out.println(customerService.getCustomerById(1));

	}
}
