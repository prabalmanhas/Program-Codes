/** Prabal Manhas | 20BCS4513 | PBLJ WS 1.3*/
package interestcalculator;

public abstract class Account {
    double interestRate;
    double amount; 
    abstract double calculateInterest(double amount)throws InvalidMonthsException,InvalidAgeException,InvalidAmountException ,InvalidDaysException;
}
