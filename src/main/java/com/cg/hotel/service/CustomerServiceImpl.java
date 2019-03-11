package com.cg.hotel.service;

import com.cg.hotel.dao.CustomerDao;
import com.cg.hotel.dao.CustomerDaoImpl;
import com.cg.hotel.model.Customer;

public class CustomerServiceImpl implements CustomerService {
CustomerDao dao=new CustomerDaoImpl() ;
Customer customer=new Customer();
	public int getCustomerDetails(Customer customer) {
		int j= dao.getCustomerDetails(customer);	
		
		return j;
	}

	public Customer bookingStatus(int custId) {
		
		customer=dao.bookingStatus(custId);
		
		return customer;
	}
		
		
	}

