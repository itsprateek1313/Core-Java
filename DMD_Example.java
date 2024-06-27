//Dynamic method dispatch

// Dynamic method dispatch in Java is a powerful mechanism that enables runtime polymorphism by allowing
// the JVM to determine at runtime which overridden method to invoke based on the actual object type. 
// It supports code flexibility, extensibility, and promotes the use of superclass references to achieve 
// polymorphic behavior in object-oriented programming.

//Dynamic method dispatch relies on method overriding, where a subclass provides a specific implementation
// of a method that is already defined in its superclass.

//To achieve dynamic method dispatch, you typically use a reference variable of the superclass type to refer
//to an object of the subclass.
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

public class DMD_Example {
    public static void main(String[] args) {
        Animal myAnimal; // Reference variable of superclass type

        //method of object of right side will be called
        myAnimal = new Dog(); // Object of subclass type
        myAnimal.makeSound(); // Calls Dog's makeSound method dynamically

        myAnimal = new Cat(); // Object of another subclass type
        myAnimal.makeSound(); // Calls Cat's makeSound method dynamically
    }
}
