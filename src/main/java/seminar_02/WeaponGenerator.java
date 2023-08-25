package seminar_02;

public class WeaponGenerator extends ItemFabric{

    @Override
    public IGameItem createItem() {
        return new WeaponReward();
    }
}
