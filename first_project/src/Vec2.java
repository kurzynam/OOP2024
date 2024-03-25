public class Vec2 {
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

    public Vec2(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static Vec2 middlePoint(Vec2 p1, Vec2 p2){
        return new Vec2(
                (p1.x + p2.x)/2,
                (p1.y + p2.y)/2
        );

    }
}




