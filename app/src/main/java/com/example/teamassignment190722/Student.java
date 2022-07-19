package com.example.teamassignment190722;

public class Student {
    int id;
    private String name;
    private String mail;
    private String birthday;

    public Student(int id, String name, String mail, String birthday) {
        super();
        this.id = id;
        this.name = name;
        this.mail = mail;
        this.birthday = birthday;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}

