package com.ty.simplebootapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	
	@GetMapping("/info")
	public String msg()
	{
		return "All the Best";
	}
	
	@GetMapping("/contact")
	public double contact()
	{
		return 988101;
	}

}
