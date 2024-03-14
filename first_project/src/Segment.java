
class Segment implements Shape{
    public Style getStyle() {
        return style;
    }

    public void setStyle(Style style) {
        this.style = style;
    }

    private Style style;
    private Vec2 startPoint;
    private Vec2 endPoint;
    public Segment(Style style) {
        this.style = style;
    }
    public Segment(Style style, Vec2 startPoint, Vec2 endPoint) {
        this.style = style;
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public Vec2 getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(Vec2 startPoint) {
        this.startPoint = startPoint;
    }

    public Vec2 getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(Vec2 endPoint) {
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

    public static Segment perpendicularSegment(Segment segment, Vec2 point) {
        int dx = segment.getEndPoint().getX() - segment.getStartPoint().getX();
        int dy = segment.getEndPoint().getY() - segment.getStartPoint().getY();
        int newX = point.getX() - dy;
        int newY = point.getY() + dx;
        Vec2 newEndPoint = new Vec2(newX, newY);
        return new Segment(new Style(segment.getStyle()), point, newEndPoint);
    }

}