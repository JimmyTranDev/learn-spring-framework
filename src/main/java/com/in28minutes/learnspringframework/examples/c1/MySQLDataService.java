package com.in28minutes.learnspringframework.examples.c1;

import org.springframework.stereotype.Repository;

// @Component
@Repository
class MySQLDataService implements DataService {
  public int[] retrieveAllData() {
    return new int[] { 1, 2, 3, 4, 5 };
  }
}
