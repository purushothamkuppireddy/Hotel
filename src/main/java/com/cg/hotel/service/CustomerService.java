package com.cg.hotel.service;

import com.cg.hotel.model.Customer;

public interface CustomerService {
	int getCustomerDetails(Customer customer);
	Customer bookingStatus(int custId);
}
