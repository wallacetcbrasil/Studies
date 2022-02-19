import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        int installments;
        double fixedtax = 0.15;
        double val, tax, totalValue;
        Scanner read = new Scanner(System.in);
        

        System.out.println("Welcome to ours loan simulator system!");
        System.out.print("First of all, report loan amount: ");
        val = read.nextDouble();
        System.out.print("And now how many installments: ");
        installments = read.nextInt();
        tax = installments * fixedtax; 
        totalValue = val + (val * tax);
        System.out.println("The total value with tax is: " + totalValue);

    }
}
