import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class SvgScene {

    private ArrayList<Shape> shapes;

    public void add(Shape shape){
        shapes.add(shape);
    }

    public SvgScene() {
        shapes = new ArrayList<>();
    }

    public void saveToFile(String filePath){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
            writer.write(toSvg());
            writer.close();
            System.out.println("Plik " + filePath + " został poprawnie zapisany!");
        } catch (IOException e) {
            System.err.println("Wystąpił błąd podczas zapisywania do pliku: " + e.getMessage());
        }
    }

    public String toSvg(){
        String code = "<svg height=\"360\" width=\"360\" xmlns=\"http://www.w3.org/2000/svg\">";
        for (Shape poly : shapes){
            code += "\n\t";
            code += poly.toSvg();
        }
        code += "</svg>";
        return code;
    }

//    private ArrayList<Shape> shapes;
//    private int width, height;
//
//    public int getWidth() {
//        return width;
//    }
//
//    public void setWidth(int width) {
//        this.width = width;
//    }
//
//    public int getHeight() {
//        return height;
//    }
//
//    public void setHeight(int height) {
//        this.height = height;
//    }
//
//    public SvgScene(ArrayList<Shape> shapes, int width, int height) {
//        this.shapes = shapes;
//        this.width = width;
//        this.height = height;
//    }
//    public SvgScene(int width, int height) {
//        this.shapes = new ArrayList<>();
//        this.width = width;
//        this.height = height;
//    }
//
//    public ArrayList<Shape> getShapes() {
//        return shapes;
//    }
//
//    public void setShapes(ArrayList<Shape> shapes) {
//        this.shapes = shapes;
//    }
//
//    public void addShape(Shape p){
//        shapes.add(p);
//    }
//
//    public String toSvg(){
//        String code = "<svg height=\" " + getHeight() + " \" width=\"   " + getWidth() + "\" xmlns=\"http://www.w3.org/2000/svg\">";
//
//        for (Shape shape : shapes){
//            code += shape.toSvg();
//        }
//        code += "</svg>";
//        return code;
//    }
//    public void writeToFile(String filePath) {
//        try {
//            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
//            writer.write(toSvg());
//            writer.close();
//            System.out.println("Plik " + filePath + " został poprawnie zapisany!");
//        } catch (IOException e) {
//            System.err.println("Wystąpił błąd podczas zapisywania do pliku: " + e.getMessage());
//        }
//    }
}
