//Interfaces
// An interface in Java is like a blueprint of methods that a class must implement if it chooses to adopt that interface.
// It defines a set of methods (and sometimes constants) that a class promises to provide.
// Interfaces help enforce a structure or behavior that classes can adhere to.
// They enable multiple classes to share a common set of methods without requiring them to inherit from a common superclass.

// They contain method signatures (declaration without implementation) and constants (variables that are implicitly static and final)
// Classes that implement an interface must provide concrete implementations (code) for all the methods declared in the interface

//class - class --> extends
//class - interface --> implements
//interface - interface --> extends

// Define an interface
interface Vehicle {
    // Constant (implicitly public, static, and final)
    int MAX_SPEED = 120;

    // Abstract method (implicitly public and abstract)
    void start();

    // Default method
    default void stop() {
        System.out.println("Vehicle is stopping");
    }

    // Static method
    static void service() {
        System.out.println("Vehicle needs servicing");
    }

    // Nested interface
    interface Engine {
        void run();
    }
}

// Implementing classes
class Car implements Vehicle {

    public void start() {
        System.out.println("Car starting");
    }

    public void stop() {
        System.out.println("Car stopping");
    }
}

class Bike implements Vehicle {

    public void start() {
        System.out.println("Bike starting");
    }

    public void stop() {
        System.out.println("Bike stopping");
    }
}

// Implementing the nested Engine interface
class Engine1 implements Vehicle.Engine {
    public void run() {
        System.out.println("Engine is running");
    }
}




public class interfacesExample {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        Vehicle myBike = new Bike();

        myCar.start();
        myCar.stop();

        myBike.start();
        myBike.stop();


        // Using the nested interface
        Engine1 engine = new Engine1();
        engine.run(); 
    }
}
