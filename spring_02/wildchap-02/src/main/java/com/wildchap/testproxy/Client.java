package com.wildchap.testproxy;

//用户类来选择
public class Client {
    public static void main(String[] args) {
        //首先实例化猫和狗
        Dog dog = new Dog();
        Cat cat = new Cat();

        //然后动态生成被代理对象(猫和狗)
        GenerateProxy generateProxy = new GenerateProxy();
        //然后给代理类的公共接口赋值，要哪个被代理类就赋值哪个
        //例如我要猫(这时候就生成一个猫的角色)
        generateProxy.setAnimal(dog);

        //然后利用getProxy来获取代理类
        animal proxy = (animal) generateProxy.getProxy();

        //调用方法
        proxy.eat();
    }
}
