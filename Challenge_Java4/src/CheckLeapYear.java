import java.util.Scanner;

public class CheckLeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter year :  ");
        int year = input.nextInt();

        if(year % 400 ==0 || (year % 4 == 0 && year % 100 !=0))
            System.out.print("Leap year");
        else
            System.out.print("Not a leap year");

    }
}
