package com.amirely.elite.bookme.Data;


import java.util.Date;

/**
 * Created by elite on 2/26/18.
 */

public abstract class Person {


    protected String firstName;
    protected String lastName;
    protected Address address;
    protected Date dob;
    protected String email;
    protected String phoneNumber;
    protected String ID_;

    public Person(String firstName, String lastName, Address address, Date dob, String email, String phoneNumber, String ID_) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.dob = dob;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.ID_ = ID_;
    }

    public Person(String firstName, String lastName, Address address,String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
    }

    public Person(String firstName, String lastName,String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getID_() {
        return ID_;
    }

    public void setID_(String ID_) {
        this.ID_ = ID_;
    }
}
