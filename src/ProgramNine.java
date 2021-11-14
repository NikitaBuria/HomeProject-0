import java.util.Scanner;
public class ProgramNine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num3 = checkPositive();
        for (int i = 2; i <=num3; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ,");

            }
        }
    }
    public static boolean divideCheck(int i, int j) {
        if (i % j == 0) {
            return true;
        } else return false;
    }
    public static boolean isPrime(int i) {
        boolean prime;
        int a=0;
        for (int j = 1; j <=i; j++) {
            prime = divideCheck(i, j);
            if (prime) {
                 a=a+1;
                if (a == 3) {
                     return false;
                }
            }
        }
        return true;
    }
    public static int checkPositive(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a positive number");
        int num1=scanner.nextInt();
        while(num1<0){
            System.out.println("Enter a positive number");
            num1=scanner.nextInt();
        }
        return num1;
    }
}