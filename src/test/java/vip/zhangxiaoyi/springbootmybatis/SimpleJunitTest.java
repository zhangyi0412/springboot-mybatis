package vip.zhangxiaoyi.springbootmybatis;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import vip.zhangxiaoyi.springbootmybatis.domain.Dog;

/**
 * 简单使用junit测试，自己通过工厂获得bean
 *
 * @author zhangyi
 * @date 2019-02-01 11:36
 */
public class SimpleJunitTest {
    @Test
    public void testLifeCycle() {
        // springBoot中使用这个工厂获取bean
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(SimpleJunitTest.class);
        Dog dog = annotationConfigApplicationContext.getBean(Dog.class);

    }
}
