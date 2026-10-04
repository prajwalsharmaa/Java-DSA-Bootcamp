import java.util.Arrays;

public class Methods {
    static void main() {
        String name = "Prajwal Sharma";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name);//Original is not changed because it immutable
        System.out.println(name.indexOf('l'));
        System.out.println("     Prajwal     ".strip());
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
