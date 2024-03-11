public abstract class Shape {

    protected Style style;

    public Shape(Style style) {
        this.style = style;
    }

    public Style getStyle() {
        return style;
    }

    public void setStyle(Style style) {
        this.style = style;
    }

    public abstract String toSvg();

}
