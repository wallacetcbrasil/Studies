/**
 * Main class of the exercises of the first class of methods.
 */

public class App {
    public static void main(String[] args) throws Exception {
        
        // Calculator
        System.out.println("Calculator Exercise");
        Calculator.funcSum(3, 6);
        Calculator.funcSubtraction(9, 1.8);
        Calculator.funcMultiplication(7, 8);
        Calculator.funcDivision(5, 2.5);

        // Greetings By Hour
        System.out.println("Greetings By Hour Exercise");
        Greetings.obtainGreetings(5);
        Greetings.obtainGreetings(14);
        Greetings.obtainGreetings(18);
        Greetings.obtainGreetings(25);

        // Loan calculator
        System.out.println("Loan Calculator Exercise");
        Loan.calculate(100, Loan.getTwoParcels());
        Loan.calculate(1000, Loan.getThreeParcels());
        Loan.calculate(1000, 5);
    }
}
