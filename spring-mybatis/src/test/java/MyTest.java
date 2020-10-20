import com.wildchap.dao.UserMapper;
import com.wildchap.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        UserMapper userMapper = context.getBean("userMapper", UserMapper.class);

        for (User user : userMapper.searchUser1()) {
            System.out.println(user);
        }
    }

}
