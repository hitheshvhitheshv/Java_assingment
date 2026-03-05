package Module4.com;
class FinalDemo {

    final int x = 10;

    final void display() {
        System.out.println("Final method called");
    }
}

public class FinalKeyword {
    public static void main(String[] args) {

        FinalDemo obj = new FinalDemo();
        obj.display();

        System.out.println("Final Variable: " + obj.x);
    }
}