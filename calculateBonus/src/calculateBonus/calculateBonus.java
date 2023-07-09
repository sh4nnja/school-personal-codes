package calculateBonus;
import java.util.Scanner;
public class calculateBonus {
	public static void main (String args[]) {
		Scanner userIn = new Scanner(System.in);
		System.out.print("Kindly input pay: ");
		double bonus = 0;
		float pay = userIn.nextFloat();
		userIn.close();
		if (pay > 3000) {
			bonus = 300;
		} else if (pay <= 3000 && pay > 1600) {
			bonus = pay * 0.10;
			if (bonus > 240) { bonus = 240; }
		} else if (pay < 1600) {
			bonus = pay * 0.15;
			if (bonus > 100) { bonus = 100; }
		} 
		System.out.println("Your bonus is: " + bonus);
	}
}