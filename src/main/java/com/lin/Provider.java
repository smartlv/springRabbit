package com.lin;

import static java.lang.Integer.MAX_VALUE;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lin.producer.MessageProducer;

/**
 * Created by smartlv on 2016/11/1.
 */

public class Provider
{
    public static void main(String[] args) throws InterruptedException
    {
        ApplicationContext c = new ClassPathXmlApplicationContext("application.xml");

        for (int i = 0; i < 100000; i++)
        {
            c.getBean("messageProducer", MessageProducer.class).sendMessage("aaa");
        }
        Thread.sleep(MAX_VALUE);
    }
}
