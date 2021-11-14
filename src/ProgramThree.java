import java.util.Scanner;

public class ProgramThree {

    public static void main(String[] arg) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter three numbers");

        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        double num3 = scan.nextDouble();

        if ((num1 >= num3 && num1 > num2) && num3 >= num2) {
            System.out.println(num1);
            System.out.println(num3);
            System.out.println(num2);
        } else if (num1 > num3 && num1 >= num2 && num3 <= num2) {
            System.out.println(num1) ;
            System.out.println(num2) ;
            System.out.println(num3) ;

        }
        if (num2 >= num3 && num2 > num1 && num3 >= num1) {
            System.out.println(num2);
            System.out.println(num3);
            System.out.println(num1);
        } else if (num2 > num3 && num2 > num1 && num3 < num1) {
            System.out.println(num2);
            System.out.println(num1);
            System.out.println(num3);
        }
        if (num3 >= num2 && num3 > num1 && num1 >= num2) {
            System.out.println(num3);
            System.out.println(num1);
            System.out.println(num2);
        } else if (num3 > num2 && num3 >= num1 && num1 <= num2) {
            System.out.println(num3);
            System.out.println(num2);
            System.out.println(num1);
        }
        if (num3 == num2 && num3 == num1 && num1 == num2) {
            System.out.println(num3);
            System.out.println(num1);
            System.out.println(num2);

        }
    }
}








