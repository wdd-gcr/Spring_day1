import com.baizhi.entity.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.jws.soap.SOAPBinding;

public class MyTest {
    @Test
    public void test1(){
        //创建Spring工厂
       ApplicationContext ac = new ClassPathXmlApplicationContext("ApplicationContext.xml");
       //创建对象
        User user=(User)ac.getBean("user");
        System.out.println(user);
    }
}
