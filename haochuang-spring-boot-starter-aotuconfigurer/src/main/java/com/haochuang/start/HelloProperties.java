package com.haochuang.start;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "haochuang.hello")
public class HelloProperties {
  private String order;
  private String after;

  public String getOrder() {
    return order;
  }

  public void setOrder(String order) {
    this.order = order;
  }

  public String getAfter() {
    return after;
  }

  public void setAfter(String after) {
    this.after = after;
  }
}
