package factory.metodaFabrykujaca;

import factory.metodaFabrykujaca.unites.Factory;
import factory.metodaFabrykujaca.unites.Unit;
import factory.metodaFabrykujaca.unites.UnitFactory;
import factory.metodaFabrykujaca.unites.UnitType;

public class Main {
    public static void main(String[] args) {
        Factory factory=new UnitFactory();
        Unit tank=factory.createUnit(UnitType.TANK);
        Unit rifleman=factory.createUnit(UnitType.RIFLEMAN);

        System.out.println(tank.getDmgDone());
        System.out.println(rifleman.getDmgDone());
    }
}
