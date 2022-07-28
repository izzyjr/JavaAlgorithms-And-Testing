package strings;

public class IsIsomorphic {

    public static boolean isIsomorphic(String s, String t) {

        int length = s.length();
        String sOrder = "0";
        String tOrder = "0";

        sOrder = getOrder(s, length, sOrder);

        tOrder = getOrder(t, length, tOrder);

        return sOrder.equals(tOrder);
    }

    private static String getOrder(String t, int length, String tOrder) {
        for (int j = 1; j < length; j++) {
            if (t.charAt(j - 1) == t.charAt(j)) {
                tOrder += tOrder.charAt(j - 1);
            } else {
                if (tOrder.charAt(j - 1) == '0') {
                    tOrder += '1';
                } else {
                    tOrder += '0';
                }
            }
        }
        return tOrder;
    }
}
