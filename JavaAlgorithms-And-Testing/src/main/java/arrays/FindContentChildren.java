package arrays;

public class FindContentChildren {

    public static int findContentChildren(int[] g, int[] s) {

        int count = 0;

        for (int i = 0; i < g.length; i++) {
            int min = Integer.MAX_VALUE;
            int index = 0;
            int diff = 0;
            for (int j = 0; j < s.length; j++) {
                if (g[i] == s[j]) {
                    count++;
                    s[j] = -1;
                    break;
                } else if (g[i] < s[j]) {
                    diff = s[j] - g[i];
                    if (diff < min) {
                        min = diff;
                        index = j;
                    }
                }
                if (j == s.length - 1 && min != Integer.MAX_VALUE) {
                    s[index] = -1;
                    count++;
                }
            }
        }

        return count;
    }
}
