package strategy.zadanie;

import strategy.zadanie.strategy.PricingStrategy;

public class PriceCalculator {
    private PricingStrategy strategy;

    public void calculate(int price, boolean isSignedUpForNewsletter){
        strategy.calculatePrice(price,isSignedUpForNewsletter);
    }

    public void setPricingStrategy(PricingStrategy strategy) {
        this.strategy = strategy;
    }
}
