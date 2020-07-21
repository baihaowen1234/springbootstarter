package com.haochuang.start;

public class HelloService {

  public HelloProperties getHelloProperties() {
    return helloProperties;
  }

  public void setHelloProperties(HelloProperties helloProperties) {
    this.helloProperties = helloProperties;
  }

  HelloProperties helloProperties;

  public String hellohaochuang(String name){
    return helloProperties.getOrder()+"-"+name+"-"+helloProperties.getAfter();
  }
}
