import java.util.Scanner;

public class ProgramTen {

    public static void main(String[] args) {
        int random = (int) (Math.random() * 1000) + 1;
        games(random);
    }

    public static void games(int random) {
        System.out.println("We are creating a number from 1-1000 and then you can start guessing ");
        Scanner scanner = new Scanner(System.in);
        int b = 0;
        int a = 0;

            while (true) {
                System.out.println("Its p1 turn enter a number from 1-1000");
                int p1Try = scanner.nextInt();
                if (p1Try != random || p1Try == random) {
                    a = a + 1;
                }
                if (p1Try < random) {
                    System.out.println("The number ," + p1Try + " is smaller then the random number");
                } else if (p1Try > random) {
                    System.out.println("The number ," + p1Try + " is bigger then the random number");
                }
                if (p1Try == random) {
                    System.out.println("You have won  after "+ a + " tries, the number is, " + random );
                    break;
                }
                System.out.println("Its p2 turn enter a number from 1-1000"); // p2 tries
                int p2Try = scanner.nextInt();
                if (p2Try != random || p2Try == random) {
                    b = b + 1;
                }
                if (p2Try < random) {
                    System.out.println("The number ," + p2Try + " is smaller then the random number");
                } else if (p2Try > random) {
                    System.out.println("The number ," + p2Try + " is bigger then the random number");
                }
                if (p2Try == random) {
                    System.out.println("You have won  after "+ b + " tries, the number is, "+random );
                    break;
                }
                }
            }

        }




