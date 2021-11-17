package com.RestTemplate.RestTemplate.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.RestTemplate.RestTemplate.Service.MyService;

@RestController
@RequestMapping
public class MyController {

	@Autowired
	private MyService myService;
	
	@GetMapping("/Insertmydetail/{Id}")
	public String insertId(@PathVariable String Id) {
		myService.insertData(Id);
		return "Done";
		
	}
	@DeleteMapping("/Deletemydetail/{Id}")
	public String deleteLdapId(@PathVariable String Id)  {
		myService.deleteData(Id);
		return "Done";
	}
}
