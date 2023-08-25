package seminar_02;

public class GemGenerator extends ItemFabric{
    @Override
    public IGameItem createItem() {
        return new GemReward();
    }
}
