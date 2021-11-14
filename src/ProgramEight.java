import java.util.Scanner;

public class ProgramEight {



    public static void main(String[] args) {

         int num  = receiveNumber();
         calcSeries(num);
    }

    public static void calcSeries (int num) {
        for (int i=0; i<num;i++) {
            for (int j=0;j<=i;j++)
                 System.out.print("*");
                 System.out.println();
            }
    }



    public static int receiveNumber () {
        Scanner scanner= new Scanner(System.in);
        int num;
        System.out.println("Enter a number in the range of 5-20");
        num=scanner.nextInt();
        while ( num<5||num>20) {

            System.out.println("Your number is not in the range try again enter a number between 5 and 20 ");
            num = scanner.nextInt();
        }

         return num;

    }


}



