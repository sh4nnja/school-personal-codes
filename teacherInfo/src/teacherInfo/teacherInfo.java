package teacherInfo;
import java.util.Scanner;
public class teacherInfo {
	public static void main (String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter name: ");
		String n = in.nextLine();
		System.out.print("Enter Year & Section: ");
		String y = in.nextLine();
		System.out.print("Enter date: ");
		String d = in.nextLine();
		System.out.print("Enter teacher: ");
		String a = in.nextLine();
		in.close();
		System.out.printf("\nHi! I am %s, %s. \nThis program is to be submitted to %s at %s", n, y, a, d);
	}
}
