public class TransformationDecorator extends ShapeDecorator{

    private boolean translate, rotate, scale;
    Vec2 translateVector, rotateCenter, scaleVector;
    private double rotateAngle;

    @Override
    public String toSvg() {
        StringBuilder sb = new StringBuilder(shape.toSvg());
                sb.append(" transform=\"");
        if(scale)
            sb.append(" scale(")
                    .append(scaleVector.getX())
                    .append(" ").append(scaleVector.getY())
                    .append(") ");
        sb.append("\"");
        return sb.toString();
    }

    public TransformationDecorator(Shape shape,boolean translate, boolean rotate, boolean scale, Vec2 translateVector, Vec2 rotateCenter, Vec2 scaleVector, double rotateAngle) {
        super(shape);
        this.translate = translate;
        this.rotate = rotate;
        this.scale = scale;
        this.translateVector = translateVector;
        this.rotateCenter = rotateCenter;
        this.scaleVector = scaleVector;
        this.rotateAngle = rotateAngle;
    }

    public static class Builder{
        private boolean translate, rotate, scale;
        private Vec2 translateVector, rotateCenter, scaleVector;
        private double rotateAngle;

        public Builder translate(Vec2 translateVector){
            this.translateVector = translateVector;
            translate = true;
            return  this;
        }
        public Builder scale(Vec2 scaleVector){
            this.scale = true;
            this.scaleVector = scaleVector;
            return this;
        }

        public Builder rotate(double rotateAngle, Vec2 rotateCenter){
            this.rotateAngle = rotateAngle;
            this.rotateCenter = rotateCenter;
            this.rotate = true;
            return this;
        }

        public TransformationDecorator build(Shape shape){
            return new TransformationDecorator(shape,translate, rotate, scale, translateVector, rotateCenter, scaleVector, rotateAngle);
        }


    }
}
