package me.spring.tomcatex;

import org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext;
import org.springframework.boot.web.servlet.context.ServletWebServerInitializedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
//웹서버가 생성이 되면 이 이벤트 리스너가 호출이 된다.
@Component
public class PortListener implements ApplicationListener<ServletWebServerInitializedEvent> {

  @Override
  public void onApplicationEvent(
      ServletWebServerInitializedEvent servletWebServerInitializedEvent) {
    //event에서 먼저 webapplicationContext를 꺼낸다.
    ServletWebServerApplicationContext applicationContext = servletWebServerInitializedEvent
        .getApplicationContext();
    //서블릿 웹 어플리케이션 컨텍스트 이기 때문에 서버를 알 수 있다. 그리고 웹 서버를 통해 포트를 알 수 있다.
    //서버가 실행되면서 나오는 로그 정보와 아래에서 띄운 정보가 일치하는지 확인한다.(커스텀 완료)
    System.out.println(applicationContext.getWebServer().getPort());

  }


}
