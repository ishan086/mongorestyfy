package com.monoresty.mongoresty;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PasswordController {
@RequestMapping(value="/password",method=RequestMethod.GET)	

public String checkpwd(@RequestParam(value="password") String pwd)
{
	
 return ("hellow"+pwd);
}

}