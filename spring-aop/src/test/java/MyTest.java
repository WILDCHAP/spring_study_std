import com.wildchap.pojo.User;
import com.wildchap.servlet.UserServlet;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {

    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        UserServlet userMapper = context.getBean("userMapper", UserServlet.class);

        List<User> users = userMapper.searchUser();
    }

}
