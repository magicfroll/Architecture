package seminar_01.ModelElements;

import seminar_01.Stuff.Point3D;

import java.util.ArrayList;
import java.util.List;

public class PoligonalModel {
    public List<Poligon> Poligons;
    public List<Texture> Textures;

    public PoligonalModel(List<Texture> textures) {
        Poligons = new ArrayList<>();
        this.Textures = textures;
        List<Point3D> Result = new ArrayList<>();
        Poligons.add(new Poligon(Result));
    }
}
