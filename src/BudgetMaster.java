import java.util.Scanner;

public class BudgetMaster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Initialize variables
        double monthlyIncome;
        double totalExpenses = 0;
        String budgetStatus;
        
        // Prompt the user to enter their monthly income
        System.out.print("Enter your monthly income: $");
        monthlyIncome = scanner.nextDouble();
        
        // Initialize an array to store monthly expenses
        double[] expenses = new double[5];
        
        // Prompt the user to enter various monthly expenses
        String[] expenseNames = {"Rent/Mortgage", "Utilities", "Groceries", "Transportation", "Entertainment"};
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter your " + expenseNames[i] + " expense: $");
            expenses[i] = scanner.nextDouble();
            totalExpenses += expenses[i];
        }
        
        // Compare totalExpenses to monthlyIncome
        if (totalExpenses <= monthlyIncome) {
            budgetStatus = "Within Budget";
        } else {
            budgetStatus = "Overspending";
        }
        
        // Display the results
        System.out.println("Total Monthly Income: $" + monthlyIncome);
        System.out.println("Total Monthly Expenses: $" + totalExpenses);
        System.out.println("Budget Status: " + budgetStatus);
        
        // Close the scanner
        scanner.close();
    }
        // Helper function to get user input as a double
        public static double getUserInput(Scanner scanner) {
            while (true) {
                try {
                    return Double.parseDouble(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Please enter a valid numeric value.");
                    System.out.print("Try again: $");
            }
        }
    }
}
