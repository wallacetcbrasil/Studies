/**
 * Example class of the exercise of the first class of methods.
 */

public class Greetings {
    
    public static void obtainGreetings(int hour) {

        switch (hour) {
            case 4:
            case 5: 
            case 6: 
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                GreetingsGoodMorning();
                break;
            case 13: 
            case 14:
            case 15:
            case 16:
            case 17:
                GreetingsGoodAfternoon();
                break;
            case 18: 
            case 19: 
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 0:
            case 1:
            case 2:
            case 3:
                GreetingsGoodNight();
                break;
            default:
                System.out.println("Invalid Hour!!!");
                break;
        }
    }

    public static void GreetingsGoodMorning() {
        System.out.println("Good Morning !");
    }
    
    public static void GreetingsGoodAfternoon() {
        System.out.println("Good Afternoon !");
    }

    public static void GreetingsGoodNight() {
        System.out.println("Good Night !");
    }

}
