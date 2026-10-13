public class Main{
    static void main() {
        ISum sum = (x,b) ->{
            return  x + b;
        };
        ISum add = (x,b) -> x + b;

        int sum1 = sum.sum(3,4);
        System.out.println(sum1);


        ISum isumm = Main::addition;
        int sum2 = isumm.sum(3,4);
        System.out.println(sum2);
    }
    public static int addition(int a,int b){
        return a + b;
    }
}