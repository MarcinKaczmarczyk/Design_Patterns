package strategy.zadanie.strategy;

public class SalePrice implements PricingStrategy{
    @Override
    public void calculatePrice(int price, boolean isSignedUpForNewsletter) {
        System.out.println("przecena: "+price/2+"zł");
        if (!isSignedUpForNewsletter){
            System.out.println("Użytkownik nie jest zapisany do newslettera, należy wybrać inną strategię cenową!");
        }
    }
}
