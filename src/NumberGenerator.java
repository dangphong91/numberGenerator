public class NumberGenerator extends Thread{
    int number;
    NumberGenerator(int number) {
        this.number = number;
    }
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.print(number+i+" ");
            System.out.println(hashCode());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
