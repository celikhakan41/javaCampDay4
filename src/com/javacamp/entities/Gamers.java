package com.javacamp.entities;

public class Gamers {
    private long tcNo;
    private String firstName;
    private String lastName;
    private int yearOfBirth;

    public Gamers(long tcNo, String firstName, String lastName, int yearOfBirth) {
        this.tcNo = tcNo;
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
    }

    public long getTcNo() {
        return tcNo;
    }

    public void setTcNo(long tcNo) {
        this.tcNo = tcNo;
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

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
}
