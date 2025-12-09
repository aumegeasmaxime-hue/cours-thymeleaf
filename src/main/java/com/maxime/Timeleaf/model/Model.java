package com.maxime.Timeleaf.model;

public class Model {
    private long id;
    private  String prenom;
    private  int age;

    public Model(long id, String prenom, int age) {
        this.id = id;
        this.prenom = prenom;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
