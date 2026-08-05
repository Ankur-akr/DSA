import java.util.ArrayList;

public class lc1823 {
    public int findTheWinner(int n, int k) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 1; i <= n; ++i) {
            al.add(i);
        }
        int cur = 0;

        while (al.size() > 1) {
            int r = (cur+ k - 1) % al.size();
            al.remove(r);
            cur = r;
        }

        return al.get(0);
    }
}
