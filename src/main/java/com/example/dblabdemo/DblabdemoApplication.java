package com.example.dblabdemo;

import org.apache.catalina.servlets.WebdavServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DblabdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DblabdemoApplication.class, args);
	}

	@Bean
	ServletRegistrationBean h2servletRegistration() {
		ServletRegistrationBean registrationBean = new ServletRegistrationBean( new WebdavServlet());
		registrationBean.addUrlMappings("/console/*");
		return registrationBean;
	}
}
