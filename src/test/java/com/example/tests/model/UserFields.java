package com.example.tests.model;

public class UserFields {
    private final String firstname;
    private final String middlname;
    private final String lastname;
    private final String nickname;
    private final String title;
    private final String company;
    private final String addree;
    private final String home;
    private final String mobile;
    private final String work;
    private final String fax;

    public UserFields(String firstname, String middlname, String lastname, String nickname, String title, String company, String addree, String home, String mobile, String work, String fax) {
        this.firstname = firstname;
        this.middlname = middlname;
        this.lastname = lastname;
        this.nickname = nickname;
        this.title = title;
        this.company = company;
        this.addree = addree;
        this.home = home;
        this.mobile = mobile;
        this.work = work;
        this.fax = fax;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getMiddlname() {
        return middlname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getNickname() {
        return nickname;
    }

    public String getTitle() {
        return title;
    }

    public String getCompany() {
        return company;
    }

    public String getAddree() {
        return addree;
    }

    public String getHome() {
        return home;
    }

    public String getMobile() {
        return mobile;
    }

    public String getWork() {
        return work;
    }

    public String getFax() {
        return fax;
    }
}
