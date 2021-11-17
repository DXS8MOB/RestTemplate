package com.RestTemplate.RestTemplate.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Groups {
	private String dn;
	private String cn;
	
	public String getDn() {
		return dn;
	}
	public void setDn(String dn) {
		this.dn = dn;
	}
	public String getCn() {
		return cn;
	}
	public void setCn(String cn) {
		this.cn = cn;
	}
	
	@Override
	public String toString() {
		return "Groups [dn=" + dn + ", cn=" + cn + "]";
	}
	

}
