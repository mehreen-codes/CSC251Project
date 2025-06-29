public class Policy 
{
    private int policyNumber;
    private String providerName;
    private PolicyHolder policyHolder;

    private static int policyCount = 0; // static field

    // Constructor
    public Policy(int policyNumber, String providerName, PolicyHolder holder) {
        this.policyNumber = policyNumber;
        this.providerName = providerName;
        this.policyHolder = new PolicyHolder(holder); // use copy constructor
        policyCount++; // increment count
    }

    // Accessors
    public int getPolicyNumber() { return policyNumber; }
    public String getProviderName() { return providerName; }
    public PolicyHolder getPolicyHolder() { return new PolicyHolder(policyHolder); }

    public double getPrice() {
        double basePrice = 600.0;
        if (policyHolder.getAge() > 50) basePrice += 75.0;
        if (policyHolder.getSmokingStatus()) basePrice += 100.0;
        if (policyHolder.getBMI() > 35) basePrice += (policyHolder.getBMI() - 35) * 20;
        return basePrice;
    }

    public static int getPolicyCount() {
        return policyCount;
    }

    public String toString() {
        return String.format("Policy Number: %d\nProvider Name: %s\n%s\nPolicy Price: $%.2f",
            policyNumber, providerName, policyHolder.toString(), getPrice());
    }
}
