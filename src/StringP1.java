import java.util.Arrays;

public class StringP1 {
    static void main() {
       /* String series ="";
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a'+i);
            //System.out.println(series=series+ch);
            series+=ch;
        }
        System.out.println(series);*/
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            sb.append(ch);
        }
        System.out.println(sb);
        String name ="Ankur";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toCharArray());
    }
}