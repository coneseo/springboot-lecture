package com.coneseo.webservershowcase;

import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

//@Component 사실상 빈으로 등록할 필요가 없기 때문에 뺀다.
public class SimpleListener implements ApplicationListener<ApplicationStartingEvent> {

/**
 * ApplicationStartingEvent -> 어플리케이션이 실행될 때 실행된다. 그래서 빈으로 등록이 안돼서
 * 아래처럼 하면 실행이 안됨
 * 직접 등록을 해줘야한다.
 */

  @Override
  public void onApplicationEvent(ApplicationStartingEvent applicationStartingEvent) {
    System.out.println("==========================");
    System.out.println("Application is starting");
    System.out.println("=========================");
  }
}
