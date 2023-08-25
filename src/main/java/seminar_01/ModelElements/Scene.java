package seminar_01.ModelElements;

import java.lang.reflect.Type;
import java.util.List;

public class Scene {
    public int Id;
    public List<PoligonalModel> Models;
    public List<Flash> Flashes;
    public List<Camera> Cameras;

    public Scene(int id, List<PoligonalModel> models, List<Flash> flashes, List<Camera> cameras) throws Exception {
        Id = id;
        if (models.size() > 0) {
            Models = models;
        } else throw new Exception ("Должны быть хотя бы одна модель");
        Flashes = flashes;
        if (cameras.size() > 0) {
            Cameras = cameras;
        } else throw new Exception ("Должны быть хотя бы одна камера");
    }

    public Type method(Type type) {
        return type;
    }

    public Type method(Type type1, Type type2) {
        return type1;
    }
}
