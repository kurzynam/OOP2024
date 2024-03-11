public class Style {

    private String fill;
    private String stroke;
    private double strokeWidth;
    public String toSvg(){
        String code= " style=\"fill:";
        code += getFill();
        code += ";";
        code += "stroke:";
        code += getStroke();
        code += ";";
        code += "stroke-width:";
        code += getStrokeWidth();
        code += ";";
        code += "\"";
        return code;
    }


    public Style(String fill, String stroke, double strokeWidth) {
        this.fill = fill;
        this.stroke = stroke;
        this.strokeWidth = strokeWidth;
    }

    public Style(Style styleToCopy) {
        this.fill = styleToCopy.getFill();
        this.stroke = styleToCopy.getStroke();
        this.strokeWidth = styleToCopy.getStrokeWidth();
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
}
