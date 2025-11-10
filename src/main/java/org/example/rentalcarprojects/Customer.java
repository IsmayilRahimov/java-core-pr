package org.example.rentalcarprojects;

public class Customer {

    private String name;
    private String tcNo;
    private String phone;


    public Customer(String name, String tcNo, String phone) {
        this.name = name;
        this.tcNo = tcNo;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getTcNo() {
        return tcNo;
    }

    public String getPhone() {
        return phone;
    }

}
