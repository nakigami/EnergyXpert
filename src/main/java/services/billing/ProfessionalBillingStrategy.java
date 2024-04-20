package services.billing;

import entities.Client;
import entities.ProfessionalClient;
import enums.EnergyType;

public class ProfessionalBillingStrategy implements BillingStrategy {
    private static final double PRICE_ELECTRICITY_PRO_REVENUE_OVER_1M = 0.110;
    private static final double PRICE_GAS_PRO_REVENUE_OVER_1M = 0.123;
    private static final double PRICE_ELECTRICITY_PRO_REVENUE_UNDER_1M = 0.112;
    private static final double PRICE_GAS_PRO_REVENUE_UNDER_1M = 0.117;

    @Override
    public double calculateAmount(Client client, EnergyType energyType, double consumption) {
        if (client instanceof ProfessionalClient) {
            double revenue = ((ProfessionalClient) client).getAnnualRevenue();
            double amount;
            if (revenue > 1000000) {
                amount = (energyType == EnergyType.ELECTRICITY) ? PRICE_ELECTRICITY_PRO_REVENUE_OVER_1M * consumption : PRICE_GAS_PRO_REVENUE_OVER_1M * consumption;
            } else {
                amount = (energyType == EnergyType.ELECTRICITY) ? PRICE_ELECTRICITY_PRO_REVENUE_UNDER_1M * consumption : PRICE_GAS_PRO_REVENUE_UNDER_1M * consumption;
            }

            return Math.round(amount * 100.0) / 100.0;
        } else {
            throw new IllegalArgumentException("ProfessionalBillingStrategy cannot be applied to individual clients.");
        }
    }
}