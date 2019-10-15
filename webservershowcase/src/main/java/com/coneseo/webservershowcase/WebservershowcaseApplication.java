package com.coneseo.webservershowcase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
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
    //SpringApplication.run(WebservershowcaseApplication.class, args);
    /**
     * 반드시 SpringApplication.run()으로만 실행시킬 수 있는게 아니라나
     * 커스터마이징 해
     * 1. 스프링 어플리케이션의 인스턴스를 만들어서 하거나
     * 2. 아래와 같이 Builder로 만들어서 실행 시킬 수도 있다.
     */
//    SpringApplication app = new SpringApplication(WebservershowcaseApplication.class);
//    app.run(args);

//    new SpringApplicationBuilder()
//        .sources(WebservershowcaseApplication.class)
//        .run(args);

    /**
     * app.addListeners()로 만들어 놓은 SimpleListener()를 추가한다.
     *
     */
    SpringApplication app = new SpringApplication(WebservershowcaseApplication.class);
    //app.addListeners(new SimpleListener());
    app.run(args);

  }

}
