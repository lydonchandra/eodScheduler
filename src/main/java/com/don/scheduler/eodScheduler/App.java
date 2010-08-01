package com.don.scheduler.eodScheduler;

import org.quartz.SchedulerException;
import org.quartz.impl.StdScheduler;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SchedulerException
    {    	
        System.out.println( "Hello World!" );
        final BeanFactory factory = new XmlBeanFactory(new FileSystemResource("/Users/lydonchandra/Documents/workspace-sts-carbon3/eodScheduler/src/main/resources/eodScheduler.xml"));
		StdScheduler sched = (StdScheduler)factory.getBean("scheduler");
		sched.start();
    }
}
