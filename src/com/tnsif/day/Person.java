package com.tnsif.day;

public class Person {
	private String name;
	private long cust_id;
	private String cust_name;
	private String item;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getCust_id() {
		return cust_id;
	}
	public void setCust_id(long cust_id) {
		this.cust_id = cust_id;
	}
	public String getCust_name() {
		return cust_name;
	}
	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", cust_id=" + cust_id + ", cust_name=" + cust_name + ", item=" + item + "]";
	}

}
