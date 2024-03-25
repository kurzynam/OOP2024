public class ShapeDecorator implements Shape {
    Shape shape;
    @Override
    public String toSvg() {
        return shape.toSvg();
    }

    public ShapeDecorator(Shape shape) {
        this.shape = shape;
    }
}
