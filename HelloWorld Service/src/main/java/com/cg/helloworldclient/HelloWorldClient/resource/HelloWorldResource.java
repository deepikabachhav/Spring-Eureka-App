package com.cg.helloworldclient.HelloWorldClient.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldResource {
	
	@Autowired
	private DiscoveryClient discoveryClient;
	
	@GetMapping
	 public String hello(){
		return "Hello World";
	 }

}
