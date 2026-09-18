class FeeAccount {
    // Base day-scholar fee account[cite: 1]
}

class HostelFeeAccount extends FeeAccount {
    // Specialized hostel fee account[cite: 1]
}

public class AccountBatchApp {
    private static int hostelCount = 0;
    private static int dayScholarCount = 0;

    // instanceof dispatches between account types[cite: 1]
    public static void processPayment(FeeAccount account, double amount) {
        if (account instanceof HostelFeeAccount) {
            System.out.println("Paid in two installments (hostel account)");
            hostelCount++;
        } else if (account instanceof FeeAccount) {
            System.out.println("Paid in one go (day-scholar account)");
            dayScholarCount++;
        }
    }

    public static void main(String[] args) {
        FeeAccount[] accounts = {
            new HostelFeeAccount(),
            new HostelFeeAccount(),
            new FeeAccount(),
            new FeeAccount()
        };

        double amount = 60000.0;

        for (FeeAccount account : accounts) {
            processPayment(account, amount);
        }

        System.out.println("Hostel accounts processed: " + hostelCount + " | Day-scholar accounts processed: " + dayScholarCount);
    }
}