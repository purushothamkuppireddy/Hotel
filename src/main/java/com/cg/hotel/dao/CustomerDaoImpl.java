package com.cg.hotel.dao;

import java.util.HashMap;
import java.util.Map;

import com.cg.hotel.model.Customer;
import com.cg.hotel.model.Room;

public class CustomerDaoImpl implements CustomerDao {
	Room room = new Room();
	int count = 1000;
	
	Map<Integer, Room> roomEntry = new HashMap<Integer, Room>();
	Map<Integer, Customer> customerEntry = new HashMap<Integer, Customer>();
	Customer cust=new Customer();
	public CustomerDaoImpl() {

		roomEntry.put(101, new Room("AC_SINGLE", "NOT_BOOKED"));
		roomEntry.put(102, new Room("AC_SINGLE", "NOT_BOOKED"));
		roomEntry.put(103, new Room("AC_DOUBLE", "NOT_BOOKED"));
		roomEntry.put(201, new Room("NONAC_SINGLE", "NOT_BOOKED"));
		roomEntry.put(202, new Room("NONAC_SINGLE", "NOT_BOOKED"));
		roomEntry.put(203, new Room("NONAC_DOUBLE", "NOT_BOOKED"));
	}

	public int getCustomerDetails(Customer customer) {
		int c = 0;
		for (Map.Entry<Integer, Room> me : roomEntry.entrySet()) {
			if (me.getKey().equals(customer.getRoomNo())) {
				room = roomEntry.get(customer.getRoomNo());
				if (customer.getRoomType().equals(room.getRoomType())) {
					if (room.getStatus().equals("NOT_BOOKED")) {

						System.out.println("available");
						customerEntry.put(count,
								new Customer(customer.getCustName(), customer.getEmail(), customer.getAddress(),
										customer.getMobileNo(), customer.getRoomNo(), customer.getRoomType()));
						c++;
						count++;
						break;
					}
				}
			}

		}
		System.out.println(customerEntry.keySet());

		if (c == 0) {
			System.out.println("Room does not exist");
			return 0;
		} else {
			room.setStatus("Booked");
			System.out.println(room.getStatus());
			return count-1;
		}

	}

	public Customer bookingStatus(int custId) {
		Customer customer = new Customer();
		int c = 0;
//		for (Map.Entry me2 : customerEntry.entrySet()) {
//				System.out.println(me2.getValue());
//				if (me2.getKey().equals(custId)) {
//					System.out.println("exists");
//					customer = (Customer) me2.getValue();
//		c++;
//				}
	
	//or	
		if(customerEntry.containsKey(custId)) {
			customer=(Customer) customerEntry.get(custId);
			//return customer;
		c++;
		}
		

			
	if (c == 0)
			return null;
		else
			return customer;

	
}

	}

