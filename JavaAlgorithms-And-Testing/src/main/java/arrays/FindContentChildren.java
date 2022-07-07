package arrays;

public class FindContentChildren {

    public static int findContentChildren(int[] g, int[] s) {

        int count = 0;

        for (int i = 0; i < g.length; i++) {
            for (int j = 0; j < s.length; j++) {
                if (g[i] >= s[j]) {
                    count++;
                    s[j] = -1;
                    break;
                }
            }
        }

        return count;
    }
}
