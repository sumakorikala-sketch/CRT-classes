class AverageThread extends Thread {
    public void run() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum = sum + i;
        }
        double average = sum / 10.0;
        System.out.println("Average of first 10 numbers: " + average);
    }
}

class SquareThread extends Thread {
    int arr[] = {1, 20, 50, 15, 30};

    public void run() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("square of " + arr[i] + " : " + (arr[i] * arr[i]));
        }
    }
}

public class MultiThreadExample1 {
    public static void main(String[] args) {
        AverageThread t1 = new AverageThread();
        SquareThread t2 = new SquareThread();

        t1.start();
        try {
            t1.join(); // ensures one-by-one execution
        } catch (Exception e) {
            System.out.println(e);
        }

        t2.start();
    }
}
