package services.billing;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import entities.Client;
import entities.ProfessionalClient;
import enums.EnergyType;

public class ProfessionalBillingStrategyTest {
    @Test
    public void testCalculateAmountElectricity() {
        ProfessionalBillingStrategy strategy = new ProfessionalBillingStrategy();
        Client client = new ProfessionalClient("EKW987654321", "123456789", "Company XYZ", 500000.0);
        double consumption = 100;
        double expectedAmount = 11.0; // 0.110 * 100 (revenue > 1000000)
        double actualAmount = strategy.calculateAmount(client, EnergyType.ELECTRICITY, consumption);
        assertEquals(expectedAmount, actualAmount, 0.2);
    }

    @Test
    public void testCalculateAmountGas() {
        ProfessionalBillingStrategy strategy = new ProfessionalBillingStrategy();
        Client client = new ProfessionalClient("EKW987654321", "123456789", "Company XYZ", 500000.0);
        double consumption = 100;
        double expectedAmount = 11.7; // 0.117 * 100 (revenue < 1000000)
        double actualAmount = strategy.calculateAmount(client, EnergyType.GAS, consumption);
        assertEquals(expectedAmount, actualAmount, 0.001);
    }
}
