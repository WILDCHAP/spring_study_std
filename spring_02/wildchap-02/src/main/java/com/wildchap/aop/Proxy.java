package com.wildchap.aop;

// 代理
public class Proxy {

    private Host host;

    public Proxy(){

    }

    public Proxy(Host host){
        this.host = host;
    }

    public void rent(){
        host.rent();
    }

    //中介独有：看房
    public void seeHost(){
        System.out.println("中介带看房");
    }

    //中介独有：收中介费
    public void fare(){
        System.out.println("中介收中介费");
    }

}
