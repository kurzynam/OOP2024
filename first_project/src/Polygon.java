import java.util.ArrayList;

public class Polygon extends Shape{
    private ArrayList<Point> points;
    public ArrayList<Point> getPoints() {
        return points;
    }
    public void setPoints(ArrayList<Point> points) {
        this.points = points;
    }

    public Polygon(ArrayList<Point> points, Style style) {
        super(style);
        this.points = points;
    }
    public Polygon(Polygon other) {
        super(new Style(other.getStyle()));
        this.points = new ArrayList<>();
        for (Point point : other.getPoints()) {
            this.points.add(new Point(point.getX(), point.getY()));
        }
    }
    public String toSvg() {
        String code = "\n";
        code += "\t";
        code += "<polygon points=\"";
        for (Point p : points){
            code += p.getX() + "," + p.getY() + " ";
        }
        code += "\"";
        code += getStyle().toSvg() + "/>";
        code += "\n";
        return  code;
    }
    public  void translate(int x, int y){
        ArrayList<Point> newPoints = new ArrayList<>();
        for (int i = 0; i < points.size(); i++){
            int newx = points.get(i).getX() + x;
            int newy = points.get(i).getY() + y;
            newPoints.set(i,new Point(newx, newy));
        }
        setPoints(newPoints);
    }
}
