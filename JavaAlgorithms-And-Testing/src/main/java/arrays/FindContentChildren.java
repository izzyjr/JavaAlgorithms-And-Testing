package arrays;

public class FindContentChildren {

    public static int findContentChildren(int[] g, int[] s) {

        int count = 0;
        int min = Integer.MAX_VALUE;
        int diff = 0;
        int index = 0;

        for (int i = 0; i < g.length; i++) {
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
                if (j == s.length - 1) {
                    s[index] = -1;
                    count++;
                }
            }
        }

        return count;
    }
}
