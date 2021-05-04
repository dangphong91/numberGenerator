public class Main {
    public static void main(String[] args) {
        Thread num1 = new NumberGenerator(10);
        Thread num2 = new NumberGenerator(20);
        num1.start();
        num2.start();
    }
}
