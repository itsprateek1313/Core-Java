//abstract keyword

// The abstract keyword in Java is used to declare a class or a method that cannot be instantiated or implemented directly
// It allows you to define abstract classes and methods that must be implemented by subclasses

//Abstract Classes
// An abstract class is a class that cannot be instantiated on its own and is meant to be subclassed. 
//Abstract classes can contain both abstract methods (methods without a body) and concrete methods (methods with a body).
//A subclass that extends an abstract class must implement all the abstract methods of the superclass 
//unless it is also declared abstract.
///An abstract class can have 0 or more abstract methods.

//Important Note:
// A subclass inheriting from an abstract class must implement all of the abstract methods declared in the abstract class unless 
// the subclass is also declared as abstract. If the subclass is declared as abstract, it does not need to implement the abstract 
// methods, but any concrete subclass further down the hierarchy must implement them.

// Abstract Methods
// An abstract method is a method that is declared without an implementation (without a body). 
// Abstract methods must be implemented in subclasses.
// An abstract method does not have a body

abstract class Animal {
    // Abstract method (does not have a body)
    abstract void makeSound();

    // Regular method
    void eat() {
        System.out.println("This animal is eating");
    }
}

class Dog extends Animal {
    // Implement the abstract method
    void makeSound() {
        System.out.println("Bark");
    }
}

public class abstract_keyword {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound(); // Outputs: Bark
        dog.eat(); // Outputs: This animal is eating
    }
}
