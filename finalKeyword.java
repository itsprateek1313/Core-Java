// final - variable, method, class
//The final keyword in Java provides various mechanisms to ensure immutability, 
//prevent method overriding, and restrict inheritance.

//final variable
// the value of variable cannot be changes


//final class
// classes with final keyword cannot be inherited
//Example
// final class Vehicle {
    // Class implementation
// }

// Attempting to extend a final class will result in a compilation error
// public class Car extends Vehicle {
    // Class implementation
// }


//final method
//When applied to methods, the final keyword prevents subclasses from overriding the method
//This is useful when a method's implementation should not be changed or extended by subclasses
//Example
// class Parent {
//     public final void display() {
//         System.out.println("This is a final method in the Parent class.");
//     }
// }

// class Child extends Parent {
    // Attempting to override display() will result in a compilation error
//     public void display(){
//         System.out.println("Inside chile class");
//     }
    
// }


public class finalKeyword {
    public void main(String[] args) {
        
        // int num = 10;
        //here num can be changed
        // num = 12;
        // System.out.println(num);

        // final int num2 = 10;
        // System.out.println(num2);
        //Error because num2 is final and cannot be changed
        // num2 = 12;
    }
}
