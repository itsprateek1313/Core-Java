class Computer{
    public void code(){
        System.out.println("Coding");
    }
}

class Laptop extends Computer{
    public void code(){
        System.out.println("Coding on laptop");
    }
}

class Desktop extends Computer{
    public void code(){
        System.out.println("Coding on desktop");
    }
}

//This developer class is not dependent on laptop or desktop class
class Developer{
    public void devApp(Computer comp){
        comp.code();
    }
}

public class importantConcept {
    public static void main(String[] args) {

        //Creating reference of parent class and creating object of subclass
        Developer prateek = new Developer();
        Computer lap = new Laptop();
        Computer desk = new Desktop();


    
        prateek.devApp(lap);
        prateek.devApp(desk);


        
    }
}
