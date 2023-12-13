package org.example.springlab2;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringLab2Application {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("org.example.springlab2");

        Street street = context.getBean("street", Street.class);
        System.out.println(street.getName());

        Person person = street.getHouse().getApartment().getResident();
        System.out.printf("Person's name is %s and %d years old!", person.getName(), person.getAge());

        context.close();
    }

}
