package studentInfo;
import java.util.Scanner;
public class studentInfo {
	public static void main (String args[]) {
		Scanner userIn = new Scanner(System.in);
		System.out.print("Input name: ");
		String name = userIn.nextLine();
		System.out.print("Input age: ");
		String age = userIn.nextLine();
		System.out.print("Input address: ");
		String address = userIn.nextLine();
		System.out.print("Input contact number: ");
		String contNum = userIn.nextLine();
		System.out.print("Input birthdate - Ex. January 1, 2001: ");
		String birthdate = userIn.nextLine();
		userIn.close();
		System.out.println("");
		System.out.print(
				"Hi! My name is " + name + 
				".\nI am " + age + 
				".\nI live in " + address + 
				".\nMy number is " + contNum + 
				".\nMy birthday is " + birthdate + "."
				);
	}	
}
