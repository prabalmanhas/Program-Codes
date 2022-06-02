/** Prabal Manhas | 20BCS4513 | PBLJ WS 1.3*/
package interestcalculator;

import java.util.Scanner;

public class InterestCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("<---------- PRABAL MANHAS 20BCS4513 WS 1.3 ----------->");
        System.out.println("<--- ENTER YOUR CHOICE ---> " + "\n1." + " SB - INTEREST CALCULATOR" + " \n2." + " FD - INTEREST CALCULATOR"
                + "\n3." + " RD - INTEREST CALCULATOR" + "\n4." + " EXIT PROGRAM...");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                SBaccount sb = new SBaccount();
                try {
                    System.out.println("ENTER AVERAGE SB AMOUNT: ");
                    double amount = sc.nextDouble();
                    System.out.println("INTEREST GAINED IS: $ " + sb.calculateInterest(amount));

                } catch (InvalidAmountException e) {
                    System.out.println("SORRY INVALID AMOUNT, CHECK YOUR INPUT");
                }
                break;

            case 2:
                try {
                    FDaccount fd = new FDaccount();
                    System.out.println("ENTER THE FD AMOUNT");
                    double fAmount = sc.nextDouble();
                    System.out.println("INTEREST GAINED IS: $ " + fd.calculateInterest(fAmount));
                } catch (InvalidAgeException e) {
                    System.out.println("SORRY YOU ENTERED INVALID AGE!");
                } catch (InvalidAmountException e) {
                    System.out.println("SORRY INVALID AMOUNT ENTERED!");

                } catch (InvalidDaysException e) {
                    System.out.println("INVALID DAYS ENTERED");

                }

                break;
            case 3:
                try {
                    RDaccount rd = new RDaccount();
                    System.out.println("ENTER RD AMOUNT:");
                    double Ramount = sc.nextDouble();
                    System.out.println("INTEREST GAINED IS: $ " + rd.calculateInterest(Ramount));
                } catch (InvalidAgeException e) {
                    System.out.println("SORRY YOU ENTERED INVALID AGE!");
                } catch (InvalidAmountException e) {
                    System.out.println("SORRY INVALID AMOUNT ENTERED!");

                } catch (InvalidMonthsException e) {
                    System.out.println("INVALID DAYS ENTERED");
                }

                break;

            case 4:
                System.out.println("DO WANT TO DO CALCULATION AGAIN?" + " "
                        + "RUN THE PROGRAM AGAIN");
            default:
                System.out.println("INVALID CHOICE!");

        }
    }

}
