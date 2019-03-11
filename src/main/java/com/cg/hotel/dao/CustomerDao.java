package com.cg.hotel.dao;

import com.cg.hotel.model.Customer;
import com.cg.hotel.model.Room;

public interface CustomerDao {
	int getCustomerDetails(Customer customer);
	Customer bookingStatus(int custId);

}
