package seminar_01.ModelElements;

import seminar_01.Stuff.Point3D;

import java.util.ArrayList;
import java.util.List;

public class Poligon {
    public List<Point3D> Points = new ArrayList<>();

    public Poligon(List<Point3D> points){
        this.Points = points;
    }
}
