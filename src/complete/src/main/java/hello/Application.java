package hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpEntity;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.HttpStatus;
import java.util.*;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.MediaType;
import com.google.common.collect.ImmutableList;
import org.springframework.http.converter.StringHttpMessageConverter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import org.springframework.util.*;


@SpringBootApplication
public class Application {

	private static final Logger log = LoggerFactory.getLogger(Application.class);

	public static void main(String args[]) {
		SpringApplication.run(Application.class);
	}
	
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
		    
		    restTemplate.setInterceptors(Collections.singletonList(new RequestHeaderInterceptor()));
		    
            //List the dashboard administrators in this organization
				
			String dashboardAdmins = restTemplate.getForObject("https://dashboard.meraki.com/api/v0/organizations/{orgId}/admins", String.class, "660707");
			
			System.out.println("Dashboard adminstrators in this organization " + dashboardAdmins + "\n");
			
			//////////////////////////////////////////////////////////////////////////////////////////////////
			
			//List the networks in this organization
			
			String networks = restTemplate.getForObject("https://dashboard.meraki.com/api/v0/organizations/{orgId}/networks", String.class, "660707");
			
			System.out.println("Networks in this organization " + networks + "\n");
			
            //////////////////////////////////////////////////////////////////////////////////////////////////
			
            //List the devices in the network by networkId

             String devices = restTemplate.getForObject("https://dashboard.meraki.com/api/v0/networks/{networkId}/devices", String.class, "N_566327653141842928");

             System.out.println("Devices in this network " + devices + "\n");
			
			
			/////////////////////////////////////////////////////////////////////////////////////////////////
             
             //Display the organization details by organization id
		    
		    String orgDetails = restTemplate.getForObject("https://dashboard.meraki.com/api/v0/organizations/{orgId}", String.class, "660707");
		  
		    System.out.println("Organization Details:   " + orgDetails + "\n");
		   
		  
		};
	}
}