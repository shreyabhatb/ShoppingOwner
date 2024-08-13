package com.tnsif.ShopOwner1;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Owner {

	@Id
	private int ownerid;
	private String Oname;
	private String address;
	private String shopname;
	public Owner() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Owner(int ownerid, String oname, String address, String shopname) {
		super();
		this.ownerid = ownerid;
		Oname = oname;
		this.address = address;
		this.shopname = shopname;
	}
	public int getOwnerid() {
		return ownerid;
	}
	public void setOwnerid(int ownerid) {
		this.ownerid = ownerid;
	}
	public String getOname() {
		return Oname;
	}
	public void setOname(String oname) {
		Oname = oname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getShopname() {
		return shopname;
	}
	public void setShopname(String shopname) {
		this.shopname = shopname;
	}
	@Override
	public String toString() {
		return "Owner [ownerid=" + ownerid + ", Oname=" + Oname + ", address=" + address + ", shopname=" + shopname
				+ "]";
	}
	

}
