package com.haochuang.start;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnWebApplication
@EnableConfigurationProperties(HelloProperties.class)
public class HelloServiceConfiguration {
  @Autowired
  HelloProperties helloProperties;

  @Bean
  public HelloService helloService(){
    HelloService helloService = new HelloService();
    helloService.setHelloProperties(helloProperties);
    return helloService;
  }
}
