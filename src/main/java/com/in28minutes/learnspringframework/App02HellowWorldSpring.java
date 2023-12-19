package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HellowWorldSpring {

  public static void main(String[] args) {
    // 1: Launch a Spring Context
    // 2: Configure the things that we want Spring to manage
    var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

    System.out.println(context.getBean("name"));
  }

}
