package Assessment1.Model5;

class ResourceA {}
class ResourceB {}

public class Ques7 {

    public static void main(String[] args) {

        ResourceA resourceOne = new ResourceA();
        ResourceB resourceTwo = new ResourceB();

        Thread firstThread = new Thread(() -> {
            synchronized (resourceOne) {
                System.out.println("Thread 1 locked Resource A");

                synchronized (resourceTwo) {
                    System.out.println("Thread 1 locked Resource B");
                }
            }
        });

        Thread secondThread = new Thread(() -> {
            synchronized (resourceTwo) {
                System.out.println("Thread 2 locked Resource B");

                synchronized (resourceOne) {
                    System.out.println("Thread 2 locked Resource A");
                }
            }
        });

        firstThread.start();
        secondThread.start();
    }
}
