package findHighestNumber;
import java.util.Scanner;
public class findHighestNumber {
    public static void main(String args[]) {
        Scanner userIn = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num1 = userIn.nextInt();
        System.out.print("Input a number: ");
        int num2 = userIn.nextInt();
        System.out.print("Input a number: ");
        int num3 = userIn.nextInt();
        userIn.close();
        if (num1 > num2 && num1 > num3){
            System.out.println("The highest number is: " + num1);
        } else if (num2 > num1 && num2 > num3){
            System.out.println("The highest number is: " + num2);
        } else {
            System.out.println("The highest number is: " + num3);
        }
    }
}