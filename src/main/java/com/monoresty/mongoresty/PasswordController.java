package com.monoresty.mongoresty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class PasswordController {
	
	@Autowired
	private CustomerRepository repository;
	
@RequestMapping(value="/password",method=RequestMethod.GET)	
public String checkpwd(@RequestParam(value="password") String pwd)
{
	
	
	repository.save(new Customer(pwd, "come"));
 return ("hellow"+pwd);
}

@RequestMapping(value="/",method=RequestMethod.POST)

public String checkpwd2(@RequestBody String pwd)
{
	
	
	repository.save(new Customer(pwd, "post"));
 return ("hellow"+pwd);
}



}