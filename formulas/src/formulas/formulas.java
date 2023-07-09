package formulas;
import java.lang.Math;
public class formulas {
	public static void main (String args[]){
		double r = 40, x = 6, y = 8, p = 11;
		System.out.println("The length needed is " + Math.round((2 * Math.PI * r) * 100.0) / 100.0 + "cm.");
		System.out.println("The distance is " + Math.round(Math.sqrt(Math.pow(x,2)+ Math.pow(y, 2))) + " blocks away.");
		System.out.println("The radius is " + Math.round((p / (2 * Math.PI)) * 100.0) / 100.0 + "km.");
	}		
}

