import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class JavaHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(201, "To Kill A Mockingbird");
        hm.put(202, "The Hunger Games");
        hm.put(203, "Water for Elephants");
        hm.put(204, "Lord of the Flies");
        hm.put(205, "The Da Vinci Code");

        for(Map.Entry<Integer, String> set: hm.entrySet()) {
            System.out.println(set);
        }

        System.out.println("\n----------Keys----------");
        for(int i: hm.keySet()) {
            System.out.print(i + " | ");
        }

        System.out.println("\n----------Values----------");
        for(String j: hm.values()) {
            System.out.print(j + " | ");
        }

    }
}
