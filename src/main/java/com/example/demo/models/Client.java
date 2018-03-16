package com.example.demo.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String aty;
    private String email;
    private int telefon;
    private String mekenzhai;



    public Client(String aty, String email, int telefon, String mekenzhai) {
        this.aty = aty;
        this.email = email;
        this.telefon = telefon;
        this.mekenzhai = mekenzhai;
    }

    public Client() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAty() {
        return aty;
    }

    public void setAty(String aty) {
        this.aty = aty;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefon() {
        return telefon;
    }

    public void setTelefon(int telefon) {
        this.telefon = telefon;
    }

    public String getMekenZhai() {
        return mekenzhai;
    }

    public void setMekenZhai(String mekenzhai) {
        this.mekenzhai = mekenzhai;
    }
}
