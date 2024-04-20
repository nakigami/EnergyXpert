package entities;

public class ProfessionalClient extends Client {
    private String siretNumber;
    private String companyName;
    private double annualRevenue;

    public ProfessionalClient(String clientReference, String siretNumber, String companyName, double annualRevenue) {
        super(clientReference);
        this.siretNumber = siretNumber;
        this.companyName = companyName;
        this.annualRevenue = annualRevenue;
    }

    public String getSiretNumber() {
        return siretNumber;
    }

    public String getCompanyName() {
        return companyName;
    }

    public double getAnnualRevenue() {
        return annualRevenue;
    }
}