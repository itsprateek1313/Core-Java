
//throws keyword
// The throws keyword in Java is used in method signatures to indicate that a method can potentially
// throw one or more exceptions. This informs the caller of the method that they need to handle these exceptions, 
// either with a try-catch block or by propagating the exception further up the call stack.
//throws keyword is used to declare that this method may throw an exception.

// When to Use throws
// Checked Exceptions: If a method can throw a checked exception (a subclass of Exception but not RuntimeException),
// it must declare this using the throws keyword. Checked exceptions are checked at compile time.

// Unchecked Exceptions: Methods can also throw unchecked exceptions (subclasses of RuntimeException),
// but they are not required to declare these with throws. Unchecked exceptions are checked at runtime.


class Demo {
    public void show(String str) throws ClassNotFoundException {
        Class.forName(str);  // Attempt to load the class
    }
}

public class throws_keyword {
    public static void main(String[] args) {
        Demo obj = new Demo();

        try {
            obj.show("aabbcc");  // This will throw ClassNotFoundException
        } catch (ClassNotFoundException e) {
            System.out.println("Class 'aabbcc' is not found");
        }
    

        Demo obj2 = new Demo();

        try {
            obj2.show("GGG");
        } catch (ClassNotFoundException e) {
            System.out.println("Class 'GGG' is not found");
        }

        Demo obj3 = new Demo();

        try {
            obj3.show("Vehicle");
            System.out.println("Class is found in the folder...");
            
        } catch (ClassNotFoundException e) {
            System.out.println("Class is not found");
            
        }

    }
}

