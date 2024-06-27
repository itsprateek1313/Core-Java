

// Every class in Java implicitly extends the Object class, which is the root of the class hierarchy in Java 
// This means that every class, either directly or indirectly, inherits from the Object class
// This inheritance provides a set of fundamental methods that every Java object can use

// Key Points:
// Implicit Inheritance: If you do not explicitly extend another class, your class will implicitly extend the Object class.
// Universal Methods: The Object class provides several methods that are available to all objects in Java.

//Important method of object class
//toString()
//equals()
//hashcode()



class laptop{
    String name;
    int model;

    //default implementation of toString() in object class which is superclass of every class in Java
    // public String toString() {
    //     return getClass().getName() + "@" + Integer.toHexString(hashCode());
    // }

    //custom implementation of toString() 
    // public String toString() {
        // return "Hello";
    //     return name + ":" + model;
    // }
    
    //custom equals function
    public boolean equals(laptop that){
        if((this.name.equals(that.name)) && (this.model == that.model)) return true;
        else return false;

    }

    


    
    

}

public class object_class {
    public static void main(String[] args) {
        laptop lp = new laptop();
        lp.name = "Asus";
        lp.model = 15;

        laptop lp2 = new laptop();
        lp2.name = "Asus";
        lp2.model = 15;

        //By default every time you try to print an object it calls the tostring() method of object class
        //tostring() method returns getClass().getName() + "@" + Integer.toHexString(Hashcode()) , the hashcode function generates a hash code
        // based on the values you have , basically it tries to create a single string of all the data you have

        //Example: toString() 
        System.out.println(lp); //Output: laptop@372f7a8d
        System.out.println(lp2); //Output: laptop@2f92e0f4

        //Example: equals()
        //Default equals() method compares the hashcode which is different for different objects so even if the content of objcets are
        //same it will return false , equals() function is often overridden
        System.out.println(lp == lp2);        //false
        System.out.println(lp.equals(lp2));   //false when default equals() is used


        //when custom equals is used
        System.out.println(lp.equals(lp2)); // True



        
    }
}
