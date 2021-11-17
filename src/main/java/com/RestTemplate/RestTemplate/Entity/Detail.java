package com.RestTemplate.RestTemplate.Entity;

import java.util.List;

public class Detail {
	private String id;
	private String Last_login;
	private String name;
	private String first_name;
	private String last_name;
	private String email;
	private String title;
	private int corp_location_number;
	private int location_number;
	private String location_type;
	
	private List<Groups>groups;

	

	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLast_login() {
		return Last_login;
	}

	public void setLast_login(String last_login) {
		Last_login = last_login;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getCorp_location_number() {
		return corp_location_number;
	}

	public void setCorp_location_number(int corp_location_number) {
		this.corp_location_number = corp_location_number;
	}

	public int getLocation_number() {
		return location_number;
	}

	public void setLocation_number(int location_number) {
		this.location_number = location_number;
	}

	public String getLocation_type() {
		return location_type;
	}

	public void setLocation_type(String location_type) {
		this.location_type = location_type;
	}

	public List<Groups> getGroups() {
		return groups;
	}

	public void setGroups(List<Groups> groups) {
		this.groups = groups;
	}

	public Detail(String id, String last_login, String name, String first_name, String last_name, String email,
			String title, int corp_location_number, int location_number, String location_type, List<Groups> groups) {
		super();
		this.id = id;
		Last_login = last_login;
		this.name = name;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.title = title;
		this.corp_location_number = corp_location_number;
		this.location_number = location_number;
		this.location_type = location_type;
		this.groups = groups;
	}

	@Override
	public String toString() {
		return "Detail [id=" + id + ", Last_login=" + Last_login + ", name=" + name + ", first_name=" + first_name
				+ ", last_name=" + last_name + ", email=" + email + ", title=" + title + ", corp_location_number="
				+ corp_location_number + ", location_number=" + location_number + ", location_type=" + location_type
				+ ", groups=" + groups + "]";
	}

}