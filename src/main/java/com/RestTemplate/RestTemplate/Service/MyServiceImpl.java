package com.RestTemplate.RestTemplate.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.RestTemplate.RestTemplate.Dao.DetailDao;
import com.RestTemplate.RestTemplate.Entity.Detail;
import com.RestTemplate.RestTemplate.Entity.Groups;


@Service
public class MyServiceImpl implements MyService {

	public Detail detail;
	
	@Autowired
	private DetailDao detailDao;
	
	public String vdi_flag = "N";
	
	

	@Autowired
	private RestTemplate restTemplate;
	@Override
	public void insertData(String id) {
		
		
		
		try{
			
			detail= restTemplate.getForObject("https://dapper.apps.homedepot.com/users/" + id, Detail.class);
		
		System.out.println(detail);
		
		List<Groups> groupList = detail.getGroups();
		for (Groups grps : groupList) {
		String cn = grps.getCn();
		if (cn.equals("GG_VDI_PROD_A_TLM_TECHNOLOGY_LIFECYCLE_MANAGEMENT")) {
		vdi_flag = "Y";
		break;
		}
		}
		detailDao.insertUserDetails(detail.getId(),detail.getLast_login(), detail.getName(),
				detail.getFirst_name(),detail.getLast_name(),detail.getEmail(), detail.getTitle(),
				detail.getCorp_location_number(), detail.getLocation_number(), detail.getLocation_type(),
		vdi_flag);
	}
		
		
		catch  (Exception e) 
		
		{
		e.printStackTrace();
	}
			
		
}
	

		


	@Override
	public void deleteData(String id) {
		
		try {
			
		
		detail= restTemplate.getForObject("https://dapper.apps.homedepot.com/users/" + id, Detail.class);
		System.out.println(detail);
		
		List<Groups> groupList = detail.getGroups();
		for (Groups grps : groupList) {
		String cn = grps.getCn();
		if (cn.equals("GG_VDI_PROD_A_TLM_TECHNOLOGY_LIFECYCLE_MANAGEMENT")) {
		vdi_flag = "Y";
		break;
		
		}	
	}
		detailDao.deleteUserDetails(detail.getId());
		
		
}
	     catch (Exception e) 
	
		{
	   
	    	 e.printStackTrace();
	}
		
 }	

}		