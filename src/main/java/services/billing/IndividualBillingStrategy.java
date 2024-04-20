package services.billing;

import entities.Client;
import enums.EnergyType;

public class IndividualBillingStrategy implements BillingStrategy {
    private static final double PRICE_ELECTRICITY_INDIVIDUAL = 0.133;
    private static final double PRICE_GAS_INDIVIDUAL = 0.108;

    @Override
    public double calculateAmount(Client client, EnergyType energyType, double consumption) {
        if (client != null) {
            double amount;
            if (energyType == EnergyType.ELECTRICITY) {
                amount = PRICE_ELECTRICITY_INDIVIDUAL * consumption;
            } else {
                amount = PRICE_GAS_INDIVIDUAL * consumption;
            }

            return Math.round(amount * 100.0) / 100.0;
        } else {
            throw new IllegalArgumentException("IndividualBillingStrategy cannot be applied to professional clients.");
        }
    }
}