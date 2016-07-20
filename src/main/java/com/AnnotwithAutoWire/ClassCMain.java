package com.AnnotwithAutoWire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Ashutosh on 7/20/2016.
 */
public class ClassCMain {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);

        ApplicationRun applicationRun = applicationContext.getBean(ApplicationRun.class);
        applicationRun.runMyApplication();

    }
}
