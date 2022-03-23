package com.cyber009.jcrm;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.metrics.buffering.BufferingApplicationStartup;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JcrmApplication {

  public static void main(String[] args) {
    SpringApplication application = new SpringApplication(JcrmApplication.class);
    application.setApplicationStartup(new BufferingApplicationStartup(8192));
    // System.out.println("🏁 server is running on http://localhost:");
    application.run(args);

  }

  @Bean
  public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
    return args -> {
      // System.out.println("Let's inspect the beans provided by Spring Boot:");
      // String[] beanNames = ctx.getBeanDefinitionNames();
      // Arrays.sort(beanNames);
      // for (String beanName : beanNames) {
      // System.out.println(beanName);
      // }
    };
  }

}
