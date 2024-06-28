// Lambda expressions, introduced in Java 8, are a powerful feature that allow you to write concise and readable 
// code by expressing instances of single-method interfaces (functional interfaces) directly. 
// They enable you to treat functionality as a method argument, or treat a block of code as data

interface A {

    int add(int i, int j);
}

public class lambda_exp {

    public static void main(String[] args) {

        A obj = new A() {

            @Override
            public int add(int i, int j) {
                return i + j;
            }

        };

        A obj2 = (i,j) -> i+j;
        

        System.out.println(obj.add(5,9));
        System.out.println(obj2.add(5,9));

    }
}
