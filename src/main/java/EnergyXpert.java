import entities.Client;
import enums.EnergyType;
import services.billing.BillingService;
import services.billing.IndividualBillingStrategy;
import services.billing.ProfessionalBillingStrategy;
import utils.factories.ClientFactory;

public class EnergyXpert {
        public static void main(String[] args) {
            BillingService billingService = new BillingService();

            // Using Factory Method to create individual client
            Client individualClient = ClientFactory.createClient("Individual", "EKW123456789", "Mr.", "Smith", "John");
            billingService.setBillingStrategy(new IndividualBillingStrategy());
            double individualElectricityAmount = billingService.calculateAmount(individualClient, EnergyType.ELECTRICITY, 100);
            System.out.println("Individual electricity amount: " + individualElectricityAmount);

            // Using Factory Method to create professional client
            Client professionalClient = ClientFactory.createClient("Professional", "EKW987654321", "123456789", "Company XYZ", "500000.0");
            billingService.setBillingStrategy(new ProfessionalBillingStrategy());
            double professionalGasAmount = billingService.calculateAmount(professionalClient, EnergyType.GAS, 100);
            System.out.println("Professional gas amount: " + professionalGasAmount);

        }
}
