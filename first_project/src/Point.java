import java.lang.Math;

class Point {
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    private int x;
    private  int y;

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




