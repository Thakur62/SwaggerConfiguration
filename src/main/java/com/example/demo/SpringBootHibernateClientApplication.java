package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SpringBootHibernateClientApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootHibernateClientApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		RestTemplate restTemplate = new RestTemplate();
		String resourceURL = "http://localhost:8080/user/get";
		UserDetails[] userDetails = restTemplate.getForObject(resourceURL,UserDetails[].class);
		for(UserDetails userDetail : userDetails) {
			System.out.println("ID value received " + userDetail.getId() + " Name " + userDetail.getNameInfo() + " Country " + userDetail.getCountryName());
		}
		}
		
}
