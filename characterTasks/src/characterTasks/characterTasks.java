package characterTasks; import java.util.Scanner; import java.util.regex.Pattern;  import java.util.regex.Matcher;
public class characterTasks {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String a = "4Qtr Performance Task 1: ", b = "1 - Counting Vowels", c = "2 - What is between?",  d = "3 - Exit";
		System.out.printf("%-25s %n %-25s %s %15s %n%nEnter your choice (1 - 3): ", a, b, c, d);
		int choice = in.nextInt(), v = 0;
		in.nextLine();
		if (choice == 1) {
			System.out.print("\nEnter a string: ");
			String str = in.nextLine();
			Pattern p = Pattern.compile("[AEIOUaeiou]");
			Matcher m = p.matcher(str);
			while (m.find()) { v++; }
			System.out.printf("Total vowels in a string: " + v );
		} else if (choice == 2) {
			System.out.printf("Enter first number and second number (Separate by pressing Enter.):");
			int fn = in.nextInt(), sn = in.nextInt();
			if (fn >= sn) {
				System.out.println("First value must be lesser than the second.");
				System.out.println("Program Ended.");
			} else {
				System.out.println("");
				for (int i = fn; i <= sn; i++) { System.out.print(i + " "); }
			}
		} else if (choice == 3) { System.out.println("Thank you. Program Ended."); } 
		else { System.out.print("Invalid Choice. Enter 1, 2, or 3 only."); }
		in.close();
	}
}
