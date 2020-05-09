package com.example;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.microsoft.azure.functions.ExecutionContext;


@SpringBootApplication
public class FunctionsStarterApp
{
	
	//@Autowired
	//private ExecutionContext azureExecutionContext;
	
	@Bean
	public Function<String, String> loadClaims(ExecutionContext context) 
	{
		return value -> 
		{
			context.getLogger().info("loadClaims function... " + value);
			return value.toUpperCase();
		};
	}	
	
	/*@Bean
	public Function<String, String> loadSpecialtyDrugs(ExecutionContext context) 
	{
		return value -> 
		{
			context.getLogger().info("loadSpecialtyDrugs function... " + value);
			return value.toUpperCase();
		};
	}	
	*/
	
	public static void main(String args[])
	{
		SpringApplication.run(FunctionsStarterApp.class, args);
		System.out.println("Started Spring Boot application.");
		try
		{
			System.out.println("Available... @ http://" + InetAddress.getLocalHost().getHostAddress() + ":8080");
		} 
		catch (UnknownHostException e)
		{
			e.printStackTrace();
		}
	}

	/*@Override
	public void initialize(GenericApplicationContext applicationContext)
	{
		// TODO Auto-generated method stub
		
	}*/
}
