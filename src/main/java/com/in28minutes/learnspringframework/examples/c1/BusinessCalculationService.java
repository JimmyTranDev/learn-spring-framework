package com.in28minutes.learnspringframework.examples.c1;

import java.util.Arrays;

import org.springframework.stereotype.Component;

@Component
class BusinessCalulcationService {
  DataService dataService;

  public BusinessCalulcationService(DataService dataService) {
    super();
    this.dataService = dataService;
  }

  public int findMax() {
    return Arrays.stream(dataService.retrieveAllData()).max().orElse(0);
  }
}
