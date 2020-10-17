import com.mysql.cj.x.protobuf.MysqlxCursor;
import com.wildchap.dao.UserMapper;
import com.wildchap.pojo.User;
import com.wildchap.servlet.UserServlet;
import com.wildchap.utils.MyBatis;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {

    @Test
    public void test1(){
        SqlSession sqlSession = MyBatis.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User user1 = new User();

        user1.setId(8);
        user1.setName("chen");
        user1.setPwd("123");

        //增
        System.out.println(mapper.addUser(user1));

        //改
        System.out.println(mapper.updateUser(user1));

        //删
        System.out.println(mapper.delUser(8));


        //查
        List<User> users = mapper.searchUser();

        for (User user : users) {
            System.out.println(user);

        }

        sqlSession.close();
    }

    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        UserServlet usermapper = context.getBean("userMapper", UserServlet.class);

        usermapper.addUser(new User(8, "chen", "123"));
        List<User> users = usermapper.searchUser();

        for (User user : users) {
            System.out.println(user);
        }
    }
}
