public class ShapeArea {

    public static int shapeArea(int n) {
        int shapeArea = 1;
        for (int i = 0; i < n; i++) {
            shapeArea += (i * 4);
        }
        return shapeArea;
    }
}
