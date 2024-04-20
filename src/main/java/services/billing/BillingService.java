package services.billing;

import entities.Client;
import enums.EnergyType;

public class BillingService {
    private BillingStrategy billingStrategy;

    public void setBillingStrategy(BillingStrategy billingStrategy) {
        this.billingStrategy = billingStrategy;
    }

    public double calculateAmount(Client client, EnergyType energyType, double consumption) {
        if (billingStrategy == null) {
            throw new IllegalStateException("Billing strategy is not set.");
        }
        return billingStrategy.calculateAmount(client, energyType, consumption);
    }
}
