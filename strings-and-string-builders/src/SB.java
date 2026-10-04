public class SB {
    static void main() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a'+i);//new string object is not being created every iteration so this is memory optimal
            builder.append(ch);
        }
        System.out.println(builder);
        builder.deleteCharAt(0);
        System.out.println(builder);
    }
}
//String Builders are mutable unlike String