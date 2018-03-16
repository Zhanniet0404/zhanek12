package com.example.demo.models;
import javax.persistence.*;

@Entity
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id ;
    private String aty ;
    private String zhoni ;
    private String email ;

    public Admin(){}

    public Admin(String aty, String zhoni, String email) {
        this.aty= aty;
        this.zhoni = zhoni;
        this.email = email;
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


    public String getZhoni() {
        return zhoni;
    }

    public void setZhoni(String zhoni) {
        this.zhoni = zhoni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
