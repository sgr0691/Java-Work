// Sergio Rovira 
// October 17, 2016

import java.util.Scanner;

public class NetPay {
public static void main(String[] args) {
		
		/* Defined scanner */
		Scanner keyboard = new Scanner(System.in);
		
		/* Defined the constants */
		final double FEDERAL_TAX_PERCENT = 20.00;
		final double STATE_TAX_PERCENT = 9.0;
		final double PAY_PER_HOUR = 18.25;
		
		/* Declared the variables */
		int hoursPerWeek;
		double grossPay;
		double netPay;
		double federalTax;
		double stateTax;
	
		/* Tell users to enter hours per week */
		System.out.print("Hours per Week: \t");
		hoursPerWeek = keyboard.nextInt();
		
		/* Made sure to compute the variables */
		grossPay = hoursPerWeek * PAY_PER_HOUR;
		federalTax = ((grossPay * FEDERAL_TAX_PERCENT)/100);
		stateTax = ((grossPay * STATE_TAX_PERCENT)/100);
		netPay = grossPay - federalTax - stateTax;
		
		/* Display the results for each question */
		System.out.println("Gross Pay: \t \t" + grossPay);
		System.out.printf("Net Pay: \t \t" + "%.5f\n", netPay);
		System.out.println("");
		System.out.println("Deductions");
		System.out.println("Federal: \t \t" + federalTax);
		System.out.println("State: \t \t \t" + stateTax);
					
	}
}
