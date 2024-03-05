public class Style {
    private String fill;
    private String stroke;
    private double strokeWidth;

    public Style(String fill, String stroke, double strokeWidth) {
        this.fill = fill;
        this.stroke = stroke;
        this.strokeWidth = strokeWidth;
    }

    public String getFill() {
        return fill;
    }

    public void setFill(String fill) {
        this.fill = fill;
    }

    public String getStroke() {
        return stroke;
    }

    public void setStroke(String stroke) {
        this.stroke = stroke;
    }

    public double getStrokeWidth() {
        return strokeWidth;
    }

    public void setStrokeWidth(double strokeWidth) {
        this.strokeWidth = strokeWidth;
    }
    String toSvg(){
        return " style=\"fill:" + fill + ";" + "stroke:"
                + stroke  + ";" + "stroke-width:" + strokeWidth + "\"";
    }

}
