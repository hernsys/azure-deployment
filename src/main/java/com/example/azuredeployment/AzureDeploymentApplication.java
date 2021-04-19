package com.example.azuredeployment;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class AzureDeploymentApplication {

	public static void main(String[] args) {
		SpringApplication.run(AzureDeploymentApplication.class, args);
	}

}
