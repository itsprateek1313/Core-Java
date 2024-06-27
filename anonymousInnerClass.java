abstract class abstrctClass{

    abstract void fun();
    abstract void config();

}

interface Greeting {
    void greet();
}

public class anonymousInnerClass {
    public static void main(String[] args) {
        
        abstrctClass a = new abstrctClass()
        {
            void fun(){
                System.out.println("Hello from fun");
            }

            void config(){
                System.out.println("Configuring");
            }
        };
        a.fun();
        a.config();


        Greeting greeting = new Greeting() {
            public void greet() {
                System.out.println("Hello from Anonymous Inner Class");
            }
        };
        greeting.greet();
    }
}
