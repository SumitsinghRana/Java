import java.util.*;

public class hashMap {
    public static void main(String args[]) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("sumit", 44);
        map.put("raju", 66);
        map.put("shubham", 77);
        map.put("abhishek", 88);
        System.out.println(map);
        System.out.println(map.containsKey("sumit"));
        System.out.println(map.get("raju"));
        for(Map.Entry<String,Integer>e:map.entrySet()){
            System.out.println(e);
        }
    }
}