/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Administrator
 */
public class Customer {
    private int id;
    private String lastName, name, middleName, BankAccountNumber;
    private long CardAccountNumber;

    public void setId(int id) {
        this.id = id;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setBankAccountNumber(String BankAccountNumber) {
        this.BankAccountNumber = BankAccountNumber;
    }

    public void setCardAccountNumber(long CardAccountNumber) {
        this.CardAccountNumber = CardAccountNumber;
    }

    public int getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getBankAccountNumber() {
        return BankAccountNumber;
    }

    public long getCardAccountNumber() {
        return CardAccountNumber;
    }

    public Customer(int id, String lastName, String name, String middleName, String BankAccountNumber, long CardAccountNumber) {
        this.id = id;
        this.lastName = lastName;
        this.name = name;
        this.middleName = middleName;
        this.BankAccountNumber = BankAccountNumber;
        this.CardAccountNumber = CardAccountNumber;
    }
    
      @Override
    public String toString() {
        return "Customer{" + "id=" + id + ", lastName=" + lastName + ", name=" + name + ", middleName=" + middleName + ", BankAccountNumber=" + BankAccountNumber + ", CardAccountNumber=" + CardAccountNumber + '}';
    }
}
