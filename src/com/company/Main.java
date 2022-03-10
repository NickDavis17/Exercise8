package com.company;
//Nick Davis -- Exercise 8 -- 3/10/22

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person("Nick", "063815@swcsd.us");
        Business business1 = new Business("Jake","123456@swcsd.us", "1234567890");
        Blackbook collection = new Blackbook();
        collection.addNewContactBusinessOrRegular(person1);
        collection.addNewContactBusinessOrRegular(business1);
        collection.displayAll();



    }
}
