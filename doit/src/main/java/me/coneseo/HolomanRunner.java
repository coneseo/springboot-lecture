package me.coneseo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

public class HolomanRunner implements ApplicationRunner {

  //Holoman을 bean으로 등록하지 않았지만 autowired가 된다.
  @Autowired
  Holoman holoman;

  @Override
  public void run(ApplicationArguments args) throws Exception {
    System.out.println(holoman);
  }
}
