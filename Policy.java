/**
   the policy class represents an insurance policy and its associated data.
*/
public class Policy 
{
    private int policyNumber;
    private String providerName;
    private String policyHolderFirstName;
    private String policyHolderLastName;
    private int age;
    private String smokingStatus;
    private double height; 
    private double weight;

    /**
     constructs a Policy object with the provided values.
     @param policyNumber policy number.
     @param providerName insurance provider.
     @param policyHolderFirstName first name of policyholder.
     @param policyHolderLastName last name of policyholder.
     @param age age of policyholder.
     @param smokingStatus smoking status ("smoker" or "non-smoker").
     @param height height of policyholder in inches.
     @param weight weight of policyholder in pounds.
     */
    public Policy(int policyNumber, String providerName, String policyHolderFirstName, String policyHolderLastName,
                  int age, String smokingStatus, double height, double weight) 
    {
        this.policyNumber = policyNumber;
        this.providerName = providerName;
        this.policyHolderFirstName = policyHolderFirstName;
        this.policyHolderLastName = policyHolderLastName;
        this.age = age;
        this.smokingStatus = smokingStatus;
        this.height = height;
        this.weight = weight;
    }

    // @return policy number
    public int getPolicyNumber() { return policyNumber; }

    // @return provider name
    public String getProviderName() { return providerName; }

    // @return policyholder's first name
    public String getPolicyHolderFirstName() { return policyHolderFirstName; }

    // @return policyholder's last name
    public String getPolicyHolderLastName() { return policyHolderLastName; }

    // @return policyholder's age
    public int getAge() { return age; }

    // @return policyholder's smoking status
    public String getSmokingStatus() { return smokingStatus; }

    // @return policyholder's height in inches
    public double getHeight() { return height; }

    // @return policyholder's weight in pounds
    public double getWeight() { return weight; }

    /**
     calculate the BMI
    */
    public double getBMI() 
    {
        return (weight * 703) / (height * height);
    }

    /**
    calculates and return the price of the policy
    */
    public double getPolicyPrice() 
    {
        double basePrice = 600.0;
        if (age > 50) basePrice += 75.0;
        if (smokingStatus.equalsIgnoreCase("smoker")) basePrice += 100.0;
        if (getBMI() > 35) basePrice += (getBMI() - 35) * 20;
        return basePrice;
    }
}