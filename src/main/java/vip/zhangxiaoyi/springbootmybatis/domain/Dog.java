package vip.zhangxiaoyi.springbootmybatis.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * 测试容器的init和destroy
 *
 * @author zhangyi
 * @date 2019-02-01 11:38
 */
public class Dog {
    /**
     * 指定组建的init方法和destroy的几种方法
     * 1：在配置类中 @Bean(initMethod = "init",destroyMethod = "destory")注解指定
     * 2：实现InitializingBean重写其afterPropertiesSet方法，重写DisposableBean重写destroy方法
     * 3：利用java的JSR250规范中的@PostConstruct标注在init方法上，@PreDestroy标注在destroy注解上
     */
    private void init() {
        System.out.println("init....");
    }

    private void destroy() {
        System.out.println("destroy...");
    }
}
