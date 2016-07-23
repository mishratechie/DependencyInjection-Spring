package com.SimpleAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Ashutosh on 7/20/2016.
<<<<<<< HEAD
 * Please contact mishra.techie@gmail.com with your queries
=======
>>>>>>> origin/master
 */


@Configuration
public class ApplicationConfiguration {

    @Bean
    public ClassA getClassABean(){
        return new ClassA();
    }

    @Bean
    public ClassB getClassBBean(){
        return new ClassB();
    }

}
