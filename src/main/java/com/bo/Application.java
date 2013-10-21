package com.bo;

import org.apache.log4j.BasicConfigurator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Class com.bo.Application.
 *
 * @author Boris Pronin (<a href="mailto:bpronin@bttprime.com">bpronin@bttprime.com</a>)
 */
public class Application {

    public static void main(String[] args) throws Exception {
        BasicConfigurator.configure();
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        context.getBean("controller", Controller.class).setEnabled(true);
        System.out.println("Running");
        System.in.read();
    }

}
