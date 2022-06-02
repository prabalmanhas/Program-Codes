/** Prabal Manhas | 20BCS4513 | PBLJ WS 1.3*/
package interestcalculator;

import java.util.Scanner;

class SBaccount extends Account {
    double SBamount , SbInterestRate, interest;
    Scanner SBScanner = new Scanner(System.in);
    
    @Override
    double calculateInterest(double amount) throws InvalidAmountException{
        this.SBamount = amount;
        if(SBamount < 0 ){
            throw new InvalidAmountException();
        }
        System.out.println("<--- SELECT TYPE OF ACCOUNT ---> \n1. NRI \n2. NORMAL ");
        int accountChoice = SBScanner.nextInt();
        switch (accountChoice) {
            case 1:
                SbInterestRate = .06;
                break;
            case 2:
                SbInterestRate = .04;
                break;
            default:
                System.out.println("SORRY PLEASE CHECK YOUR INPUT");
                
        }
     return amount * SbInterestRate;
   
}
}
