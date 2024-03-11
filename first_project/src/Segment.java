
class Segment extends Shape{
    private Point startPoint;
    private Point endPoint;
    public Segment(Style style) {
        super(style);
    }
    public Segment(Style style, Point startPoint, Point endPoint) {
        super(style);
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
        int deltaX = endPoint.getX() - startPoint.getX();
        int deltaY = endPoint.getY() - startPoint.getY();
        return Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
    }
    public String toSvg() {
        String code = "\n\t";
        code += "<line";
        code += "\n\t\t";
        code += "x1=\"  "+ startPoint.getX() +"\"";
        code += "\n\t\t";
        code += "y1=\"  "+ startPoint.getY() +"\"";
        code += "\n\t\t";
        code += "x2=\"  "+ endPoint.getX() +"\"";
        code += "\n\t\t";
        code += "y2=\"  "+ endPoint.getY() +"\"";
        code += "\n\t\t";
        code += getStyle().toSvg();
        code += "/>";
        return code;
    }

    public static Segment perpendicularSegment(Segment segment, Point point) {
        int dx = segment.getEndPoint().getX() - segment.getStartPoint().getX();
        int dy = segment.getEndPoint().getY() - segment.getStartPoint().getY();
        int newX = point.getX() - dy;
        int newY = point.getY() + dx;
        Point newEndPoint = new Point(newX, newY);
        return new Segment(new Style(segment.getStyle()), point, newEndPoint);
    }

}