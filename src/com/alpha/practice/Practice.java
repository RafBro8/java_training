package com.alpha.practice;


public class Practice {

    private String name;
    private int age;
    private String job;
    private String car;


    public Practice(String name, int age, String job, String car) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    void canDrive() {
        System.out.println("Car can drive");
    }

    void nickName() {
        System.out.println("Nickname is Roman");
    }
}
