package com.wildchap.spring.testdemo;

import com.wildchap.spring.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wildchap
 * @create 2020-09-26-15:55
 */
public class TestSpring {

    @Test
    public void test1() {
        //1.加载spring的配置文件
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");
        //2.获取配置文件的对象
        User user = context.getBean("user", User.class);

        System.out.println(user);
        user.add();
    }
}
