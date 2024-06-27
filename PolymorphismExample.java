
// Polymorphism in Java is a concept that allows objects of different classes to be treated as objects
// of a common superclass. It is one of the core principles of object-oriented programming (OOP)

// Types of Polymorphism
// Compile-time Polymorphism (Static Binding)
// Runtime Polymorphism (Dynamic Binding)

// Compile-time polymorphism is achieved through method overloading and operator overloading. Java supports method overloading, 
// which allows multiple methods in the same class to have the same name but different parameters.
//Example of method overloading

class MathOperations {
    // Method with two integer parameters
    public int add(int a, int b) {
        return a + b;
    }

    // Method with three integer parameters
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method with two double parameters
    public double add(double a, double b) {
        return a + b;
    }
}

// Runtime Polymorphism
// Runtime polymorphism is achieved through method overriding. It allows a subclass to provide a specific implementation
// of a method that is already defined in its superclass. This is also known as dynamic binding or late binding
//Example of method overrinding

//Superclass
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

// Subclass
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        MathOperations math = new MathOperations();
        System.out.println("Sum of 5 and 10: " + math.add(5, 10));
        System.out.println("Sum of 5, 10, and 15: " + math.add(5, 10, 15));
        System.out.println("Sum of 5.5 and 10.5: " + math.add(5.5, 10.5));



        Animal myAnimal = new Animal();
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myAnimal.makeSound(); // Output: Animal makes a sound
        myDog.makeSound();    // Output: Dog barks
        myCat.makeSound();    // Output: Cat meows
        
    }
}
