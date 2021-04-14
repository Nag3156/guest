package com.gms.model;

public class Room {
	private String roomnumber;
    private int noofnights;
    
    public Room() {
    	
    }
	public Room(String roomnumber, int noofnights) {
		super();
		this.roomnumber = roomnumber;
		this.noofnights = noofnights;
	}
	public String getRoomnumber() {
		return roomnumber;
	}
	public void setRoomnumber(String roomnumber) {
		this.roomnumber = roomnumber;
	}
	public int getNoofnights() {
		return noofnights;
	}
	public void setNoofnights(int noofnights) {
		this.noofnights = noofnights;
	}
    
}
