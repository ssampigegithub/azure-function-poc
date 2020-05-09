package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/patientService")
public class PatientServiceController 
{

	@RequestMapping("/")
	public String index() 
	{
		return "Hello! Patient service works!";
	}

	@RequestMapping("/getPatients")
	public String getPatients() 
	{
		return "THIS IS A PATIENT Modified!! ";
	}
	
}
