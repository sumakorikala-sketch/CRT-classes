import java.util.List;
import java.util.ArrayList;

public class ExampleForCollection {

    public static void main(String[] args) {

        List<Integer> l = new ArrayList<>();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);

        // Enhanced for loop
        for (Integer i : l) {
            System.out.println(i);
        }

        System.out.println(l.size());
        System.out.println(l.contains(10));
        System.out.println(l.get(1));

        // Normal for loop
        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i));
        }

        System.out.println("----------------------------");

        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(25);
        al.add(30);
        al.add(50);

        System.out.println("ArrayList: " + al);

        for (Integer i : al) { 
            System.out.println(i);
        }
    }
}
