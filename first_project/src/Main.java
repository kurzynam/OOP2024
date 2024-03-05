import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        Point A = new Point(100,20);
        Point B = new Point(180,60);
        Point C = new Point(180,140);
        Point D = new Point(100,180);
        Point E = new Point(20,140);
        Point F = new Point(20,60);

        Point G = new Point(300,97);
        Point H = new Point(12,109);
        Point I = new Point(48,222);

        Point J = new Point(300,300);
        Point K = new Point(300,200);
        Point L = new Point(200,200);
        Point M = new Point(200,300);

        Point[] pointsForHexagon = {A,B,C,D,E,F};
        Point[] pointsForTriangle = {G,H,I};
        Point[] pointsForSquare = {J,K,L,M};




        Style styleForHexagon = new Style("#ffff00", "red", 20);
        Style styleForTriangle = new Style("green", "blue", 20);
        Style styleForSquare = new Style("black", "gray", 20);


        ArrayList<Polygon> polygons = new ArrayList<Polygon>();


        Polygon hexagon = new Polygon(pointsForHexagon, styleForHexagon);
        Polygon triangle = new Polygon(pointsForTriangle, styleForTriangle);
        Polygon square = new Polygon(pointsForSquare, styleForSquare);
        polygons.add(hexagon);
        polygons.add(triangle);
        polygons.add(square);
        SvgScene scene = new SvgScene(polygons);


        System.out.println(scene.toSvg());


//        Segment segment = new Segment(A, B);
//        Segment perpSegment = Segment.perpendicularSegment(segment, C);
//
//        System.out.println(perpSegment.getEndPoint().x + " " + perpSegment.getEndPoint().y);





//        Point start = new Point(20,200);
//        Point end = new Point(300,30);
//        Segment segment = new Segment(start, end);
//        Segment perpSegment = Segment.perpendicularSegment(segment,Point.middlePoint(start,end));
//        Point[] hexagonPoints = {
//                new Point(100, 20),
//                new Point(180, 60),
//                new Point(180, 140),
//                new Point(100, 180),
//                new Point(20, 140),
//                new Point(20, 60)
//        };
//
//        Polygon hexagon = new Polygon(hexagonPoints);
//        System.out.println(segment.lineToSvg());
//        System.out.println(perpSegment.lineToSvg());
//        System.out.println(hexagon.polygonToSvg());
//        hexagon.translate(80,80);
//        System.out.println(hexagon.polygonToSvg());
//        hexagon.translate(80,-80);
//        System.out.println(hexagon.polygonToSvg());

    }

}