import java.util.*;

public class PolicyDemo {
    public static void main(String[] args) {
        ArrayList<Policy> policies = new ArrayList<>();

        policies.add(new Policy(3450, "State Farm", new PolicyHolder("Alice", "Jones", 20, true, 65.0, 110.0)));
        policies.add(new Policy(3455, "Aetna", new PolicyHolder("Bob", "Lee", 54, false, 72.0, 200.0)));
        policies.add(new Policy(2450, "Met Life", new PolicyHolder("Chester", "Williams", 40, true, 71.0, 300.0)));
        policies.add(new Policy(3670, "Global", new PolicyHolder("Cindy", "Smith", 55, false, 62.0, 140.0)));
        policies.add(new Policy(1490, "Reliable", new PolicyHolder("Jenna", "Lewis", 30, true, 60.0, 105.0)));
        policies.add(new Policy(3477, "State Farm", new PolicyHolder("Craig", "Duncan", 23, true, 66.0, 215.0)));

        int smokerCount = 0;
        int nonSmokerCount = 0;

        for (Policy policy : policies) {
            System.out.println(policy); // calls toString() implicitly
            System.out.println(); // line break
            if (policy.getPolicyHolder().getSmokingStatus()) {
                smokerCount++;
            } else {
                nonSmokerCount++;
            }
        }

        System.out.printf("There were %d Policy objects created.\n", Policy.getPolicyCount());
        System.out.printf("The number of policies with a smoker is: %d\n", smokerCount);
        System.out.printf("The number of policies with a non-smoker is: %d\n", nonSmokerCount);
    }
}
