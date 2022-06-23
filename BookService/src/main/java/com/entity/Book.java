package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Book {
	
	@Id
	@GeneratedValue
	private int bid;
	private String bname;
	private String tech;
	public int getbid() {
		return bid;
	}
	public void setbid(int bid) {
		this.bid = bid;
	}
	public String getbname() {
		return bname;
	}
	public void setbname(String bname) {
		this.bname = bname;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	@Override
	public String toString() {
		return "Book [bid=" + bid + ", bname=" + bname + ", tech=" + tech + "]";
	}
}
