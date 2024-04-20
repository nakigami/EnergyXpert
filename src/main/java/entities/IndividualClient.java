package entities;

public class IndividualClient extends Client {
    private String civility;
    private String lastName;
    private String firstName;

    public IndividualClient(String clientReference, String civility, String lastName, String firstName) {
        super(clientReference);
        this.civility = civility;
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public String getCivility() {
        return civility;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }
}

