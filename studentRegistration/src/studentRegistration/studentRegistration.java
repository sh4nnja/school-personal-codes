package studentRegistration;
import java.util.Scanner;
public class studentRegistration {
    public static void main(String[] args) {
        final int divCLim = 100;
        final String sInfo = "\"Student Information\""; 
        final String name = "NAME: ";
        final String grdSect = "GRADE LEVEL & SECTION: ";
        final String num = "STUDENT NO: ";
        final String age = "AGE: ";
        String stuName, stuStrnd, stuSect, stuGrd, stuNum, stuAge;
        Scanner userIn = new Scanner(System.in);

        System.out.print("Enter your name: ");
        stuName = userIn.nextLine();
        System.out.print("Enter your student no.: ");
        stuNum = String.valueOf(userIn.nextInt());
        System.out.print("Enter your grade: ");
        stuGrd = String.valueOf(userIn.nextInt());
        userIn.nextLine();
        System.out.print("Enter your strand: ");
        stuStrnd = userIn.nextLine();
        System.out.print("Enter your section: ");
        stuSect = userIn.nextLine();
        System.out.print("Enter your birth year: ");
        stuAge = String.valueOf(2022 - userIn.nextInt());
        userIn.close();
        
        String stuInfoFormat = String.format("%" + (((divCLim - sInfo.length()) / 2) + sInfo.length()) + "s", sInfo);
        String stuNameFormat = name + stuName;
        int stuNumSize = stuNameFormat.length();
        String stuNumFormat = String.format("%" + (divCLim - stuNumSize) + "s" , num + stuNum);
        String stuGrdSectFormat = grdSect + stuGrd + "'" + stuStrnd + "'-" + stuSect;
        int stuGrdSectSize = stuGrdSectFormat.length();
        String stuAgeFormat = String.format("%" + ((divCLim - stuGrdSectSize) - (stuNum.length() + age.length())) + "s", age + stuAge);
        
        System.out.println("".repeat(5));
        System.out.print("-".repeat(divCLim));
        System.out.println("");
        System.out.println(stuInfoFormat);
        System.out.println("");
        System.out.print(stuNameFormat); 
        System.out.print(stuNumFormat);
        System.out.println("");
        System.out.print(stuGrdSectFormat);
        System.out.print(stuAgeFormat);
        System.out.println("");
        System.out.print("-".repeat(divCLim));
    }
}
