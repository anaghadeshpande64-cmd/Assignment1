package Assessment1.Model5;

class LifeCycleThread extends Thread {

    public void run() {
        System.out.println("Thread is running");
    }
}

public class Ques8 {

    public static void main(String[] args) {

        LifeCycleThread newThread = new LifeCycleThread();

        System.out.println("Thread State after creation: " + newThread.getState());

        newThread.start();

        System.out.println("Thread State after start: " + newThread.getState());
    }
}
