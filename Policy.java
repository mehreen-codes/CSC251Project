public class Policy 
{
    // Attributes
    private int policyNumber;
    private String providerName;
    private String policyHolderFirstName;
    private String policyHolderLastName;
    private int policyHolderAge;
    private String policyHolderSmokingStatus; // "smoker" or "non-smoker"
    private double policyHolderHeight; // in inches
    private double policyHolderWeight; // in pounds

    // No-arg constructor
    public Policy() 
    {
        policyNumber = 0;
        providerName = "";
        policyHolderFirstName = "";
        policyHolderLastName = "";
        policyHolderAge = 0;
        policyHolderSmokingStatus = "non-smoker";
        policyHolderHeight = 0.0;
        policyHolderWeight = 0.0;
    }

    // Full-arg constructor
    public Policy(int policyNumber, String providerName,
                  String firstName, String lastName, int age,
                  String smokingStatus, double height, double weight) 
    {
        this.policyNumber = policyNumber;
        this.providerName = providerName;
        this.policyHolderFirstName = firstName;
        this.policyHolderLastName = lastName;
        this.policyHolderAge = age;
        this.policyHolderSmokingStatus = smokingStatus.toLowerCase();
        this.policyHolderHeight = height;
        this.policyHolderWeight = weight;
    }

    // Getters and Setters
    public int getPolicyNumber() 
    {
      return policyNumber; 
    }
    public void setPolicyNumber(int policyNumber) 
    {
      this.policyNumber = policyNumber;
    }

    public String getProviderName() 
    {
      return providerName;
    }
    public void setProviderName(String providerName)
    {
      this.providerName = providerName;
    }

    public String getPolicyHolderFirstName()
    {
      return policyHolderFirstName;
    }
    public void setPolicyHolderFirstName(String firstName)
    {
      this.policyHolderFirstName = firstName;
    }

    public String getPolicyHolderLastName()
    {
      return policyHolderLastName;
    }
    public void setPolicyHolderLastName(String lastName) 
    {
      this.policyHolderLastName = lastName;
    }

    public int getPolicyHolderAge() 
    {
      return policyHolderAge;
    }
    public void setPolicyHolderAge(int age) 
    {
      this.policyHolderAge = age;
    }

    public String getPolicyHolderSmokingStatus() 
    {
      return policyHolderSmokingStatus;
    }
    public void setPolicyHolderSmokingStatus(String smokingStatus) 
    {
      this.policyHolderSmokingStatus = smokingStatus.toLowerCase();
    }

    public double getPolicyHolderHeight()
    {
      return policyHolderHeight;
    }
    public void setPolicyHolderHeight(double height) 
    {
      this.policyHolderHeight = height;
    }

    public double getPolicyHolderWeight()
    {
      return policyHolderWeight;
    }
    public void setPolicyHolderWeight(double weight) 
    {
      this.policyHolderWeight = weight;
    }

    // Calculate BMI
    public double calculateBMI() 
    {
        if (policyHolderHeight == 0) return 0;
        return (policyHolderWeight * 703) / (policyHolderHeight * policyHolderHeight);
    }

    // Calculate Policy Price
    public double calculatePolicyPrice() 
    {
        double price = 600.0;

        if (policyHolderAge > 50) 
        {
            price += 75.0;
        }

        if (policyHolderSmokingStatus.equals("smoker")) 
        {
            price += 100.0;
        }

        double bmi = calculateBMI();
        if (bmi > 35) 
        {
            price += (bmi - 35) * 20;
        }

        return price;
    }
}
