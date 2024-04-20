package services.billing;

import entities.Client;
import enums.EnergyType;

public interface BillingStrategy {
    double calculateAmount(Client client, EnergyType energyType, double consumption);
}