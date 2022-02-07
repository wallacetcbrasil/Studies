#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main() {

    // RNG Function
        int seconds = time(0);
        srand(seconds);
        int bigNumber = rand();

    // Game System Rules
        int guess;
        int rightAnswer;
        int numberTry = 1;
        int secretNumber = bigNumber % 100;
        double Score = 1000;

    // print the start of the game
        printf("+=================================================+\n");  
        printf("|           Welcome to the guessing game          |\n");
        printf("+=================================================+\n"); 
        printf("|               Choose the difficult              |\n");
        printf("|               1 - Easy (12 guess)               |\n");
        printf("|               2 - Medium (8 guess)              |\n");
        printf("|               3 - Hard (4 guess)                |\n");
        printf("+-------------------------------------------------+\n"); 
    
    // Difficult System
        int lifes;
        int level;

        printf("|                  ");
        scanf ("%d", &level);   
        printf("+-------------------------------------------------+\n"); 

        switch(level) {
            case 1: 
                printf("|                 You choose Easy                 |\n");
                lifes = 12;
                break;

            case 2: 
                printf("|                You choose Medium                |\n");
                lifes = 8;
                break;

            case 3: 
                printf("|                 You choose Hard                 |\n");  
                lifes = 4;
                break;
                
            default: 
                printf("|        INVALID VALUE, CHOOSE ANOTER VALUE       |\n"); 
                break;
        }


    // The game - You lost k

        for(int i = 1; i <= lifes; i++) {

            printf("+=================================================+\n"); 
            printf("| Try %d                  | of %d Trys             \n", numberTry, lifes);
            printf("+-------------------------------------------------+\n"); 
            printf("|               What's is your guess?             |\n");
            printf("+=================================================+\n"); 
            printf("|                         ");
            scanf("%d", &guess); 
            printf("+-------------------------------------------------+\n"); 
            printf("|                 Your guess was %d               |\n", guess);
            printf("+-------------------------------------------------+\n");   

            if(guess <= 0) {
                printf("+=================================================+\n");  
                printf("|        You can't guess negative numbers!        |\n");
                printf("+=================================================+\n");    
                continue;
            }
            
            int rightAnswer = (guess == secretNumber);
            int bigger = guess > secretNumber;

            if (rightAnswer) {
                break;
            } else if(bigger) {
                printf("|  Your guess was bigger than the secret number!  |\n");
            } else {
                printf("|   You guess was less than the secret number!    |\n");
            }

            numberTry++;

            double LostPoints = abs(guess - secretNumber) / (double)2 ;
            Score = Score - LostPoints;
        }

        printf("+=================================================+\n");
        printf("|                  End of game!!                  |\n");
        printf("+=================================================+\n");

        if(rightAnswer) {
            printf("|                     YOU WIN!                    |\n");
            printf("|                Final Score: %.1f                \n", Score); 
            printf("|           You won the game in %d try's          \n", numberTry);
            printf("+-------------------------------------------------+\n"); 
        } else {
            printf("|               YOU LOSE! TRY AGAIN               |\n");
            printf("+-------------------------------------------------+\n"); 
        }

}