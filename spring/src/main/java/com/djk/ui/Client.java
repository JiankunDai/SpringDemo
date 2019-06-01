package com.djk.ui;

import com.djk.dao.AccountDao;
import com.djk.service.AccountService;
import com.djk.service.impl.AccountServiceImpl;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


/**
 * 模拟表现层，用于调业务层
 */

public class Client {

    /**
     * 获取spring的ioc核心容器，并根据id获取对象
     *
     * ApplicationContext的三个常用实现类：
     *      ClassPathXmlApplicationContext:可以加载类路径下的配置文件
     *      FileSystemXmlApplicationContext:加载磁盘任意路径下的配置文件（有访问权限）
     *      AnnotationConfigApplicationContext:读取注解创建容器
     *
     * 核心容器的两个接口引发出的问题：
     *  ApplicationContext:     单例对象适用              采用此接口
     *      它在构建核心容器时，创建对象采取的策略是采用立即加载的方式。也就是说，只要一读取完配置文件马上就创建配置文件中配置的对象。
     *  BeanFactory:            多例对象使用
     *      它在构建核心容器时，创建对象采取的策略是采用延迟加载的方式。也就是说，什么时候根据id获取对象了，什么时候才真正的创建对象。
     * @param args
     */
    public static void main(String[] args) {

        //1.获取核心容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        //ApplicationContext applicationContext = new FileSystemXmlApplicationContext("C:\\Users\\代健坤\\Desktop\\SpringDemo\\src\\main\\resources\\applicationContext.xml");

        //2.根据id获取bean对象
        AccountService accountService = (AccountService) applicationContext.getBean("accountService");
        AccountDao accountDao = applicationContext.getBean("accountDao", AccountDao.class);

        System.out.println(accountService);
        System.out.println(accountDao);



        //--------BeanFactory----------
        Resource resource = new ClassPathResource("applicationContext.xml");
        BeanFactory factory = new XmlBeanFactory(resource);
        AccountService as  = (AccountService)factory.getBean("accountService");
        System.out.println(as);
    }

    /** 使用BeanFactory
    public static void main(String[] args) {

        //AccountService accountService = new AccountServiceImpl();
        for (int i = 0; i < 5; i++) {
            AccountService accountService = (AccountService) BeanFactory.getBean("accountService");
            System.out.println(accountService);
            accountService.saveAccount();
        }
    }

    Output:
     *
     * com.djk.service.impl.AccountServiceImpl@27c170f0
     * save account!
     * 1
     * com.djk.service.impl.AccountServiceImpl@27c170f0
     * save account!
     * 1
     * com.djk.service.impl.AccountServiceImpl@27c170f0
     * save account!
     * 1
     * com.djk.service.impl.AccountServiceImpl@27c170f0
     * save account!
     * 1
     * com.djk.service.impl.AccountServiceImpl@27c170f0
     * save account!
     * 1
     */
}
