package com.ks.cfk.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/*
 * Spring Boot Auto Configuration automatically configures your Spring application based on the JAR dependencies you added in the project. For example, if MySQL database is on your
class path, but you have not configured any database connection, then Spring Boot autoconfigures an in-memory database. For this purpose, you need to add @EnableAutoConfiguration annotation or
@SpringBootApplication annotation to your main class file. Then, your Spring Boot application will be automatically configured.*/

  /* @ComponentScan("com.ks.cfk")
  Spring Boot application scans all the beans and package declarations when the application initializes.
  You need to add the @ComponentScan annotation for your class file to scan your components added in your project.*/


/*If you added @SpringBootApplication annotation to the class, you do not need to add the @EnableAutoConfiguration, @ComponentScan and @SpringBootConfiguration annotation.*/


@SpringBootApplication
public class ServletInitializer /*implements  ApplicationRunner*/ extends SpringBootServletInitializer {
	
	//--------------------------------------------------------
	// extends SpringBootServletInitializer - if not use this one add web.xml 
	
	/*@Override 
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ServletInitializer.class);
	}*/
	
	// ----------------------------------------
	
	public static void main(String[] args) {
		SpringApplication.run(ServletInitializer.class, args);
	}
	
//---------------------------------------------------
	// implements  ApplicationRunner
	
	/*@Value("${cfk.nationalities}")
	private String nationalities;

	@Override
	public void run(ApplicationArguments args) throws Exception {	
		System.out.println( "nationalities " + nationalities);		
	}*/
// -------------------------------------------------------
	
	
}
