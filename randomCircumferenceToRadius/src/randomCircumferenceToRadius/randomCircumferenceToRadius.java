package randomCircumferenceToRadius;
import java.util.Random;
public class randomCircumferenceToRadius {
	public static void main(String[] args) {
	       Random ran = new Random();
	       int circumference;
	       double r;

	       circumference = ran.nextInt();
	       circumference = ran.nextInt(10)+1; //this will generate random numbers between 1 to 10
	       r = circumference / (2* Math.PI); //derived formula for the radius

	       System.out.print("Generated Circumference: "+ circumference);
	       System.out.print("\nThe radius is: "+ r);
	      }
}
