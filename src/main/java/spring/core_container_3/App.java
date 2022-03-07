package spring.core_container_3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */

public class App 
{

    public static void main( String[] args )
    {
       AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext(Config.class); 
       Vechile v=(Vechile) ac.getBean("qweqqw");
       v.name();
    }
}
