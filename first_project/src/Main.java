import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        ArrayList<Vec2> pointsForHegaxon = new ArrayList<>();
        ArrayList<Vec2> pointsForTriangle = new ArrayList<>();
        ArrayList<Vec2> pointsForSquare = new ArrayList<>();

        pointsForHegaxon.add(new Vec2(100,20));
        pointsForHegaxon.add(new Vec2(180,60));
        pointsForHegaxon.add(new Vec2(180,140));
        pointsForHegaxon.add(new Vec2(100,180));
        pointsForHegaxon.add(new Vec2(20,140));
        pointsForHegaxon.add(new Vec2(20,60));

        pointsForTriangle.add(new Vec2(300,197));
        pointsForTriangle.add(new Vec2(12,209));
        pointsForTriangle.add(new Vec2(48,322));

        pointsForSquare.add(new Vec2(200,200));
        pointsForSquare.add(new Vec2(200,100));
        pointsForSquare.add(new Vec2(100,100));
        pointsForSquare.add(new Vec2(100,200));

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