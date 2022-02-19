/**
 * Example class of the exercise of the first class of methods.
 */

 public class Loan {

    public static int getTwoParcels() {
        return 2;
    }

    public static int getThreeParcels() {
        return 3;
    }

    public static double getTaxTwoParcels() {
        return 0.15;
    }

    public static double getTaxThreeParcels() {
        return 0.45;
    }

    public static void calculate(double value, int parcels ) {
        
        if (parcels == 2) {
            
            double finalValue = value + (value * getTaxTwoParcels());
            
            System.out.println("Final value of Loan in 2 parcels: R$ " + finalValue);
        } else if (parcels == 3) {

            double finalValue = value + (value * getTaxThreeParcels());

            System.out.println("Final value of Loan in 3 parcels: R$ " + finalValue);
        } else {
            System.out.println("This quantity of Parcels isn't acceptable! Try again");
        }
    
    }
}
