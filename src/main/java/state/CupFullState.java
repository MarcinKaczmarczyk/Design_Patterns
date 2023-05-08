package state;

public class CupFullState implements State{
    @Override
    public void insertTheCoin(CoffeeMachine coffeeMachine) {
        System.out.println("zabierz kubek");
    }

    @Override
    public void pushTheButton(CoffeeMachine coffeeMachine) {
        System.out.println("Najpierw zabierz kubek");
    }

    @Override
    public void takeTheCup(CoffeeMachine coffeeMachine) {
        System.out.println("zabrano kubek");
        coffeeMachine.state = new NoCoinState();
    }

    @Override
    public void returnTheCoin(CoffeeMachine coffeeMachine) {
        System.out.println("za późno ");
    }
}
