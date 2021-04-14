package com.gms.model;

public class Extramembers {

	private String noofchildren;
	private String noofadults;
	
	public Extramembers() {
		
	}
	public Extramembers(String noofchildren, String noofadults) {
		super();
		this.noofchildren = noofchildren;
		this.noofadults = noofadults;
	}
	public String getNoofchildren() {
		return noofchildren;
	}
	public void setNoofchildren(String noofchildren) {
		this.noofchildren = noofchildren;
	}
	public String getNoofadults() {
		return noofadults;
	}
	public void setNoofadults(String noofadults) {
		this.noofadults = noofadults;
	}
	
}