public class AddBorder {

    public static String[] addBorder(String[] picture) {

        String[] framed = new String[picture.length + 2];
        String horizontalBorders = new String(new char[picture[0].length() + 2]).replace('\0', '*');
        framed[0] = horizontalBorders;
        framed[framed.length - 1] = horizontalBorders;

        for (int i = 0; i < picture.length; i++) {
            framed[i + 1] = "*" + picture[i] + "*";
        }

        return framed;
    }
}
