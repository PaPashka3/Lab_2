package org.example.springlab2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
class Street {
    private String name;
    private House house;

    @Autowired
    public Street(House house) {
        this.house = house;
        System.out.println("Street bean is created");
    }

    public House getHouse() {
        return house;
    }

    public String getName() {
        return name;
    }

    @Value("${street.name}")
    public void setName(String name) {
        this.name = name;
    }
}
