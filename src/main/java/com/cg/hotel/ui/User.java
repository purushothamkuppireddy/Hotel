package com.cg.hotel.ui;

import java.util.Scanner;

import com.cg.hotel.dao.CustomerDao;
import com.cg.hotel.dao.CustomerDaoImpl;
import com.cg.hotel.model.Customer;
import com.cg.hotel.service.CustomerService;
import com.cg.hotel.service.CustomerServiceImpl;
import com.cg.hotel.userException.CustomerIdNotExist;

public class User {

	 static Customer customer=new Customer();
	 //static Customer customer2=new Customer();
	 static CustomerService ser=new CustomerServiceImpl();
	public static void main(String[] args)
	{
		
		int i=1;
		int j;
		do{
		System.out.println("eneter the choice 1:Book Room  2.View Booking status  3.Exit");
		Scanner sc=new Scanner(System.in);
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1: System.out.println("Enter Customer name:");
				customer.setCustName(sc.next());
				System.out.println("Enter Email: ");
				customer.setEmail(sc.next());
				System.out.println("Enter Customer Address: ");
				customer.setAddress(sc.next());
				System.out.println("Enter mobile Number: ");
				customer.setMobileNo(sc.nextLong());
				System.out.println("Enter RoomNo: ");
				customer.setRoomNo(sc.nextInt());
				System.out.println("Enter RoomType: ");
				customer.setRoomType(sc.next());
			 j= ser.getCustomerDetails(customer);	
		
			if(i!=0)
		{
			System.out.println("Successfully registered.CustId is: "+j);
		}
			break;
		
		case 2://view booking details
			
			System.out.println("Enter the CustId");
			Customer customer3=new Customer();
			customer=ser.bookingStatus(sc.nextInt());
			if(customer!=null)
			{
				System.out.println("Name of customer: "+customer.getCustName());
				System.out.println("Room No: "+customer.getRoomNo());
				System.out.println("Room Type: "+customer.getRoomType());
				System.out.println("Booking status:BOOKED");
			}
			else
			{
				try {
					throw new CustomerIdNotExist();
				} catch (CustomerIdNotExist e) {
					}
			}
			
			
			break;
			
		
			case 3://exit
			System.out.println("Thank You..");
			System.exit(0);
			
		}
		
	}while(i==1);
	
}
	
}
	
	

