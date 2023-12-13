package org.example.springlab2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
class Apartment {

    private int roomsCount;
    private Person resident;

    public Apartment() {
        System.out.println("Apartment bean is created");
    }
    public Person getResident() {
        return resident;
    }

    @Autowired
    @Qualifier("Pablo")
    public void setResident(Person resident) {
        this.resident = resident;
    }

    public int getRoomsCount() {
        return roomsCount;
    }

    @Value("${apartment.roomsCount}")
    public void setRoomsCount(int roomsCount) {
        this.roomsCount = roomsCount;
    }
}
