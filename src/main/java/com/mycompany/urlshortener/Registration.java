/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.urlshortener;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import java.util.UUID;
import jakarta.persistence.Id;
import java.util.UUID;

/**
 *
 * @author sikhu
 */
@Entity(name = "REGISTRATION")
public class Registration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false, unique = true)
    private String phone;

    @Column(nullable = false)
    private String firstname;

    @Column(nullable = false)
    private String lastname;

    @Column(nullable = false)
    private String organization;

    @Column(nullable = false)
    private String password;

    //setters and getters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Registration() {
    }

    //constructor to add registering user details;
    public Registration(String email, String phone, String firstname, String lastname, String organization, String password) {
        this.email = email;
        this.phone = phone;
        this.firstname = firstname;
        this.lastname = lastname;
        this.organization = organization;
        this.password = password;
    }

    //constructor to allow users to login with password and email address
    @JsonCreator
    public Registration(@JsonProperty("email") String email, @JsonProperty("password") String password) {
        this.email = email;
        this.password = password;
    }
    
     @JsonCreator
    public Registration(@JsonProperty("email") String email) {
        this.firstname = getFirstname();
    }

    //temporal uuid
    public String getUID() {
        
         String uuid = UUID.randomUUID().toString();

        return uuid;
    }

}
