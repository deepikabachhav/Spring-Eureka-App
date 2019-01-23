package com.cg.config.configurationclient.resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class Resource {
	
	 
		@Value("${message:Hello default}")
		private String message;

		@RequestMapping("/message")
		public String getMessage() {
			System.out.println(message);
			return this.message;
		}
		
}
