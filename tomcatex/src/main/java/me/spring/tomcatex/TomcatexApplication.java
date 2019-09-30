package me.spring.tomcatex;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public class TomcatexApplication {

  public static void main(String[] args) throws LifecycleException {
    //스프링 부트를 웹어플리케이션이 아닌 걸로 실행시키는 방법
    //스프링 부트는 스프링을 쉽게 사용할 수 있게 해주는 툴일뿐, 서버로 오해하지 말도록, 그저 내장 톰캣을 가지고 있을 뿐
//    SpringApplication application = new SpringApplication(TomcatexApplication.class);
//    application.setWebApplicationType(WebApplicationType.NONE);

    //자바로 톰캣을 만들어 볼 수 있다.
    Tomcat tomcat = new Tomcat();
    tomcat.setPort(8090);
    Context context = tomcat.addContext("/", "/");

    HttpServlet servlet = new HttpServlet() {
      @Override
      protected void doGet(HttpServletRequest req, HttpServletResponse resp)
          throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        writer.println("<html><head><title>");
        writer.println("hello, tomcat");
        writer.println("</title></head>");
        writer.println("<body><h1>hello cw</h1></body>");
        writer.println("</html>");
      }
    };

    String servletName = "servletTest";
    tomcat.addServlet("/", servletName, servlet);
    context.addServletMappingDecoded("/hello", servletName);

    tomcat.start();
    tomcat.getServer().await(); //-> 요청 기다리고 await안하면 그냥 끝남
  }

}
