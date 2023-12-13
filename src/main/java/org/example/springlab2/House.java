package org.example.springlab2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
class House {
    private int houseNumber;
    private Apartment apartment;

    @Autowired
    public House(Apartment apartment) {
        this.apartment = apartment;
        System.out.println("House bean is created");
    }

    public Apartment getApartment() {
        return apartment;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    @Value("${house.houseNumber}")
    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }
}
