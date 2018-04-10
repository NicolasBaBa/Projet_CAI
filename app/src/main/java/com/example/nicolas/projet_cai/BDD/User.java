package com.example.nicolas.projet_cai.BDD;

/**
 * Created by Nicolas on 03/04/2018.
 */


public class User {

    private String login;
    private String password;
    private String name;
    private String surname;
    private int age;
    private Time creationDate;
    private String run_name;
    private double distance;

    public String getLogin() {return login;}
    public String getPassword() {return password;}
    public String getName() {return this.name;}
    public String getSurname() {return this.surname;}
    public int getAge() {return this.age;}
    public Time getCreationDate() {
        return creationDate;
    }
    public String getRunName() { return run_name; }
    public double getDistance() {
        return distance;
    }

    public User(String login, String password, String name, String surname, int age, Time creationDate, String run_name, double distance) {
        this.login = login;
        this.password = password;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.creationDate = creationDate;
        this.run_name = run_name;
        this.distance = distance;
    }

    public User(String login, String password, String name, String surname, int age, Time creationDate) {
        this.login = login;
        this.password = password;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.creationDate = creationDate;
    }

    public User(String name, double distance){

        this.run_name=name;
        this.distance=distance;

    }

    public User(String login){
        this.login=login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCreationDate(Time creationDate) {
        this.creationDate = creationDate;
    }

    public void setRunName(String name) {
        this.run_name = name;
    }


    public void setDistance(double distance) {
        this.distance = distance;
    }




}
