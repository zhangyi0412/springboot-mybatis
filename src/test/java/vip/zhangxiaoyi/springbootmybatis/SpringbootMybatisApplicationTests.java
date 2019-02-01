package vip.zhangxiaoyi.springbootmybatis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;
import vip.zhangxiaoyi.springbootmybatis.config.AppConfig;
import vip.zhangxiaoyi.springbootmybatis.domain.Dog;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootMybatisApplicationTests {
    @Autowired
    public Dog dog;

    @Test
    public void contextLoads() {
        dog.toString();
    }

    @Test
    public void testLifeCycle() {
        // springBoot中使用这个工厂获取bean
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        Dog dog = annotationConfigApplicationContext.getBean("dog", Dog.class);

    }
}
