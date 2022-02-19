import java.util.Scanner;

public class App {
    public static void main(){
        
        int installments;
        double tax = 1.35;
        double val, monthValue, totalValue;
        Scanner read = new Scanner(System.in);
        

        System.out.println("Welcome to ours loan simulator system!");
        System.out.print("First of all, report loan amount: ");
        val = read.nextDouble();
        System.out.println("And now how many installments: ");
        installments = read.nextInt();
        monthValue = (val / installments) * tax ;
        totalValue = monthValue * installments;
        System.out.println("The value with tax per month is: " + monthValue);
        System.out.println("The total value with tax is: " + totalValue);

    }
}
