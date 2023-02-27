package com.barclays.reclite.connector;

import org.apache.camel.spring.boot.CamelSpringBootApplicationController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class RecliteApplication {

	public static void main(String[] args) throws Exception {
		ApplicationContext ctx = SpringApplication.run(RecliteApplication.class, args);
		CamelSpringBootApplicationController applicationController = ctx.getBean(CamelSpringBootApplicationController.class);
		applicationController.run();
	}

}
