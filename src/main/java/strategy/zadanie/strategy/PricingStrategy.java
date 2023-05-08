package strategy.zadanie.strategy;

public interface PricingStrategy {
    void calculatePrice(int price, boolean isSignedUpForNewsletter);
}
