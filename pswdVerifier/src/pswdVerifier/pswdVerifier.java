package pswdVerifier; 
import java.util.Scanner;
public class pswdVerifier {
	public static void main (String args[]) { 
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your password: "); 
		String pswd = in.nextLine(); 
		in.close();
		if (pswd.length() > 7) {
			boolean numVer = false, letVer = false, symVer = false, capVer = false;
			for (int i = 0; i < pswd.length(); i++) {
				if (Character.isDigit(pswd.charAt(i))) { //NUMBER
					numVer = true; 
				} else if (Character.isUpperCase(pswd.charAt(i))) { //UPPERCASE LETTER
					capVer = true; 
				} else if (Character.isLowerCase(pswd.charAt(i))) { //LOWERCASE LETTER
					letVer = true; 
				} else {
					if (Character.isWhitespace(pswd.charAt(i))) { //SPACE (INVALID)
						symVer = false; 
					} else { //SYMBOLS
						symVer = true; 
					} 
				} 
			}
			if (numVer && capVer && letVer && symVer) { 
				System.out.println("Valid Password."); 
			} else { 
				System.out.println("Invalid. Must be a mix of lowercase and uppercase alpha-numeric characters and doesn't contain spaces."); 
			}
		} else { 
			System.out.println("Short Password. Must be 8 or more characters"); 
		}		
	}
}
