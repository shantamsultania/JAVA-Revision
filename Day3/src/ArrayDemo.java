import java.util.*;

public class ArrayDemo {

    public static void main(String[] args) {
    // Fruit Basket

        // Ten Differnt Fruit

        // Declare

        // Know size dont the elements  String arrayname[] = new String[Size] ;

        // elements but not the size

        // String arrayname[] = {"Apple","Banana"};

        List<String> fruitBasket11 = new ArrayList<>();

        List<String> fruitBasket22 = new ArrayList<>(Arrays.asList("Apple","Grapes","Mango","Orange","Watermelon"));


        String fruitBasket1[] = new String[5] ;

        String fruitBasket2[] = {"Apple","Grapes","Mango","Orange","Watermelon"};

        // Insert
        for (int i=0;i<fruitBasket1.length;i++){
            fruitBasket1[i] = fruitBasket2[i];
        }

        for (int i=0;i<fruitBasket1.length;i++){
            if(fruitBasket1[i] == "Apple"){
                fruitBasket1[i] = "";
            }
        }

                for (int i=0;i<fruitBasket1.length;i++){
            System.out.println(fruitBasket1[i]);
        }


        System.out.println("--------------------");
        for (int i=0;i<fruitBasket22.size();i++){
            fruitBasket11.add(fruitBasket22.get(i));
        };

        fruitBasket11.remove(fruitBasket11.indexOf("Apple"));

        for (int i=0;i<fruitBasket11.size();i++){
            System.out.println(fruitBasket11.get(i));
        }


        // Delete

        // Display

        // Get a value

        // Search



    }
}
