import java.sql.Array;

public class Comparison {
    static void main() {
        String a = "Prajwal";
        String b = "Prajwal";



        // ==

        System.out.println(a==b);//true because it points to same object

        //How to create diff objects of same value
        String name1 = new String("Prajwal" );
        String name2 = new String("Prajwal");

        //Check value
        System.out.println(name1.equals(name2));

        System.out.println(name1==name2);
    }
}
