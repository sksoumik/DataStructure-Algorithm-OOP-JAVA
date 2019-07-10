package java_collections;
import java.util.HashMap;
import java.util.Map;
/**
 It provides the basic implementation of Map interface of Java.
 It stores the data in (Key, Value) pairs. To access a value one must know its key.
 HashMapClass is known as HashMapClass because it uses a technique called Hashing.
* */
public class HashMapClass {
    public static void main(String[] args) {
        HashMap<String, Integer> name = new HashMap<>();
        name.put("Soumik", 23);
        name.put("Tanisha", 21);
        name.put("Kabir", 25);
        // Get key and values
        for (Map.Entry m: name.entrySet()){
            System.out.println(m.getKey() + ": "+ m.getValue());
        }
        name.putIfAbsent("Shakib", 32);

        System.out.println(name);

        HashMap<String, Integer> map = new HashMap<>();
        map.put("Tamim", 31);
        map.putAll(name);
        System.out.println(map);
        map.clear();
        System.out.println("After clearnig map \n" +map);
        System.out.println(name);

    }

}
