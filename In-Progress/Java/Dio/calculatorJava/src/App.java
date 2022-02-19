import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        int operation, n1, n2, resultOfCount;

        Scanner read = new Scanner(System.in);

        System.out.println("Select operation for start!");
        System.out.println("1 - Sum | 2 - Subtraction | 3 - Multiplication | 4 - Division");
        operation = read.nextInt();

        /**
         * i want to made a block with the same text 
         * of val 1 and val 2 but i don't know how OwO
        */

        switch(operation){

            case 1:
                System.out.println("Write the first value: ");
                n1 = read.nextInt();
                System.out.println("Write the second value: ");
                n2 = read.nextInt();
                resultOfCount = n1 + n2;
                System.out.println("The result of sum is: " + resultOfCount);
                break;
    
            case 2:
                System.out.println("Write the first value: ");
                n1 = read.nextInt();
                System.out.println("Write the second value: ");
                n2 = read.nextInt();
                resultOfCount = n1 - n2;
                System.out.println("The result of Subtraction is: " + resultOfCount);
                break;

            case 3:
                System.out.println("Write the first value: ");
                n1 = read.nextInt();
                System.out.println("Write the second value: ");
                n2 = read.nextInt();
                resultOfCount = n1 * n2;
                System.out.println("The result of Multiplication is: " + resultOfCount);
                break;

            case 4:
                System.out.println("Write the first value: ");
                n1 = read.nextInt();
                System.out.println("Write the second value: ");
                n2 = read.nextInt();
                resultOfCount = n1 / n2;
                System.out.println("The result of Division is: " + resultOfCount);
                break;
                
            default:
                System.out.println("Error!");
                System.out.println("Use 1, 2, 3 or 4 !");
                break;
        }

    }
}
