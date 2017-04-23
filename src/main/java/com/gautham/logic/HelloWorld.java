package com.gautham.logic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by GauthamHemanth on 4/22/17.
 */
public class HelloWorld
{

    public static void main(String[] args) {
        System.out.println("Hello World");
       // BeanFactory beanFactory;
        //beanFactory = new XmlBeanFactory(new FileSystemResource("spring.xml"));

        ApplicationContext appContext  =new ClassPathXmlApplicationContext("spring.xml");
        Triangle triangle = (Triangle) appContext.getBean("triangle");

        triangle.draw();
    }
}
