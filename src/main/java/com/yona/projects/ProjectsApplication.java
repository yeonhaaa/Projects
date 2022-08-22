package com.yona.projects;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication()
public class ProjectsApplication {

	public static void main(String[] args) {

		SpringApplication.run(ProjectsApplication.class, args);
	}

}
