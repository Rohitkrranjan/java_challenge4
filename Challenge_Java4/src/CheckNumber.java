import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number : ");
        int num = input.nextInt();
        if(num == 0)
             System.out.print("given number is zero");
        else if(num>0) {
            System.out.println("given number is positive");
        }
        else {
            System.out.println("given number is negative");
        }

    }
}