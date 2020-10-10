package com.wildchap.aop3;

public class Client {
    public static void main(String[] args) {
        //真实角色
        Host host = new Host();

        //代理角色：现在没有
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        pih.setRent(host);
        //利用getProxy获取代理类(这里得是动态生成得)
        Rent proxy = (Rent) pih.getProxy();

        proxy.rent();
    }
}
