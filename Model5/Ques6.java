package Assessment1.Model5;

class SharedCounter {

    int counterValue = 0;

    synchronized void incrementCounter() {
        counterValue++;
        System.out.println("Counter Value: " + counterValue);
    }
}

class CounterThread extends Thread {

    SharedCounter sharedCounter;

    CounterThread(SharedCounter counter) {
        sharedCounter = counter;
    }

    public void run() {
        for (int i = 0; i < 3; i++) {
            sharedCounter.incrementCounter();
        }
    }
}

public class Ques6 {

    public static void main(String[] args) {

        SharedCounter counter = new SharedCounter();

        CounterThread threadOne = new CounterThread(counter);
        CounterThread threadTwo = new CounterThread(counter);

        threadOne.start();
        threadTwo.start();
    }
}
