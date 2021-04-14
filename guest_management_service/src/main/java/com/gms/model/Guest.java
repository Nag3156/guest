package com.gms.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Guestdetails")
public class Guest {

	@Id
	private long id;
	private String age;
	private String guestname;
	private String gender;
	private String emailid;
	private String mobileno;
	
	private List<Extramembers>memberDetails;
	private Address address;
	
	private String currentStatus;
	private Room roomdetails;
	
	public Guest() {}
	
	
	//this particular method is used for put method since guest is updated by id
	public Guest (long id, String age, String guestname, String gender, String emailid, String mobileno,List<Extramembers>memberDetails,
			Address address,String currentStatus,Room roomdetails) {
		super();
		this.id=id;
		this.age = age;
		this.guestname = guestname;
		this.gender = gender;
		this.emailid = emailid;
		this.mobileno = mobileno;
		this.memberDetails = memberDetails;
		this.address = address;
		this.currentStatus = currentStatus;
		this.roomdetails = roomdetails;
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getGuestname() {
		return guestname;
	}

	public void setGuestname(String guestname) {
		this.guestname = guestname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	public List<Extramembers> getMemberDetails() {
		return memberDetails;
	}

	public void setMemberDetails(List<Extramembers> memberDetails) {
		this.memberDetails = memberDetails;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getCurrentStatus() {
		return currentStatus;
	}

	public void setCurrentStatus(String currentStatus) {
		this.currentStatus = currentStatus;
	}

	public Room getRoomdetails() {
		return roomdetails;
	}

	public void setRoomdetails(Room roomdetails) {
		this.roomdetails = roomdetails;
	}

	@Override
	public String toString() {
		return "Guest [id=" + id + ", guestname=" + guestname + ", gender=" + gender + ", emailid=" + emailid
				+ ", mobileno=" + mobileno + ", memberDetails=" + memberDetails + ", address=" + address
				+ ", currentStatus=" + currentStatus + ", roomdetails=" + roomdetails + "]";
	}
	
	}