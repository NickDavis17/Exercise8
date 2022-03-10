package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person("Nick", "063815@swcsd.us");
        Business business1 = new Business("Nick","063815@swcsd.us", "6143548378");
        Blackbook collection = new Blackbook();
        collection.addNewContactBusinessOrRegular(person1);
        collection.addNewContactBusinessOrRegular(business1);
        collection.displayAll();



    }
}
