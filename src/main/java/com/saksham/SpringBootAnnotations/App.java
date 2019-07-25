package com.saksham.SpringBootAnnotations;

import org.springframework.context.support.FileSystemXmlApplicationContext;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        FileSystemXmlApplicationContext applicationContext = new FileSystemXmlApplicationContext("beans.xml");
        TvRemote remote = (TvRemote) applicationContext.getBean("tvRemote");
        remote.performAction();
    }
}
