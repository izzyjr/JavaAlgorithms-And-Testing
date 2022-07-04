public class CanConstruct {

    public static boolean canConstruct(String ransomNote, String magazine) {

        int count = 0;

        for (int i = 0; i < ransomNote.length(); i++) {
            for (int j = 0; j < magazine.length(); j++) {
                if (ransomNote.charAt(i) == magazine.charAt(j)) {
                    count++;
                    if (i < ransomNote.length() - 1) {
                        i++;
                    }
                }
            }
        }

        return count == ransomNote.length();
    }
}
