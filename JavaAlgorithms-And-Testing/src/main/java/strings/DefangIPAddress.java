package strings;

public class DefangIPAddress {

    public static String defangIPAddress(String address) {

        StringBuilder defanged = new StringBuilder();

        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) == '.') {
                defanged.append("[").append(address.charAt(i)).append("]");
            } else {
                defanged.append(address.charAt(i));
            }
        }

        return defanged.toString();
    }
}
