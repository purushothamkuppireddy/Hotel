package com.cg.hotel.model;

public class Room {

	private String roomType;
	private String status;
		
	public Room(String roomType, String status) {
			
	this.roomType=roomType;
	this.status=status;
	}
	public Room() {
		// TODO Auto-generated constructor stub
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
