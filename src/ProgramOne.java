import java.util.Scanner;
public class ProgramOne {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter an integer");
        int num = Scan.nextInt();
        num = Math.abs(num);
        System.out.println("You absolute number is " + num);
    }

}
