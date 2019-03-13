package com.alpha.classes_constructors_inheritance.Constructor;

public class VipCustomer {

    private String name;
    private int credit;
    private String email;



    public VipCustomer() {

        this("Default Name", 20, "john.wayne@email.com");   //calling Constructor with 3 Params below and passing Arguments for Params

    }

    public VipCustomer(String name, int credit) {
//        this.name = name;
//        this.credit = credit;
        this(name, credit, "unknown email");            //this Constructor also calls 3rd Constructor

    }

    public VipCustomer(String name, int credit, String email) {

        this.name = name;
        this.credit = credit;
        this.email = email;
    }



    public String getName() {
        return name;
    }

    public int getCredit() {
        return credit;
    }

    public String getEmail() {
        return email;
    }



    //Test above solution

    public static void main(String[] args) {
        VipCustomer customer1 = new VipCustomer();
        System.out.println(customer1.getName());

        VipCustomer customer2 = new VipCustomer("Mike", 25);
        System.out.println(customer2.getName());
        System.out.println(customer2.getEmail());

        VipCustomer customer3 = new VipCustomer("Bob", 12);
        System.out.println(customer3.getName());
    }
}







//This Class is a Constructor Challenge exercise

//Create class VipCustomer
//it should have 3 fields: name, credit, and email
//create 3 Constructors
//1st Constructor empty should call the Constructor with 3 Parameters with default values
//2nd Constructor should pass on the 2 values it receives and add a default value for the 3rd
//3rd Constructor should save all fields
//create Getters only for this
//test and confirm it works



