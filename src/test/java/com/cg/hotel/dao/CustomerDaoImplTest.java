package com.cg.hotel.dao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.cg.hotel.model.Customer;

class CustomerDaoImplTest {

	Customer customer= new Customer();
	CustomerDaoImpl dao= new CustomerDaoImpl();

	@Test
	void testCustDetails() {
		customer.setCustName("manisha");
		customer.setEmail("manisha@gmail.com");
		customer.setAddress("huda colony");
		customer.setMobileNo(779464);
		customer.setRoomType("AC_SINGLE");
		customer.setRoomNo(101);
  assertEquals(1001, dao.getCustomerDetails(customer));

	}
	@Test
	void testbookingStatus() {
		
  assertEquals(null, dao.bookingStatus(1000));

	}
}
