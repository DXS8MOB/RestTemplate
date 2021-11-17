package com.RestTemplate.RestTemplate.Constant;

public class SQL {

	public static final String INSERT_USER_DETAILS = 
			"INSERT INTO trainee_data (id,last_login,name,first_name,last_name,email,title,corp_location_number,location_number,location_type,vdi_flag) "
			+ "values(?,?,?,?,?,?,?,?,?,?,?)";

}
