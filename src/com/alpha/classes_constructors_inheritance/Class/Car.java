package com.alpha.classes_constructors_inheritance.Class;

public class Car {

    private int doors;
    private int wheels;
    private String make;
    private String model;
    private String color;

    public void setDoors(int doors) {
     this.doors = doors;

// private int doors; gets updated by the value passed to setDoors(int doors)
// Parameter/Argument using this.doors = doors;

    }

    public int getDoors() {
        return doors;

//with Setters and Getters you can set values of private fields,
// and access these private fields outside this Class like

//ramRebel.setColor("Blue");   ramRebel.getColor(); from ClassMain Class
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getWheels() {
        return wheels;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getMake() {
        return make;
    }

    public void setModel(String model) {
        //validation
        String validModel = model.toLowerCase();
        if (validModel.equals("1500") || validModel.equals("laramie")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }

    public String getModel() {
        return model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        System.out.println(color);
        return color;
    }
}



// Real world objects have two major characteristics, the state and behavior
// Software object stores its state in fields, and we know fields as variables
// And they expose their behavior with methods, which we've talked about before
// Class is a template or a blueprint for creating objects.



//Access Modifiers
// public -  unrestricted access to the Class for other Classes/Code
// private - no other Class/Code can access the private Class
// protected - only other Classes in the same Package can access the protected Class


//Local Variables used inside a Method or a Code Block cannot be accessed outside that Method or Code Block
//Class/Member Variables (Fields) - created in Classes and can be accessed from anywhere within the Class, mostly used with private access modifier
//Encapsulation - hide Fields and Methods from being accessed publicly, so Fields within Class mostly use private modifier


//Use Constructor to create new Object
//Initialize the new Object like:    Car ramRebel = new Car();
//ramRebel is new Object based on Car Class blueprint

// Getters and Setters are needed to gain access for private modifiers like 'private int doors' above,
// because of private modifier (Encapsulation)

//Remember that when typing out Method name, Variable name, Class name, etc,
// IntelliJ IntelliSense gives you a hint about the type you are typing like:
//m icon for Method,  f for Field, etc
//Red locked padlock icon means Field is private, green open padlock means Field is public

//.equals vs == comparison
//Main difference between .equals() method and == operator is that one is method and other is operator.
//We can use == operators for reference comparison (address comparison) and .equals() method for content comparison.
//In simple words, == checks if both objects point to the same memory location
//whereas .equals() evaluates to the comparison of values in the objects.

//"==" or equality operator in Java is a binary operator
//provided by Java programming language and used to compare primitives and objects.
//In terms of comparing primitives like boolean, int, float "==" works fine
//but when it comes to comparing objects it creates confusion with equals method in Java.
//"==" compare two objects based on memory reference. so "==" operator
//will return true only if two object reference it is comparing
//represent exactly same object otherwise "==" will return false.

//Equals() method is defined in Object class in Java
//and used for checking equality of two objects defined by business logic
//e.g. two Employees are considered equal if they have same empId etc.
// You can have your domain object and then override equals method
//for defining a condition on which two domain objects will be considered equal.
//equal has contracted with hashcode method in Java
//and whenever you override equals method you also need to override hashcode() in Java.

//Main difference between == and equals in Java is that "==" is used to compare primitives
//while equals() method is recommended to check equality of objects.
//Another difference between them is that, If both "==" and equals() is used to compare objects
//than == returns true only if both references points to same object
//while equals() can return true or false based on its overridden implementation.

//public class Sample {
//   public static void main(String []args) {
//      String s1 = "tutorialspoint";
//      String s2 = "tutorialspoint";
//      String s3 = new String ("Tutorials Point");
//      System.out.println(s1.equals(s2));
//      System.out.println(s2.equals(s3));
//   }
//}
//Output:
//
//true
//false






