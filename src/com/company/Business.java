package com.company;
import java.lang.Long;
class Business extends Person {
    private String phoneNumber;

    public Business(String name, String email, String phoneNumber) {
        super(name, email);
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void display(){
        super.display();
        System.out.println("Business Contact: Their phone number is " + phoneNumber);
    }
}
