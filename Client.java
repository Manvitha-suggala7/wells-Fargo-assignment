package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Client {

    @Id
    @GeneratedValue()
    private long clientID;

    @ManyToOne
    @JoinColumn (name = "advisorID")
    private Advisor advisor; // Advisor referenced as foreign key 

    @Column(nullable = false) // Specifying that column should not allow null values
    private String firstName;

    @Column(nullable = false) 
    private String lastName; 

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String phone;

    @Column(nullable = false)
    private String email;

    protected Client() {

    }

    public Client(Advisor advisor, String firstName, String lastName, String address, String phone, String email) 
    {
        this.advisor = advisor; 
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public Long getClientID() {
        return clientID;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}