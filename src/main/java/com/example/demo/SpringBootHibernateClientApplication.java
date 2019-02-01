package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SpringBootHibernateClientApplication implements CommandLineRunner {

	@Autowired
    RestTemplate restTemplate;

	
	@Value("${client.uri}")
	private String uri;
	
	@Bean
	public RestTemplate createRestTemplate() {
		return new RestTemplate();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootHibernateClientApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		getMethodExample();
		postMehtodExample();
		
	}
	/**
	 * 
	 */
	private void postMehtodExample() {
		
		System.out.println(">>>>>>>>>>>>post method Call Starts here>>>>>>>>>>>>>" + uri);
		String resourceURL = uri+"create";
		UserDetails user = new UserDetails(21, "NAMEINFO as COUNTRY", "COUNTRY as NAMEINFO");
		UserDetails userReturned = restTemplate.postForObject(resourceURL, user, UserDetails.class);
		System.out.println(" Returned User " + userReturned.getNameInfo());
		System.out.println(">>>>>>>>>>>>post method Call Ends here>>>>>>>>>>>>> \n\n\n");
	}
	
	/**
	 * 
	 */
	private void getMethodExample() {
		
		System.out.println(">>>>>>>>>>>>Get method Call Starts here>>>>>>>>>>>>>\n");
		String resourceURL =  uri+"get";
		UserDetails[] userDetails = restTemplate.getForObject(resourceURL, UserDetails[].class);
		for (UserDetails userDetail : userDetails) {
			System.out.println("ID value received " + userDetail.getId() + " Name " + userDetail.getNameInfo()
					+ " Country " + userDetail.getCountryName());
		}
		System.out.println(">>>>>>>>>>>>Get method Call Ends here>>>>>>>>>>>>>\n\n\n");
	}

}
