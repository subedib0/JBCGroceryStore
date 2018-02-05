package com.example.demo;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
@Entity
public class Cosmetic {




    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;


    @NotNull
    @NotEmpty
    private String brand;

    @NotNull
    @NotEmpty
    private double popular;

    public Cosmetic() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }


    public double getPopular() {
        return popular;
    }

    public void setPopular(double popular) {
        this.popular = popular;
    }
}
