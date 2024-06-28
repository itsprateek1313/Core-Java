
//Errors vs Exceptions
// Errors
// What are they?: Errors represent serious problems that are generally not expected to be caught or handled by a 
// typical application.
// Examples: OutOfMemoryError, StackOverflowError
// When do they occur?: Errors usually occur due to issues in the runtime environment or hardware problems.
// Handling: Typically, you don't handle errors in your code because they are beyond the control of the application
// and often indicate a critical failure.
// Exceptions
// What are they?: Exceptions represent conditions that an application might want to catch and handle. 
// They indicate problems that can occur during the normal operation of a program.
// Examples: IOException, SQLException, NullPointerException
// When do they occur?: Exceptions occur due to logical errors in the code, user input errors, or other
// issues that can be anticipated and managed by the program.
// Handling: You handle exceptions using try-catch blocks, allowing your program to recover from errors and continue running.
// Exception is the parent class of all the exceptions, it can handle all the exceptions.
//Types of exceptions
//Checked Exceptions: 
//Checked exceptions are called compile-time exceptions because these exceptions are checked at compile-time by the compiler.
// Unchecked Exceptions: 
// The unchecked exceptions are just opposite to the checked exceptions. The compiler will not check these
// exceptions at compile time. In simple words, if a program throws an unchecked exception, and even if we didn’t 
// handle or declare it, the program would not give a compilation error.
// This exception occurs during the run time of the program execution. All Runtime exception and its child classes, 
// Error and its child classes fall under Unchecked exceptions.


//Note
// try{

// }
// catch(Exception e){ 

// }
//e is an object that contains detail about the exception occured
//Methods-->
// e.getMessage()
// e.printStackTrace()

//Best Practices

//1.
// Catch Specific Exceptions: 
// Catch specific exceptions rather than using a generic Exception to make the code more readable and maintainable.

// try {
//      Some code
// } catch (IOException e) {
//      Handle IOException
// } catch (SQLException e) {
//      Handle SQLException
// }

//2.
// Use Finally to Release Resources: Ensure that resources are released properly using the finally block




public class exceptions {

    public static void main(String[] args) {

        int i = 10;
        int j = 0;
        int[] arr = new int[5];

        try {

            System.out.println(i/j);
            System.out.println(arr[6]);

        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by 0");

        }
        catch(ArrayIndexOutOfBoundsException e){

            System.out.println("Array Index Out of Bound");

        }
        finally{
            System.out.println("This block will always gets executed...");
        }



    }
}
