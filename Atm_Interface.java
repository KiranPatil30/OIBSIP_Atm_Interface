import java.util.Scanner;

public class Atm_Interface {

	public static void main(String[] args) {

		int ch, pin = 0;
		// ch = choice;
		long amount = 0;
		long Deposit, Withdraw;

		Scanner s = new Scanner(System.in);
		String transactionHistory = "";
		int ID = 1964;

		do {
			System.out.println("Enter your ID  :- ");
			ID = s.nextInt();

			System.out.println("Enter your pin no :- ");
			pin = s.nextInt();

			if (ID != 1399 || pin != 2001)
				System.out.println("Please Enter Correct password");
		} while (ID != 1399 && pin != 2001);

		do {
			System.out.println("\n****---> ATM SERVICE <---****");
			System.out.println(" 1. Trasction History ");
			System.out.println(" 2. Deposit ");
			System.out.println(" 3. Withdraw ");
			System.out.println(" 4. Transfer ");
			System.out.println(" 5. Quit ");

			System.out.println("\n Enter your Choice : ");
			ch = s.nextInt();

			switch (ch) {
				case 1:
					System.out.println("Trasaction History \n" + transactionHistory);
					break;

				case 2:
					System.out.println("\n Enter the amount to Deposit ");
					int c = s.nextInt();
					amount = amount + c;
					System.out.println(" Your balance is " + amount);
					break;

				case 3:
					System.out.println("\n Enter the amount to Withdraw");
					int b = s.nextInt();

					if (b % 100 != 0) {
						System.out.println("\nPlease Enter the amount in Multiple of 100 ");
					} else if (b > (amount - 500)) {
						System.out.println("\n No Sufficent Balance !!");
					} else {
						amount = amount - b;
						System.out.println("\n\n Please receive cash");
						System.out.println("Your current balance is " + amount);
					}
					break;

				case 4:
					System.out.println("_____-----Transfer-----______"); {
					Scanner sc = new Scanner(System.in);
					System.out.print("\nEnter Receipent's Name : ");
					String receipent = sc.nextLine();
					System.out.print("\nEnter amount you wish to transfer : ");
					float amount1 = sc.nextFloat();

					try {
						if (amount >= amount1) {
							if (amount1 <= 10000f) {
								// transaction++;
								amount -= amount1;
								System.out.println("\nSuccessfully Transfered to " + receipent);
								String str = amount1 + " Rs transfered to " + receipent + "\n";
								transactionHistory = transactionHistory.concat(str);
							} else {
								System.out.println("\n Invalid transfer..Limit is 10000.00 only");
							}
						} else {
							System.out.println("\n No Sufficient Balance");
						}
					} catch (Exception e) {
					}
				}

				case 5:
					System.out.println("Thanks for using ATM service");
					break;

				default:
					System.out.println(" Choice is NOT FOUND !!");
			}

		} while (ch != 5);
	}
}