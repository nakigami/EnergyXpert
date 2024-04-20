package services.billing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import entities.Client;
import entities.IndividualClient;
import enums.EnergyType;

public class BillingServiceTest {
    private static final double DELTA = 0.01; // Tolerance for rounding errors

    @Test
    public void testCalculateAmountWithBillingStrategy() {
        // Prepare test data
        BillingService billingService = new BillingService();
        BillingStrategy billingStrategy = new IndividualBillingStrategy(); // Using IndividualBillingStrategy for testing
        billingService.setBillingStrategy(billingStrategy);
        Client client = new IndividualClient("EKW123456789", "Mr", "RIANI", "Anas");
        double consumption = 100;
        double expectedAmount = 13.3; // Individual electricity amount

        // Execute the test
        double actualAmount = billingService.calculateAmount(client, EnergyType.ELECTRICITY, consumption);

        // Verify the result
        assertEquals(expectedAmount, actualAmount, DELTA);
    }

    @Test(expected = IllegalStateException.class)
    public void testCalculateAmountWithoutBillingStrategy() {
        // Prepare test data
        BillingService billingService = new BillingService();
        Client client = new IndividualClient("EKW123456789", "Mr", "RIANI", "Yassine");
        double consumption = 100;

        // Execute the test
        billingService.calculateAmount(client, EnergyType.ELECTRICITY, consumption);

        // Fail if IllegalStateException is not thrown
        fail("Expected IllegalStateException to be thrown");
    }
}