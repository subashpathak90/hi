package com.cubic.rest.vehicle;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import com.cubic.rest.vehicle.resource.CustomerResource;
import com.cubic.rest.vehicle.resource.HelloWorld;

@Configuration
public class RestConfig extends ResourceConfig {
	
	public RestConfig() {
		this.register(HelloWorld.class);
		this.register(CustomerResource.class);
	}

}
