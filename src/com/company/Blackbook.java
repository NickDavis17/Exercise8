package com.company;

import java.util.ArrayList;

class Blackbook {

    ArrayList<Person> myList = new ArrayList<>();

    public void addNewContactBusinessOrRegular(Person a){
        myList.add(a);
    }
    public void displayAll(){
        for(Person a : myList) {
            a.display();
        }
        }
    }

