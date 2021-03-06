/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.talktoki.chatinterfaces.commans;

import java.io.Serializable;

/**
 *
 * @author IbrahimDesouky
 */
public class User implements Serializable{
     private String userName;
    private String email;
    private String firstName;
    private String lastName;
    private String password;
    private String gender;
    private String country;
    private String status;

    public User() {
        userName="";
        email="";
        firstName="";
        lastName="";
        password="";
        gender="";
        country="";
        status="";
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public User(String userName, String email, String firstName, String lastName, String password, String gender, String country, String status) {
        this.userName = userName;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.gender = gender;
        this.country = country;
        this.status = status;
    }
    
        public User(String userName, String email, String password, String gender, String country, String status) {
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.gender = gender;
        this.country = country;
        this.status = status;
        
    }
    
    
}
