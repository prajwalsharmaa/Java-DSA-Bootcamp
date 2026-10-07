public class Main{
    static void main() {
        pattern1(5);
    }
    static void pattern1(int n){
//        *
//        **
//        ***
//        ****
//        *****
        for (int i = 1; i <= n; i++) {
            for (int j = n-1; j >=i; j--) {
                System.out.print(" ");
            }
            //for every row, run the col
            for (int j = 1; j <=2*i-1; j++) {

                System.out.print("*");
            }
            System.out.println();
        }
    }
}