import com.wildchap.aop01.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("appplicationContext.xml");
        //动态代理代理的是接口
        UserService userService = (UserService) context.getBean("userservice");

        userService.add();
    }
}
