package ex03;

import ex03.lib.OuterCat;
import ex03.lib.OuterRabbit;

public class App {
    public static void main(String[] args) {
        Doorman doorman = new Doorman();
        // 토끼
        Animal rabbit = new RabbitAdapter(new OuterRabbit());
        doorman.쫒아내(rabbit);
        // 고양이
        Animal cat = new CatAdapter(new OuterCat());
        doorman.쫒아내(cat);
    }
}