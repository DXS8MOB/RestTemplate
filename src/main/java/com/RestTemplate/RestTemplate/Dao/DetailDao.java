package com.RestTemplate.RestTemplate.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.RestTemplate.RestTemplate.Constant.SQL;



@Repository
public class DetailDao {

	
	
	@Autowired 
	private JdbcTemplate jdbcTemplate;
	
	// inserting into DB
		public int insertUserDetails(String id, String last_login, String name, String firstname, String lastname,
				String email, String title, Integer corp, Integer locationnumber, String locationtype,
				String vdi_flag) {

			String sql = SQL.INSERT_USER_DETAILS;

			int update = jdbcTemplate.update(sql, new Object[] { id, last_login, name, firstname, lastname, email, title,
					corp, locationnumber, locationtype, vdi_flag });
			return update;

		}

		public int deleteUserDetails(String id) {

			String sql = "DELETE FROM trainee_data where id = ?";
			int update = jdbcTemplate.update(sql, id);
			return update;

}
}
