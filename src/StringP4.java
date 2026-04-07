public class StringP4 {
    static void main() {
        String s ="abcde";
        String g = "cdeab";
        int st=0;
        StringBuilder nString = new StringBuilder();
        boolean isRotation = false;
        if(s.length()!=g.length()){
            System.out.println(isRotation);
        }else {
            for (int i = 0; i < s.length()-1; i++) {
                if(s.charAt(0)==g.charAt(i)){
                    st = i;
                }
            }
            for (int i = st; i <g.length() ; i++) {
                nString.append(g.charAt(i));
            }
            for (int i = 0; i < st; i++) {
                nString.append(g.charAt(i));
            }
        }
        isRotation = s.equals(nString.toString());
        System.out.println(isRotation);
        System.out.println(nString);
    }
}
