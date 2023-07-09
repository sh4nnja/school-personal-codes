package woodType;
import java.util.Scanner;
public class woodType {
	public static void main (String args[]) {
		System.out.print("[1] Palochina  \n[2] Mahogany \n[3] Narra \n\nSelect wood type: ");
		Scanner in = new Scanner(System.in);
		int choice = in.nextInt(), price = 0; 
		in.close();
		switch (choice) {
			case (1):
				price = 12000;
				System.out.printf("Palochina selected, Price: P%d", price);
				break;
			case (2):
				price = 22500;
				System.out.printf("Mahogany selected, Price: P%d", price);
				break;
			case (3):
				price = 33500;
				System.out.printf("Narra selected, Price: P%d", price);
				break;
			default:
				price = 0;
				System.out.printf("Invalid wood type. Try again.");
				break;
		}
	}
}
