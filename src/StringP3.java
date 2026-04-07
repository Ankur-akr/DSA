import java.util.ArrayList;
import java.util.Arrays;

public class StringP3 {
    static void main() {
        String s = "5032";
        int ind = -1;

        int i;
        for (i = s.length() - 1; i >= 0; i--) {
            if ((s.charAt(i) - '0') % 2 == 1) {
                ind = i;
                break;
            }
        }

        if (ind == -1) System.out.println("");

        i = 0;
        while (i <= ind && s.charAt(i) == '0') i++;

        System.out.println(s.substring(i, ind + 1));

    }
}
