/*
 * Sergio Rovira | IT 310
 * NetPay Program 
 * write a program that reads the following information and prints a payroll statement
 * employee's name, number of hours worked per week, hourly pay rate, federal tax withholding rate
 * state tax withholding rate
 */
import java.util.Scanner;
public class NetPay {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
//		Name
		System.out.print("Enter Employee's name:");
		String name = input.next();
//		Hours worked
		System.out.print("Enter number of hours worked:");
		double hoursWorked = input.nextDouble();
//		Hourly pay rate
		System.out.print("Enter hourly pay rate:");
		double hourlyRate = input.nextDouble();
//		Federal Tax amount
		System.out.print("Enter federal tax withholding rate:");
		double fedTaxWithholdingRate = input.nextDouble();
//		State Tax amount
		System.out.print("Enter state tax withholding rate:");
		double stateTaxWithholdingRate = input.nextDouble();
		
		//calculate the different variables
		double grossPay = hourlyRate * hoursWorked;
		double fedWithholding = grossPay * fedTaxWithholdingRate;
		double stateWithholding = grossPay * stateTaxWithholdingRate;
		double totalDeduction = fedWithholding + stateWithholding;
		double netPay = grossPay - totalDeduction;
		
		System.out.println("Employee name: " + name);
		System.out.println("Hours Worked: " + hoursWorked);
		System.out.println("Pay Rate: " + hourlyRate);
		System.out.println("Gross pay: " + grossPay);
		System.out.println("Deductions: ");
		System.out.println("\tFed Withholding (" + fedTaxWithholdingRate*100 +
				"): " + fedWithholding);
		System.out.println("\tState Withholding (" + stateTaxWithholdingRate*100 +
				"): " + stateWithholding);
		System.out.println("\tTotal Deduction: " + totalDeduction);
		System.out.println("Net Pay: " + netPay);


	}
}