package com.example.aplikacjeinternetowe;

import org.springframework.stereotype.Component;

@Component
public class Person {
    private String firstName;
    private String familyName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

}