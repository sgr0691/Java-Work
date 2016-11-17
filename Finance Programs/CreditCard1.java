import java.util.Scanner;

public class CreditCard1 {
  public static void main(String [] args) {
    Scanner input = new Scanner(System.in);
    System.out.printf("Enter Credit Card Number:");
    String creditcard = input.next();
    System.out.printf("Enter Credit Limit:");
    double credit_limit = input.nextDouble();
    System.out.printf("Enter Charge:");
    double current_balance  = input.nextDouble();
    System.out.printf("Account Summary\n");
    System.out.printf("Credit Card: %s\n", creditcard);
    System.out.printf("Credit Limit: $%.2f\n", credit_limit);
    System.out.printf("Current Balance: $%.2f\n", current_balance);
    double minimum_payment = current_balance * 0.025;
    double available_credit = credit_limit - current_balance;
    if(available_credit < 0) {
      available_credit = 0;
    }
    System.out.printf("Available Credit: $%.2f\n", available_credit);
    System.out.printf("Minimum Payment Due: $%.2f\n", minimum_payment);
  }
}
