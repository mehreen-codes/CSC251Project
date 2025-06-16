import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class PolicyDemo 
{
    public static void main(String[] args) throws FileNotFoundException 
    {
        ArrayList<Policy> policies = new ArrayList<>();
        int smokerCount = 0;
        int nonSmokerCount = 0;

        File file = new File("PolicyInformation.txt");
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) 
        {
            int policyNumber = Integer.parseInt(scanner.nextLine().trim());
            String providerName = scanner.nextLine().trim();
            String firstName = scanner.nextLine().trim();
            String lastName = scanner.nextLine().trim();
            int age = Integer.parseInt(scanner.nextLine().trim());
            String smokingStatus = scanner.nextLine().trim();
            double height = Double.parseDouble(scanner.nextLine().trim());
            double weight = Double.parseDouble(scanner.nextLine().trim());

            Policy policy = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight);
            policies.add(policy);

            if (smokingStatus.equalsIgnoreCase("smoker")) 
            {
                smokerCount++;
            } else 
            {
                nonSmokerCount++;
            }
        }

        scanner.close();

        for (Policy p : policies) 
        {
            System.out.println("Policy Number: " + p.getPolicyNumber());
            System.out.println("Provider Name: " + p.getProviderName());
            System.out.println("Policyholder's First Name: " + p.getPolicyHolderFirstName());
            System.out.println("Policyholder's Last Name: " + p.getPolicyHolderLastName());
            System.out.println("Policyholder's Age: " + p.getAge());
            System.out.println("Policyholder's Smoking Status (smoker/non-smoker): " + p.getSmokingStatus());
            System.out.println("Policyholder's Height: " + p.getHeight() + " inches");
            System.out.println("Policyholder's Weight: " + p.getWeight() + " pounds");
            System.out.printf("Policyholder's BMI: %.2f\n", p.getBMI());
            System.out.printf("Policy Price: $%.2f\n", p.getPolicyPrice());
            System.out.println();
        }

        System.out.println("The number of policies with a smoker is: " + smokerCount);
        System.out.println("The number of policies with a non-smoker is: " + nonSmokerCount);
    }
}
