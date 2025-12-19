class SquareThread extends Thread {
    int arr[] = {1, 20, 50, 15, 30};

    public void run() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("square of " + arr[i] + " : " + (arr[i] * arr[i]));
        }
    }
}

class AverageThread extends Thread {
    public void run() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum = sum + i;
        }
        double avg = sum / 10.0;
        System.out.println("average of the first 10 numbers is : " + avg);
    }
}

public class MultiThreadExample {
    public static void main(String[] args) {
        SquareThread t1 = new SquareThread();
        AverageThread t2 = new AverageThread();

        t1.start();
        try {
            t1.join(); // ensures squares print first
        } catch (Exception e) {
            System.out.println(e);
        }

        t2.start();
    }
}
