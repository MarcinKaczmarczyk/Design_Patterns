package state;

public class Main {
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();

        coffeeMachine.insertThrCoin();
        coffeeMachine.pushTheButton();
        coffeeMachine.takeTheCup();
        coffeeMachine.returnTheCoin();
        coffeeMachine.pushTheButton();
    }
}
