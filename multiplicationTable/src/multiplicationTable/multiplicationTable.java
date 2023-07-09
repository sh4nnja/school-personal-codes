package multiplicationTable;
import java.util.Scanner;
public class multiplicationTable {
	public static void main (String args[]) {
		Scanner uIn = new Scanner(System.in);
		System.out.print("Input number: ");
		int num = uIn.nextInt();
		uIn.close();
		System.out.println("");
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d x %d = %d\n", num, i, (num * i));
		}
		
	}
}
