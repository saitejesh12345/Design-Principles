package org.example.singleResponsiblePrinciple;

public class Customers {
    private String name;
    private String address;
    private String PhoneNum;

    public Customers(String name, String address, String phoneNum) {
        this.name = name;
        this.address = address;
        PhoneNum = phoneNum;
    }

    public Customers() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNum() {
        return PhoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        PhoneNum = phoneNum;
    }

}
