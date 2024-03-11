import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class SvgScene {

    private ArrayList<Shape> shapes;

    public void add(Shape shape){
        shapes.add(shape);
    }

    public ArrayList<Shape> getShapes() {
        return shapes;
    }
    public void setShapes(ArrayList<Shape> shapes) {
        this.shapes = shapes;
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
}
