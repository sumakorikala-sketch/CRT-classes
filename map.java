import java.util.HashMap;

public class Map {
    public static void main(String[] args){
       // Map m = new HashMap();
        HashMap<String, String> hm = new HashMap<>();
        hm.put("name","suma");
        hm.put("rollno","23ak1a3245");
        System.out.println(hm);
        System.out.println("---------------");
        System.out.println(hm.get("name"));
        System.out.println("---------------");
        for(Object i : hm.keySet()){
            System.out.println(i + " : " + hm.get(i));
        }
    }
}
