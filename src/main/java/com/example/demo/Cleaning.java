package com.example.demo;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Controller;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Cleaning {


    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;


    @NotNull
    @NotEmpty
    private String strength;

    public Cleaning() {



    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStrength() {
        return strength;
    }

    public void setStrength(String strength) {
        this.strength = strength;
    }


}

