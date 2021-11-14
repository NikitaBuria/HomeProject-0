import java.util.Scanner;

public class ProgramFour {
    public static void main(String[] ags) {

        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter parameter a");
        double a = Scan.nextDouble();
        System.out.println("Enter parameter b ");
        double b = Scan.nextDouble();
        System.out.println("Enter parameter c ");
        double c = Scan.nextDouble();
        double mehane = (2 * a);
        double delta = (b * b - 4 * a * c);
        double Solution1 = ( (-1*b) - (Math.sqrt(delta))) / (mehane);
        double Solution2 = ( (-1*b) + (Math.sqrt(delta))) / (mehane);

        if (mehane != 0 && delta >= 0 && Solution1 == Solution2) {
            System.out.println(" There is only one solution X,1 = " + Solution1);
        } else if (mehane != 0 && delta >= 0 && Solution1!=Solution2) {
            System.out.println(" There are two solutions for this X,1 = " + Solution1 + " And X,2 = " + Solution2);
        } else {
            System.out.println( " Only the gods knows the answer for this ");
        }
    }
}