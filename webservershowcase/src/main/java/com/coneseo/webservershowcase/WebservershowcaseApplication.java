package com.coneseo.webservershowcase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class WebservershowcaseApplication {
  @GetMapping("/hellospring")
  public String hello(){
    return "helllo spring";
  }

  /**
   * 커넥터를 코딩으로 추가한 부분
   * @param args
   *
   */
//  @Bean
//  public ServletWebServerFactory serverContainer(){
//    TomcatServletWebServerFactory tomcat = new TomcatServletWebServerFactory();
//    tomcat.addAdditionalTomcatConnectors(createStandardConnector());
//    return tomcat;
//  }
//
//  private Connector createStandardConnector() {
//    Connector connector = new Connector("org.apache.coyote.http11.Http11NioProtocol");
//    connector.setPort(8080);
//    return connector;
//  }

  public static void main(String[] args) {
    SpringApplication.run(WebservershowcaseApplication.class, args);
  }

}
