import java.util.Scanner;
public class ProgramSix {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        float firstNumber; float difference; int length;

        System.out.println("Enter the first number in the series ");
        firstNumber =  scanner.nextFloat();
        System.out.println("Enter the difference ");
        difference = scanner.nextFloat();
        System.out.println("Enter the length of the series ");
        length = scanner.nextInt();
        calcSeries(firstNumber,difference,length);
    }
    public static float calcSeries (float a , float b , int c) {

        int i;
        for (i=0 ; i<c ;i++) {
            a = a + b;
            System.out.print(a + ", ");
        }return a;

    }


}
