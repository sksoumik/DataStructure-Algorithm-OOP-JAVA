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

        System.out.println("Map size is :"+name.size());
        System.out.println(name);
        System.out.println(name.get("Soumik")); // returns the key of Soumik
        name.clear(); // removes everything from HashMap
        System.out.println(name); //Prints empty Map => {}
        System.out.println(name.isEmpty()); // Return true if the list is empty,
                                       //otherwise false
    }

}
