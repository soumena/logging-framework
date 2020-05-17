package com.sa.logprovider.framework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.sa.logprovider.framework.core.LoggerImpl;

@SpringBootApplication
public class LogProviderFrameworkApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ApplicationContext 
		= SpringApplication.run(LogProviderFrameworkApplication.class, args);
		
		LoggerImpl logger = ApplicationContext.getBean(LoggerImpl.class);
		
		logger.logMessage("This message is printed using extensible logging framework.");
	}

}
