import java.util.Scanner;

public class ProgramTwo {
    public static void main(String[] args)

    {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number ");
        double num = scan.nextDouble();
        System.out.println("Enter the next number ");
        double num2 = scan.nextDouble();
        double num3 = num + num2 ;
        if (num3%2==0) {
            System.out.println("Your number is even");

        }
        else {
            System.out.println("Your number is odd");
        }




    }



}



