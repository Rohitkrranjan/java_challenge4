import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the value of a,b,c : ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c= input.nextInt();

        // now apply condition
        if(a>b && a>c)
            System.out.print(a+ " is greater");
        else if (b>c && b>a)
            System.out.print(b+" is greater");
        else
            System.out.print(c+ " is greater");
    }
}
