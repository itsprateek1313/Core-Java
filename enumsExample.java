
enum Status {
    Running, Failed, Pending, Success;
}

enum Laptop {
    Macbook(2000), Asus(1200), Surface, Lenovo(2400);

    private int price;

    private Laptop() {
        price = 500;
    }

    private Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}

public class enumsExample {
    public static void main(String[] args) {

        // Status s1 = Status.Failed;
        // System.out.println(s1 + ":" + s1.ordinal());

        // Status[] ss = Status.values();
        // for (Status s : ss) {
        // System.out.println(s + " " + s.ordinal());
        // }

        // If else with enums
        // if (s1 == Status.Running) {
        // System.out.println("All Good");
        // } else if (s1 == Status.Failed) {
        // System.out.println("Try again");
        // } else if (s1 == Status.Success) {
        // System.out.println("Completed");
        // } else {
        // System.out.println("Done");
        // }

        // Switch Case
        // switch (s1) {
        // case Running:
        // System.out.println("Running");
        // break;
        // case Pending:
        // System.out.println("Pending");
        // break;
        // case Failed:
        // System.out.println("Failed");
        // default:
        // System.out.println("Cannot Determine");
        // }

        Laptop lap1 = Laptop.Asus;
        System.out.println(lap1 + " : " + lap1.getPrice());

        for (Laptop lap : Laptop.values()) {
            System.out.println(lap + " : " + lap.getPrice());

        }

    }
}
