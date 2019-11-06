import com.baizhi.service.ServiceDynamicproxy;
import com.baizhi.service.ServiceLX;
import com.baizhi.service.ServiceLXImpl;
import com.baizhi.service.ServiceLXWai;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Connection;

public class MyTest2 {
    @Test
    public void test1(){
        //静态代码设计
        //代理
        ServiceLX lx = new ServiceDynamicproxy();
        lx.insert1("小香");
        lx.insert2();
        lx.delete("a");
        lx.update();
    }
    @Test
    public void test2() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Connection bean = (Connection) context.getBean("MyConnection");
        System.out.println(bean);
    }
    @Test
    public void test3() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ServiceLX serviceLX = (ServiceLX) context.getBean("ServiceLX");
        serviceLX.update();
        serviceLX.delete("ss");
        serviceLX.insert2();
    }
}
