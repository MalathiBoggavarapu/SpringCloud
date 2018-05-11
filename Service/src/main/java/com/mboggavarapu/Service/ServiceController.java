package com.mboggavarapu.Service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {
	
	@Value("${service.instance.name}")
	private String instance;
	
	@RequestMapping("/")
	public String message() {
		return "Hello from " + instance;
	}
}
