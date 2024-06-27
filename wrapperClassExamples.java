// Wrapper classes in Java provide a way to use primitive data types (like int, char, etc.) as objects. 
//Each of the eight primitive types has a corresponding wrapper class:

// byte -> Byte
// short -> Short
// int -> Integer
// long -> Long
// float -> Float
// double -> Double
// char -> Character
// boolean -> Boolean

// Wrapper classes are immutable, meaning their values cannot be changed once created. This makes them useful for 
// ensuring data consistency and safety in concurrent programming.

// Autoboxing: Automatic conversion of primitive types to their corresponding wrapper classes.
// Unboxing: Automatic conversion of wrapper class objects to their corresponding primitive types.



public class wrapperClassExamples {
    public static void main(String[] args) {

        // Autoboxing
        // int num = 5;
        // Integer num2 = num; // Automatically converted to Integer

         // Unboxing
        //  Integer num3 = 10;
        //  int num4 = num3; // Automatically converted to int
        

        //Provides various Utility methods

        // Parsing strings to primitives
        // String str = "100";
        // int num = Integer.parseInt(str);
        // System.out.println(3*num);

        
        // Converting primitives to strings
        // String intString = Integer.toString(123);
        // String doubleString = Double.toString(123.45);

         // Constants
        //  int maxInt = Integer.MAX_VALUE;
        //  int minInt = Integer.MIN_VALUE;






        
    }
}
