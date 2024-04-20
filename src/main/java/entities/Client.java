package entities;

public abstract class Client {
    private final String clientReference;

    public Client(String clientReference) {
        this.clientReference = clientReference;
    }

    public String getClientReference() {
        return clientReference;
    }
}
