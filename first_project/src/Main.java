public class Main {
    public static void main(String[] args){

        Point A = new Point(100,200);
        Point B = new Point(300,401);
        Point C = new Point(500,602);
        Segment segment = new Segment(A, B);


        System.out.println(segment.toSvg());





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