package com.cg.hotel.userException;

public class CustomerIdNotExist extends Exception {

	public  CustomerIdNotExist()
	{
		System.err.println("Entered custId does not exist");
	}
	
	
}
