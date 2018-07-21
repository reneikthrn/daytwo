package com.groundgurus.day2;

public class Shop {
    private String name;
    private String[] items;
    private String address;
    private int numberOfEmployees;
    
    public Shop() {
    }

    public Shop(String name, String[] items, String address, int numberOfEmployees) {
        this.name = name;
        this.items = items;
        this.address = address;
        this.numberOfEmployees = numberOfEmployees;
    }
    
    public String findByItemName(String name) {
        // statement to find item here
        return "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getItems() {
        return items;
    }

    public void setItems(String[] items) {
        this.items = items;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        if (numberOfEmployees > 0) {
            this.numberOfEmployees = numberOfEmployees;
        } else {
            System.err.println("That value is invalid");
        }
    }
    
    public void printDetails() {
        System.out.println("Name: " + name);
        for (String item : items) {
            System.out.println(item);
        }
        System.out.println("Address: " + address);
        System.out.println("Number Of Employees: " + numberOfEmployees);
    }
}
