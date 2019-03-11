package com.cg.hotel.model;

public class Customer {

	private  String custName;
	private String email;
	private String address;
	private long mobileNo;
	private String roomType;
	private int roomNo;
	
	
	public Customer(String custName2, String email2, String address2, long mobileNo2, int roomNo2, String roomType2) {
		this.custName = custName2;
		this.email = email2;
		this.address = address2;
		this.mobileNo = mobileNo2;
		this.roomNo = roomNo2;
		this.roomType = roomType2;
	
	}
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public int getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}
	
	
	
	
	
}
