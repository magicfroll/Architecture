package seminar_01.ModelElements;

import java.lang.reflect.Type;
import java.util.List;

public class Scene {
    public int id;
    public List<PoligonalModel> Models;
    public List<Flash> Flashes;

    public Scene(int id, List<PoligonalModel> models, List<Flash> flashes){
        this.id = id;
        this.Models = models;
        this.Flashes = flashes;
    }

    public Type method(Type type){return type;}
    public Type method(Type type1, Type type2){return type1;}
}
