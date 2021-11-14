import java.util.Scanner;
public class ProgramSeven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int day;
        float early,late;

        System.out.println("Enter the day you want to arrive");
        day = scan.nextInt();
        if (day >= 1 && day <= 7) {
            if (day != 6 && day != 7) {
                if (day >= 1 && day <= 5 && day != 3) {
                    System.out.println(" We are open from 9:00 to 17:00, How early do you want to arrive? ");
                    early = scan.nextFloat();
                    if (early>=9 && early < 17) {
                        System.out.println("How late do  you want to arrive ? ");
                        late = scan.nextFloat();
                        if (late >= 9 && late < 17) {
                            while (early>late) {
                                System.out.println("Your early hour is later then your late hour, pls try again");
                                early=scan.nextFloat();
                            }
                            if (early == late) {
                                System.out.println("You can come at day: "+day +"at " + early);
                            }
                            if (early<late ) {
                                System.out.println("You are set to come at day: " + day + " You can come as early at:  " + early + " You can come as late as: " + late);
                            }
                        } else
                            System.out.println("We are closed at that time, and we are open at this day from 9:00-17:00");
                    } else
                        System.out.println("We are closed at that time, and we are open at this day from 9:00-17:00");
                }
                if (day == 3) {
                    System.out.println("we are open from 8:00 to 12:00 ,How early do you want to arrive? ");
                    early = scan.nextFloat();
                    if (early>=8 && early < 12) {
                        System.out.println("How late do  you want to arrive ? ");
                        late = scan.nextFloat();
                        if (late >= 8 && late < 12) {
                            while (early>late) {
                                System.out.println("Your early hour is later then your late hour, pls try again");
                                early = scan.nextFloat();
                            }
                            if (early == late) {
                                System.out.println("You can come at day: "+day +"at " + early);
                            }
                            if (early<late ) {
                                System.out.println("You are set to come at day: " + day + " You can come as early at:  " + early + " You can come as late as: " + late);
                            }
                        } else
                            System.out.println("We are closed at that time, and we are open at this day from 8:00-12:00");
                    } else
                        System.out.println("We are closed at that time, and we are open at this day from 8:00-12:00");
                }
            } else System.out.println("The IRS is closed in the weekends.");

        } else System.out.println("The day is incorrect");


    }
}