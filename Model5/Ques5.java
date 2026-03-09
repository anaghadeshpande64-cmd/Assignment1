package Assessment1.Model5;

public class NumberPrinterThread extends Thread {

    public void run() {
        for (int count = 1; count <= 3; count++) {
            System.out.println("Thread class printing: " + count);
        }
    }
}


class MessagePrinter implements Runnable {

    public void run() {
        for (int count = 1; count <= 3; count++) {
            System.out.println("Runnable interface printing: " + count);
        }
    }
}

public class Ques5 {

    public static void main(String[] args) {

        NumberPrinterThread threadObject = new NumberPrinterThread();
        threadObject.start();

        Thread runnableThread = new Thread(new MessagePrinter());
        runnableThread.start();
    }
} {
    
}
