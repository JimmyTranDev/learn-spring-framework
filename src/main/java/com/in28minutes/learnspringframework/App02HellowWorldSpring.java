package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HellowWorldSpring {

  public static void main(String[] args) {
    // 1: Launch a Spring Context
    var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

    // 2: Configure the things that we want Spring to manage

    // 3: Get the beans managed by Spring
    System.out.println(context.getBean("name"));
    System.out.println(context.getBean("age"));
    System.out.println(context.getBean("person"));
    System.out.println(context.getBean("address"));
  }

}
