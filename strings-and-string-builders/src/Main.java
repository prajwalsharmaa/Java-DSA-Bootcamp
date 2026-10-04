public class Main{
    static void main() {
        String name = "Prajwal";
        changeName(name);
        System.out.println(name);

        String a = "Rebel";
        String b = "Rebel";
        System.out.println(a);
        a = "Man";
        System.out.println(a);

        Integer num = 34;
        changeNum(num);
        System.out.println(num);

    }
    static void changeName(String name){
        name = "Sharma";
    }
    static void changeNum(Integer a ){
        a = 345;
    }
}