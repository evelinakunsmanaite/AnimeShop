/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Administrator
 */
public class Address {
    private String street;
   private int houseNumber, apartment;

    public Address(String street, int houseNumber, int apartment) {
        this.street = street;
        this.houseNumber = houseNumber;
        this.apartment = apartment;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setHouse(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public void setApartment(int apartment) {
        this.apartment = apartment;
    }

    public String getStreet() {
        return street;
    }

    public int getHouse() {
        return houseNumber;
    }

    public int getApartment() {
        return apartment;
    }

    @Override
    public String toString() {
        return "street: " + street + "\n" + "house: " + houseNumber  + "\n" + "apartment: " + apartment+ "\n" ;
    }
    
    
}
