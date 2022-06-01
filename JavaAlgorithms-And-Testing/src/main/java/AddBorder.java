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

    // first attempt solution
    public static String[] addBorder0(String[] picture) {

        int newArraySize = picture.length + 2;
        String[] framedPicture = new String[newArraySize];
        int stringLength = picture[0].length() + 2;
        int orginalArrayLengthCounter = 0;
        String topBottom = topBottomFrameGenerator(stringLength);

        for (int i = 0; i < framedPicture.length; i++) {
            if (i == 0 || i == framedPicture.length - 1) {
                framedPicture[i] = topBottom;
            } else {
                framedPicture[i] = "*" + picture[orginalArrayLengthCounter] + "*";
                orginalArrayLengthCounter++;
            }
        }

        printPicture(framedPicture);
        return framedPicture;
    }

    private static void printPicture(String[] framedPicture) {

        for (int i = 0; i < framedPicture.length; i++) {
            System.out.println(framedPicture[i]);
        }
    }

    private static String topBottomFrameGenerator(int length) {

        String topBottomFrame = "";
        for (int i = 0; i < length; i++) {
            topBottomFrame = topBottomFrame.concat("*");
        }

        return topBottomFrame;
    }
}
