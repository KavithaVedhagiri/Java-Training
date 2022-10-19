class Divided {
    void div(int a, int b) {
        System.out.println("Sum of two=" + (a / b));
    }

    void div(int a, int b, int c) {
        System.out.println("Sum of three=" + (( a* b) / c));
    }
}
public class Polymorphism {
    public static void main(String args[]) {
        Divided d = new Divided();
        d.div(100, 10);
        d.div(10, 6, 5);
    }
}
