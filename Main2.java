//Inheritance
//inheritance is a mechanism by which one class (subclass or derived class) can inherit properties and behaviors from
// another class (superclass or base class). This allows for code reuse and establishes a hierarchical relationship between classes
//In java, Multiple inheritance is not possible
// Multiple inheritance is when a class inherits from two or more classes
// Multiple inheritance in Java is not directly supported for classes due to concerns like the diamond problem and 
// ambiguity in method resolution. 

//Diamond Problem
// The diamond problem is a specific case of multiple inheritance where:
// A class (let's call it A) is derived from two classes (B and C), which both inherit from a common base class (D).
// Thus, A inherits from both B and C, which in turn both inherit from D.
//  D
// / \
// B  C
// \ /
//  A
// If B and C both define a method void foo(), and A inherits from both, which foo() should A inherit? 
// This ambiguity arises because both B and C share a common ancestor (D) and may provide different implementations of foo().
// Programming languages need rules to resolve such ambiguities, such as specifying which foo() method to use 
// based on the inheritance hierarchy.
// Java supports multiple inheritance through interfaces, where interfaces cannot have fields and provide only method declarations

//is a and has a
// The concepts of "is-a" and "has-a" relationships are fundamental for understanding inheritance and composition
//IS A Relationship
//Suppose we have two  classes Animal and Dog , Dog here is subclass and Animal is Superclass
// Dog is a subclass of Animal
// Dog inherits the method eat() from Animal, demonstrating the "is-a" relationship (a Dog is an Animal)

//HAS A Relationship
// The "has-a" relationship is implemented through composition. It represents a class containing references to objects of other classes. 
// This means that a class "has" instances of other classes as members.
//Suppose we have two classes Engine and Car , the Car class consists of an Engine object so this demonstrates has-a relationship , 
//the Car has-a Engine
//Example
// class Engine {
//     void start() {
//         System.out.println("Engine starts.");
//     }
// }

// class Car {
//     private Engine engine; // Car has an Engine

//     Car() {
//         engine = new Engine();
//     }

//     void startCar() {
//         engine.start(); // Delegating behavior to Engine
//         System.out.println("Car starts.");
//     }
// }

//Important Note
//when an object is instantiated in Java, 
//the constructor of its class is called, and this, in turn, triggers the constructor of 
//its parent class (superclass). This chain of constructor calls continues up the inheritance 
//hierarchy until the constructor of the Object class (the topmost class in Java) is called.
//Code Reusability, reducing redundancy and improving maintainability

//In below example --> this() calls the constrcutor of same class where as super() calls the constructor of
// its uper class
// class A {
//     public A(){
//         System.out.println("In A");
//     }
//     public A(int x){

//         this();
//         System.out.println("In A int");
//     }

// }

// class B extends A {
//     public B(){
//         super(5);
//         System.out.println("In B");
//     }

// }


//Method Overriding
// Method overriding in Java is a feature that allows a subclass to provide a specific implementation 
// of a method that is already defined in its superclass. When a method in a subclass has the same 
// name, parameters, and return type as a method in its superclass, it is said to override the method in the superclass.
//Method Overloading
// Method overloading in Java is a feature that allows a class to have more than one method having the same name, if their 
// parameter lists are different. It is a form of compile-time (static) polymorphism, where the compiler determines which
//  method to call based on the method signature (name and parameters).



public class Main2 {
    public static void main(String[] args) {

    }
}
