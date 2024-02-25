import java.util.Arrays;

public class Polygon {
    private Point[] points;

    public Point[] getPoints() {
        return points;
    }
    public void setPoints(Point[] points) {
        this.points = points;
    }
    public Polygon(Point[] points) {
        this.points = points;
    }

    public Polygon(Polygon other) {
        this.points = new Point[other.points.length];
        for (int i = 0; i < other.points.length; i++) {
            this.points[i] = new Point(other.points[i].x, other.points[i].y);
        }
    }

    public String toSvg() {
        String svgCode = "<svg height=\"240\" width=\"500\" xmlns=\"http://www.w3.org/2000/svg\">" +
                polygonToSvg() +
                "</svg>";
        return svgCode;
    }
    public String polygonToSvg(){
        StringBuilder svgCode = new StringBuilder();
        svgCode.append("\t<polygon points=\"");
        for (Point point : points) {
            svgCode.append(point.x).append(",").append(point.y).append(" ");
        }
        svgCode.append("\" ");
        svgCode.append("style=\"fill:none;stroke:green;stroke-width:12\" />");
        return svgCode.toString();
    }

    public  void translate(int x, int y){
        Point[] newPoints = new Point[points.length];

        for (int i = 0; i < points.length; i++){
            int newx = points[i].x + x;
            int newy = points[i].y + y;
            newPoints[i] = new Point(newx, newy);
        }
        setPoints(newPoints);
    }

}
