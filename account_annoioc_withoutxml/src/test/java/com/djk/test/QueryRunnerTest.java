package com.djk.test;

import config.SpringConfiguration;
import org.apache.commons.dbutils.QueryRunner;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 测试queryrunner是否单例
 */
public class QueryRunnerTest {

    @Test
    public  void  testQueryRunner(){
        //1.获取容易
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        //2.获取queryRunner对象
        QueryRunner runner = applicationContext.getBean("runner",QueryRunner.class);
        QueryRunner runner1 = applicationContext.getBean("runner",QueryRunner.class);
        System.out.println(runner == runner1);
    }
}
