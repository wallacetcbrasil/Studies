package first_class;

/**
 * Example class for the first class of variable exercise, data types and arithmetic operators.
 */

public class App {
    public static void main(String[] args) {
        
        int i;
        //int i; Variable can't have a same name.
        int I;
        //int 1a; Variable can't start with a number.
        int _1a; // This isn't a good pratice for programming "_".
        int $aq; // same here "$".

        i = 5;
        I = 10;
        _1a = 20;
        $aq = 7;

        final int j = 10;
        //j = 15; The j variable is "final" then can't receive another value.
        int asrn24678ad;
        //int asrn246 78ad; Space between the variable isn't permitted.
        int asrn2$4678_ad = 10; // This isn't a good pratice for programming "_", "$".
        //int asrn2$46%78_ad = 10; same here "_", "$". "%" is an invalid character.
        
        asrn24678ad = 100;
        asrn2$4678_ad = 10;

        int productQuantity = 50;   
        //int ProductQuantity; This isn't a good pratice for programming because a Camel Case
        final int TRY_NUMBER = 5;
        //final int tryNumber = 5;  This isn't a good pratice for programming because a Camel Case
        int QUANTITY_OPTIONS = 25;  // This isn't a good pratice for programming because isn't "final" but is in capital
        //int qtdProd; This isn't a good pratice for programming because don't have expression

        System.out.println(i);
        System.out.println(I);
        System.out.println(_1a);
        System.out.println($aq);

        System.out.println(j);
        System.out.println(asrn24678ad);
        System.out.println(asrn2$4678_ad);

        System.out.println(productQuantity);
        System.out.println(TRY_NUMBER);
        System.out.println(QUANTITY_OPTIONS);

    }
}
