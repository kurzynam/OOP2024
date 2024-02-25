import java.lang.Math;

class Point {
    public final int x;
    public final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static Point middlePoint(Point p1, Point p2){
        return new Point(
                (p1.x + p2.x)/2,
                (p1.y + p2.y)/2
        );
    }
}




