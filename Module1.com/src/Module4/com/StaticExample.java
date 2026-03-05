package Module4.com;

class StaticDemo {

    static int count = 0;

    StaticDemo() {
        count++;
    }

    static void display() {
        System.out.println("Count: " + count);
    }
}

public class StaticExample {
    public static void main(String[] args) {

        new StaticDemo();
        new StaticDemo();
        new StaticDemo();

        StaticDemo.display();
    }
}