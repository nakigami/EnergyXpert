package utils.factories;

import entities.Client;
import entities.IndividualClient;
import entities.ProfessionalClient;

public class ClientFactory {
    public static Client createClient(String clientType, String clientReference, String... clientData) {
        return switch (clientType) {
            case "Individual" -> createIndividualClient(clientReference, clientData);
            case "Professional" -> createProfessionalClient(clientReference, clientData);
            default -> throw new IllegalArgumentException("Unknown client type: " + clientType);
        };
    }

    private static Client createIndividualClient(String clientReference, String[] clientData) {
        if (clientData.length != 3) {
            throw new IllegalArgumentException("Invalid individual client data.");
        }
        return new IndividualClient(clientReference, clientData[0], clientData[1], clientData[2]);
    }

    private static Client createProfessionalClient(String clientReference, String[] clientData) {
        if (clientData.length != 3) {
            throw new IllegalArgumentException("Invalid professional client data.");
        }
        return new ProfessionalClient(clientReference, clientData[0], clientData[1], Double.parseDouble(clientData[2]));
    }
}