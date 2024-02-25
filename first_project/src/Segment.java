import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

class Segment {
    private Point startPoint;
    private Point endPoint;

    public Segment(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public Point getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(Point startPoint) {
        this.startPoint = startPoint;
    }

    public Point getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(Point endPoint) {
        this.endPoint = endPoint;
    }

    public double length() {
        int deltaX = endPoint.x - startPoint.x;
        int deltaY = endPoint.y - startPoint.y;
        return Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
    }
    public String toSvg() {

        String svgCode = "<svg height=\"240\" width=\"500\" xmlns=\"http://www.w3.org/2000/svg\">" +
                lineToSvg() +
                "</svg>";
        return svgCode;
    }

    public String lineToSvg() {
        String lineSvgCode =  "\t" +
                "<line x1=\"" + startPoint.x +
                   "\" y1=\"" + startPoint.y +
                   "\" x2=\"" + endPoint.x +
                   "\" y2=\"" + endPoint.y +
                   "\" style=\"stroke:red;stroke-width:8\" " +
                "/>";

        return lineSvgCode;
    }

    public static Segment perpendicularSegment(Segment segment, Point point) {

        int dx = segment.getEndPoint().x - segment.getStartPoint().x;
        int dy = segment.getEndPoint().y - segment.getStartPoint().y;

        int newX = point.x - dy;
        int newY = point.y + dx;

        Point newEndPoint = new Point(newX, newY);
        return new Segment(point, newEndPoint);
    }

}