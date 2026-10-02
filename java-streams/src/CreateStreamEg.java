import java.util.*;
import java.util.stream.Stream;

public class CreateStreamEg {
    static void main() {
        //Create a stream from List
        List<String> fruit = new ArrayList<>( );
        fruit.add("Banana");
        fruit.add("Mange");
        fruit.add("Apple");
        fruit.add("Orange");


        List<String> fruitList =Arrays.asList("Banana","Mange","Orange");
        Stream<String> stream = fruitList.stream();
//        stream.forEach((element)->{
//            System.out.println(element);
//        });
       // stream.forEach(System.out::println);


        //Create a stream from set
        Set<String> fruitSet = new HashSet<>(fruitList);
        Stream<String> stream1 = fruitSet.stream();
       // stream1.forEach(System.out::println);

        //Create a stream from map
        Map<String,Integer> fruitMap = new HashMap<>();
        fruitMap.put("Apple",10);
        fruitMap.put("Banana",5);
        fruitMap.put("Orange",20);
        fruitMap.put("Mango",45);

        //Create a stream from map entrySet
        Stream<Map.Entry<String,Integer>> mapEntryStream = fruitMap.entrySet().stream();
        mapEntryStream.forEach(System.out::println);

        // Create a stream from Map's key set
        Stream<String> mapKeySetStream = fruitMap.keySet().stream();
        mapKeySetStream.forEach(System.out::println);

        // Create a stream from Map's values
        Stream<Integer> mapValuesStream = fruitMap.values().stream();
        mapValuesStream.forEach(System.out::println);
    }
}
