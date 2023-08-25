package seminar_02;

public class GoldGenerator extends ItemFabric {

    @Override
    public IGameItem createItem() {
        return new GoldReward();
    }
}
