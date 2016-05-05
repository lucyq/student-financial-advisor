import static java.lang.System.*;
import java.util.Scanner;


public class Calculations {


	private static double calculatePostTaxIncome(int income, int matching, String state, int monthlySpending) {
		double annualSpending = monthlySpending * 12;


		// assumed filing singly

		// calculate income post-tax without 401k matching

		return 10000;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Income: ");
		int income = scanner.nextInt();
 
		System.out.print("Monthly Spending: ");
		int monthlySpending = scanner.nextInt();

		System.out.print("State Abbrevation: ");
		String state = scanner.next();

		System.out.print("401(k) matching (% matched by company): ");
		int matching = scanner.nextInt();

		double postTaxIncome = calculatePostTaxIncome(income, matching, state, monthlySpending);
		System.out.print(income + " "  + matching + " " + state + "\n");

	}

}

