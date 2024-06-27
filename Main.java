class Person {
    // Private variables - data hiding
    private String name;
    private int age;

    //Parameterized Constructor
    public Person(String name, int age) {
        this.name = name;
        setAge(age); // Use setter to apply validation
    }

    // Default Constructor
    public Person() {
        name = "Prateek";
        age = 22;
    }

    // Public getter method for name
    public String getName() {
        return name;
    }

    // Public setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Public getter method for age
    public int getAge() {
        return age;
    }

    // Public setter method for age
    public void setAge(int age) {
        // Validation to ensure age is non-negative
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Age cannot be negative.");
        }
    }

    // Method to display person's details
    public void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        // System.out.println("Hello, World!");

        // Declare an array of integers
        // int[] numbers;

        // Allocate memory for 5 integers
        // numbers = new int[5];
        // int[] num = new int[5];

        // Initialize the array
        // numbers[0] = 10;
        // numbers[1] = 20;
        // numbers[2] = 30;
        // numbers[3] = 40;
        // numbers[4] = 50;

        // Alternatively, declare and initialize an array
        // int[] num2 = { 10, 20, 30, 40, 50 };

        // Iterating over 1D array
        // for (int i = 0; i < numbers.length; i++) {
        // System.out.println("Element at index " + i + ": " + numbers[i]);
        // }

        // Enhanced for loop
        // for (int number : numbers) {
        // System.out.println(number);
        // }

        // 2D Array
        // Declare and allot memory
        // int[][] matrix = new int[3][3];

        // Initialize the 2D array
        // matrix[0][0] = 1;
        // matrix[0][1] = 2;
        // matrix[0][2] = 3;
        // matrix[1][0] = 4;
        // matrix[1][1] = 5;
        // matrix[1][2] = 6;
        // matrix[2][0] = 7;
        // matrix[2][1] = 8;
        // matrix[2][2] = 9;

        // Alternatively, declare and initialize a 2D array
        // int[][] matrix = {
        // { 1, 2, 3 },
        // { 4, 5, 6 },
        // { 7, 8, 9 }
        // };

        // Jagged array
        // Unlike a 2D array, where each row must have the same number of columns,
        // a jagged array can have rows of varying lengths

        // Declare a jagged array
        // int[][] jaggedArray;

        // Initialize the jagged array with different row sizes
        // jaggedArray = new int[3][];
        // jaggedArray[0] = new int[2]; // First row has 2 elements
        // jaggedArray[1] = new int[3]; // Second row has 3 elements
        // jaggedArray[2] = new int[4]; // Third row has 4 elements

        // Alternatively, declare and initialize in one step
        // int[][] jaggedArray = {
        // new int[] { 1, 2 },
        // new int[] { 3, 4, 5 },
        // new int[] { 6, 7, 8, 9 }
        // };

        // Creating person class object
        // Person p1 = new Person("Prateek", 22);
        // p1.name = "Prateek Srivastava";
        // p1.age = 23;

        // Creating an array of objects

        // Declare an array of Person objects
        // Person[] people = new Person[4];

        // Initialize each Person object in the array
        // people[0] = new Person("Alice", 30);
        // people[1] = new Person("Bob", 25);
        // people[2] = new Person("Charlie", 35);
        // people[3] = p1;

        // Display information for each person
        // for each loop
        // for (Person person : people) {
        // person.displayInfo();
        // }

        // for each loop more examples
        // int[] numbers = {1, 2, 3, 4, 5};
        // for (int x : numbers) {
        // System.out.println(x);
        // }

        // for each loop in 2D array
        // int[][] matrix = {
        // {1, 2, 3},
        // {4, 5, 6},
        // {7, 8, 9}
        // };

        // for (int[] row : matrix) {
        // for (int element : row) {
        // System.out.print(element + " ");
        // }
        // System.out.println();
        // }

        // String in Java
        // string literal
        // String str1 = "Hello";

        // using new keyword
        // String str2 = new String(" I am Prateek");

        // System.out.println(str1 + str2 + " I am cool");

        // Important note about how java handles string literals

        // String s1 = "Prateek";
        // String s2 = "Prateek";

        // Both s1 and s2 refer to the same string object in the string pool.
        // This happens because of the way Java handles string literals.

        // Explanation
        // String Pool: Java maintains a pool of strings to optimize memory usage.
        // When you create a string literal, the JVM checks the string pool to see if
        // the string already exists.
        // Reusing Literals: If the string already exists in the pool, the JVM returns a
        // reference to the existing string.
        // If not, it creates a new string object in the pool and returns a reference to
        // it.
        // In the above example:

        // When String s1 = "Prateek"; is executed, the JVM checks the string pool for
        // the string "Prateek".
        // Since it's not there initially, it creates a new string object in the pool.
        // When String s2 = "Prateek"; is executed, the JVM finds that "Prateek" already
        // exists in the string pool
        // and thus makes s2 reference the same object as s1.

        // String s1 = new String("Prateek");
        // String s2 = new String("Prateek");
        // If you create strings using the new keyword, they will not be placed in the
        // string pool, and each string will be a different object.

        // StringBuffer-->mutable,thread safe,gives 16 space extra
        // The content of the StringBuffer can be changed after it is created.

        // StringBuffer sb = new StringBuffer("Prateek");
        // System.out.println(sb.capacity());
        // System.out.println(sb);

        /// To convert StringBuffer into String
        // System.out.println(sb.toString());

        // sb.append(" Srivastava");
        // sb.reverse();

        // Static Keyword-->
        // static keyword is used to declare members (variables and methods) that belong
        // to the class itself, rather than to instances (objects) of the class
        // Static members can be accessed directly using the class name
        // Using static keyword saves memory because members are allocated memory only
        // once , Class-wide access , shared data across
        // all instances of the class
        // A static block in Java is used to initialize static variables or perform
        // static initialization tasks when the class is first loaded into memory.

        // Static Blocks-->
        // Static blocks are executed only once when the class is loaded, before any
        // objects
        // of the class are created and before any static methods are called.

        // Important Note
        // you can use static variables inside static methods, but you cannot use
        // non-static (instance) variables directly inside static methods. This is
        // because static methods belong to the class itself, not to any specific
        // instance of the class, and non-static variables belong to instances of the
        // class.

        // Explain why main method "public static void main(String[] args)" is static?

        // -->This method is main entry point of the application/java program
        // -->The main method is the starting point of the program, and there is no
        // instance of the class available when the program starts. Making it static
        // allows the JVM to call it without needing an instance.
        // The main method is void because it doesn't return any value to the JVM. It is
        // designed to be the starting point of the application, and its role is to
        // execute the code within it rather than return any value.

        // Explicitly loading classes
        // Class.forName("ClassName");

        // Encapsulation
        // Encapsulation is one of the fundamental principles of object-oriented
        // programming (OOP) in Java. It is the mechanism of wrapping the data
        // (variables) and code (methods) together as a single unit. Encapsulation helps
        // in protecting the data from outside interference and misuse.



        // object creation in java
        //When we create object in java it creates a reference to the object , the actual object us
        // created in heap memory
        // Human h1 - new Human();
        //h1 here is reference variable , new keyword is used to allocate memmory to object
        //in heap memory
        
        //Anonymous object
        // new Human();
        //this will also create an object in heap memory, the only problem is that we 
        // cannot use this object

    }
}
