package hello;

import demo1.*;
import org.joda.time.LocalTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorld {
    public static void main(String[] args) {
        /* LocalTime currentTime = new LocalTime();
        System.out.println("The current local time is: " + currentTime);

        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());*/

        ApplicationContext context = new AnnotationConfigApplicationContext(CoachConfiguration.class);
        //Coach theCoach = context.getBean(Coach.class);
        //ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
        Coach theCoach = context.getBean("thatSillyCoach", Coach.class);
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());
        //System.out.println(theCoach.getEmail());
        //System.out.println(theCoach.getName());
        //context.close();
    }
}