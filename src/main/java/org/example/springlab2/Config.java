package org.example.springlab2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
public class Config {
    @Value("${person.age}")
    int personAge;
    @Value("${person.name}")
    String personName;

    @Bean
    public Person Pablo(){
        return new Person(personName, personAge);
    }

    @Bean
    public Person Alex(){
        return new Person("Alex", 19);
    }
}
