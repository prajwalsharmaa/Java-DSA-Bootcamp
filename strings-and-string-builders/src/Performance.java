public class Performance {
    static void main() {
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a'+i);//new string object is being created every iteration so this is not memory optimal
            series += ch;
        }
        System.out.println(series);
    }
}
