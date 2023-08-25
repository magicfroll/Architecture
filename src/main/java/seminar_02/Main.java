/**
 * Реализация порождающего паттерна проектирования "Фабричный метод"
 */
package seminar_02;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
//        ItemFabric generator = new GoldGenerator();
//        generator.openReward();
//        generator = new GemGenerator();
//        generator.openReward();

        Random rnd = ThreadLocalRandom.current();
        List<ItemFabric> fabricList = new ArrayList<>();

        fabricList.add(new GoldGenerator());
        fabricList.add(new GemGenerator());
        fabricList.add(new WeaponGenerator());

//        for (int i = 0; i < 20; i++) {
//            int index = Math.abs(rnd.nextInt() % 2) == 0 ? 0 : 1;
//            ItemFabric fabric = fabricList.get(index);
//            fabric.openReward();
//        }

        Random randomizer = new Random();
        for (int i = 0; i < 20; i++) {
            ItemFabric reward = fabricList.get(randomizer.nextInt(fabricList.size()));
            reward.openReward();
        }
    }
}
