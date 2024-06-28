







public class throw_keyword {
    public static void main(String[] args) {
        int i=0;
        int j = 10;

        try {

            System.out.println(i/j);
            if(i==0)
            //Explicitly throwing an error
            throw new ArithmeticException("Value of i cannot be zero");
            
        } catch (ArithmeticException e) {
            //Error thrown by try will be catched and stored in e
            System.out.println(e);
            
        }




        
    }
}
