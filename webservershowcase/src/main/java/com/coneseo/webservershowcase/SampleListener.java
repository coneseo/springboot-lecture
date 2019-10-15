package com.coneseo.webservershowcase;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class SampleListener implements ApplicationListener<ApplicationStartedEvent> {

/**
 * ApplicationStartedEvent -> 어플리케이션이 실행될 때 실행된다. 그래서 빈으로 등록이 안돼서

 */

  @Override
  public void onApplicationEvent(ApplicationStartedEvent applicationStartedEvent) {
    System.out.println("==========================");
    System.out.println("Application is started");
    System.out.println("=========================");
  }
}
