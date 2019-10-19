package com.coneseo.webservershowcase;

import javax.validation.constraints.NotEmpty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

@Component
@ConfigurationProperties("server")
@Validated
public class SeverProperties {

  @NotEmpty
  private int port;

}
