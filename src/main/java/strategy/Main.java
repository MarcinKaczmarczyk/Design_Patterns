package strategy;

import strategy.egg_cooker.HardBoiledEggCooker;
import strategy.egg_cooker.SoftBoiledEggCooker;

public class Main {
    public static void main(String[] args) {
//        zamówienie - jajka na twardo
        Chef chef=new Chef("Gordon Gesler");
        chef.setEggCooker(new HardBoiledEggCooker());
        chef.cook();
//        nowe zamówienie jaja na miękko
        chef.setEggCooker(new SoftBoiledEggCooker());
        chef.cook();
    }
}
