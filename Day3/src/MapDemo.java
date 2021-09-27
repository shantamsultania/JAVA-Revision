import java.util.*;

public class MapDemo {


    public static void main(String[] args) {

        // Key , Value

        Map<Integer,String> stringMap = new HashMap<>();

        stringMap.put(1,"Apple");
        stringMap.put(2,"Mango");
        stringMap.put(3,"Banana");
        stringMap.put(1,"Orange");

        int n = 10 ;

        if(stringMap.containsKey(6)){
            System.out.println("yes key present");
        }else{
            System.out.println(" no key presnt ");
            }

        for (Map.Entry<Integer, String> integerStringEntry : stringMap.entrySet()) {
            System.out.println(integerStringEntry.getKey() +" :  "+ integerStringEntry.getValue());
        }


    }
}
