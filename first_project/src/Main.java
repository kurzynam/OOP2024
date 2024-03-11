import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){

        ArrayList<Point> pointsForHegaxon = new ArrayList<>();
        ArrayList<Point> pointsForTriangle = new ArrayList<>();
        ArrayList<Point> pointsForSquare = new ArrayList<>();

        pointsForHegaxon.add(new Point(100,20));
        pointsForHegaxon.add(new Point(180,60));
        pointsForHegaxon.add(new Point(180,140));
        pointsForHegaxon.add(new Point(100,180));
        pointsForHegaxon.add(new Point(20,140));
        pointsForHegaxon.add(new Point(20,60));

        pointsForTriangle.add(new Point(300,197));
        pointsForTriangle.add(new Point(12,209));
        pointsForTriangle.add(new Point(48,322));

        pointsForSquare.add(new Point(200,200));
        pointsForSquare.add(new Point(200,100));
        pointsForSquare.add(new Point(100,100));
        pointsForSquare.add(new Point(100,200));

        Shape hexagon = new Polygon(pointsForHegaxon, new Style("yellow", "red", 5));
        Shape triangle = new Polygon(pointsForTriangle, new Style("purple", "blue", 5));
        Shape square = new Polygon(pointsForSquare, new Style("black", "gray", 5));

        SvgScene scene = new SvgScene();
        scene.add(hexagon);
        scene.add(triangle);
        scene.add(square);

        scene.saveToFile("test.svg");
    }

}