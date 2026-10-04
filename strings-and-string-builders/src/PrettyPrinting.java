public class PrettyPrinting {
    static void main() {
        float a = 453.1287f;
        System.out.printf("Formatted number is %.2f \n",a);
        System.out.println(Math.PI);

        System.out.printf("Pie: %.4f",Math.PI);
        System.out.println();
        System.out.printf("Hello, I am %s and I am a %s" ,"Prajwal","student");
        System.out.println('a'+'b');
        System.out.println('a'+3);
        System.out.println((char)('a' + 3));
        System.out.println("a" + 1);
        //integer will be converted to Integer(Wrapper Class) and toString methods is called
    }
}
