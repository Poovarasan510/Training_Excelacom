package com.hotel;

public class Hotel {
	
	private String hotelName;
	private int items;
	private String vegNonveg;
	public Hotel(String hotelName, int items, String vegNonveg) {
		super();
		this.hotelName = hotelName;
		this.items = items;
		this.vegNonveg = vegNonveg;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public int getItems() {
		return items;
	}
	public void setItems(int items) {
		this.items = items;
	}
	public String getVegNonveg() {
		return vegNonveg;
	}
	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setVegNonveg(String vegNonveg) {
		this.vegNonveg = vegNonveg;
	}
	

}
