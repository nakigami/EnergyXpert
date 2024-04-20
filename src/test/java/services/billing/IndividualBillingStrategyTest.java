package services.billing;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import entities.Client;
import entities.IndividualClient;
import enums.EnergyType;
import services.billing.IndividualBillingStrategy;

public class IndividualBillingStrategyTest {
    @Test
    public void testCalculateAmountElectricity() {
        IndividualBillingStrategy strategy = new IndividualBillingStrategy();
        Client client = new IndividualClient("EKW123456789", "Mr.", "Smith", "John");
        double consumption = 100;
        double expectedAmount = 13.3; // 0.133 * 100
        double actualAmount = strategy.calculateAmount(client, EnergyType.ELECTRICITY, consumption);
        assertEquals(expectedAmount, actualAmount, 0.001);
    }

    @Test
    public void testCalculateAmountGas() {
        IndividualBillingStrategy strategy = new IndividualBillingStrategy();
        Client client = new IndividualClient("EKW123456789", "Mr.", "Smith", "John");
        double consumption = 100;
        double expectedAmount = 10.8; // 0.108 * 100
        double actualAmount = strategy.calculateAmount(client, EnergyType.GAS, consumption);
        assertEquals(expectedAmount, actualAmount, 0.001);
    }
}
