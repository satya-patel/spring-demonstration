package com.example.springconcepts;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.example.springconcepts.component.DemoBean;
import com.example.springconcepts.component.EmployeeBean;

@SpringBootApplication
public class SpringconceptsApplication {
	public static Logger logger = LoggerFactory.getLogger(SpringconceptsApplication.class);

	public static void main(String[] args) {
		logger.debug("Welcome to spring concept demo !!!");
		ApplicationContext context = SpringApplication.run(SpringconceptsApplication.class, args);
		logger.debug("Checking context:" + context.getBean(DemoBean.class));
		EmployeeBean employeeBean = context.getBean(EmployeeBean.class);
		employeeBean.setEid(908);
		employeeBean.setEname("Pallavi Srivastava");
		employeeBean.showEmployeeDetails();
	}
}