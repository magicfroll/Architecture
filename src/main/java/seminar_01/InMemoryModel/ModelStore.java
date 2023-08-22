package seminar_01.InMemoryModel;

import seminar_01.ModelElements.Camera;
import seminar_01.ModelElements.Flash;
import seminar_01.ModelElements.PoligonalModel;
import seminar_01.ModelElements.Scene;

import java.util.ArrayList;
import java.util.List;

public class ModelStore implements IModelChanger{
    public List<PoligonalModel> Models;
    public List<Scene> Scenes;
    public List<Flash> Flashes;
    public List<Camera> Cameras;
    private List<IModelChangeObserver> changedObserver;

    public ModelStore(List<IModelChangeObserver> changedObserver) throws Exception {
        this.changedObserver = changedObserver;
        this.Models = new ArrayList<>();
        this.Scenes = new ArrayList<>();
        this.Flashes = new ArrayList<>();
        this.Cameras = new ArrayList<>();

        Models.add(new PoligonalModel(null));
        Flashes.add(new Flash());
        Cameras.add(new Camera());
        Scenes.add(new Scene(0, Models, Flashes));
    }

    public Scene getScene() {
        return null;
    }

    @Override
    public void NotifyChange(IModelChanger sender) {}
}
