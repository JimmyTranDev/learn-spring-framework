package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class HelloWorldConfiguration {

  @Bean
  public String name() {
    return "Ranga";
  }

}
