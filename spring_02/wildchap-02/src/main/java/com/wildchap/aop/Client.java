package com.wildchap.aop;

// 租客
public class Client {
    public static void main(String[] args) {
        //房东要租房子，中介帮房东租房子，中介还有一些附属操作
        Host host = new Host();
        //通过代理租房子，你不用面对房东
        Proxy proxy = new Proxy(host);
        proxy.rent();
        //房东还可以收中介费
        proxy.fare();
    }
}
