import java.util.TreeSet;

class Car implements Comparable<Car>{
    int cost;
    Car(int cost)
    {
        this .cost = cost;
    }
    
    public String toString(){
        return "Car [cost=" + cost + "]";
    }
    public int compareTo(Car c)
    {
        return this.cost-c.cost;
    }
}


public class ExampleForComparable {
    
    public static void main(String[] args) {
        Car c1 = new Car(300);
        Car c2 = new Car(100);
        Car c3 = new Car(300);

        TreeSet<Car> ts = new TreeSet<Car>();
        ts.add(c1);
        ts.add(c2);
        ts.add(c3);

        for(Car i : ts)
        {
            System.out.println(i);
        }

    }
    
}
