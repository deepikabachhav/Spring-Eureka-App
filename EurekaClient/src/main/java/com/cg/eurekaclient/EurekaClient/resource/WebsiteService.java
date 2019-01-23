package com.cg.eurekaclient.EurekaClient.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class WebsiteService {
	
	 @Autowired
	    private DiscoveryClient discoveryClient;
	 
	 @Autowired
	 private RestTemplate restTmplate;
	 
	/*
	 * @RequestMapping("/service-instances/{applicationName}") public
	 * List<ServiceInstance> serviceInstancesByApplicationName(
	 * 
	 * @PathVariable String applicationName) { return
	 * this.discoveryClient.getInstances(applicationName); }
	 */
	 
	 @RequestMapping("/hello")
	 public String helloWorld(Model model) {
		String world= restTmplate.exchange("http://helloservice",HttpMethod.GET,null,new ParameterizedTypeReference<String>() {}).getBody();
		model.addAttribute("world",world);
		return "Hello";
	 }
	 
}


