
import java.util.Scanner;
public class  Programfive {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int workerType;
        int yes;
        do {
            System.out.println("Enter the type of worker , 1 for an executive or 0 for minor ");
            workerType = scan.nextInt();
            if (workerType!=0 && workerType!=1) {
                do {
                    System.out.println("You have entered and illegal number, please try again , type 1  for executive or 0 for minor ");
                    workerType = scan.nextInt();
                } while (workerType != 0 && workerType != 1);
            }
            System.out.println("how many hours did he work? ");
            float workerHours = scan.nextFloat();
            System.out.println("In how many days did he reach his goal? ");
            float workerGoal = scan.nextFloat();
            float monthlyWage = wageCalc(workerType, workerHours, workerGoal);
            System.out.println("This month the worker made: " + monthlyWage);
            System.out.println("Do you want me to calculate an another worker for you?  enter 1 for yes or 0 for no");
            yes = scan.nextInt();
           if (yes!=1 && yes!=0) {
               do {
                   System.out.println("This is an illegal number, try again pls");
                   yes = scan.nextInt();
               }
               while (yes!=1 && yes!=0);
           }
        } while (yes==1);
        System.out.println("Bye");
    }
    public static float wageCalc(int a, float b, float c) {
        float monthlyPay0 = b * 50 + c * 250;
        float monthlyPay1 = b * 200 + c * 250;
        if (a == 0) {
            return monthlyPay0;
        } else if ( a==1 ) {
            return monthlyPay1;
    }
        return monthlyPay0;
    }


    }













