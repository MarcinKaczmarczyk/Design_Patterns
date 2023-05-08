package strategy.zadanie.strategy;

public class RegularPrice implements PricingStrategy {
    @Override
    public void calculatePrice(int price, boolean isSignedUpForNewsletter) {
        System.out.println("normalna cena: "+price+"zł");
        if (isSignedUpForNewsletter){
            System.out.println("Użytkownik zapisany do newslettera, należy wybrać inną strategię cenową!");
        }
    }
}
