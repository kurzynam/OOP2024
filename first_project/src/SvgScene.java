import java.util.ArrayList;

public class SvgScene {
    private ArrayList<Polygon> polygons;

    public ArrayList<Polygon> getPolygons() {
        return polygons;
    }

    public SvgScene(ArrayList<Polygon> polygons) {
        this.polygons = polygons;
    }

    public void setPolygons(ArrayList<Polygon> polygons) {
        this.polygons = polygons;
    }

    public void addPolygon(Polygon p){
        polygons.add(p);
    }

    public String toSvg(){
        String code = "<svg height=\"300\" width=\"360\" xmlns=\"http://www.w3.org/2000/svg\">";

        for (Polygon polygon : polygons){
            code += polygon.toSvg();
        }
        code += "</svg>";
        return code;
    }
}
