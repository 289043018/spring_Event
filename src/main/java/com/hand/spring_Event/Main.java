package com.hand.spring_Event;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args )
    {
        ConfigurableApplicationContext context = new FileSystemXmlApplicationContext("bean.xml");
        context.start();
        
        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        
        obj.getMessage();
        
        context.stop();
    }
}
