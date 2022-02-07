#include <stdio.h>

int main() {

    // THIS COMMAND PRINT THE CONTENT ON SCREEN
    // "\n" is type 'ENTER'
        printf("Hello World \n");

    // VARIABLES
    // DIFFERENTS TYPES FOR DIFFERENTS SITUATIONS AND CASES OF USE

        short valTiny = 2;      // 2 bytes var inteiro - %d - (Example of utility: "Weaker" setups )
        int valInteger = 1;     // 4 bytes var inteiro - %d - (Example of utility: Normal)
        long valLong = 8;       // 8 bytes var inteiro - %d - (Example of utility: psy gangstyle youtube video case)

        float valSmaller = 4.0; // 4 bytes var decimal place - %f -
        double value = 8.0;     // 8 bytes var decimal place - %.1f <- 1 you can change the amount of the exchange of decimal places

    
    // scope and where the variable exists
        if(variavel)


    // Loop system - or code repetition
    // where var i starts at 1 ; THIS IS THE COUNTER 
    // The condition is for the var i to be less than or equal to 3 ; THIS IS THE CONDITION
    // as for when this int grows = 1 in 1 so and i++
        for(int i = 1; int <= 3; i++) {"What will be in the loop"}

    // System as an example: as long as variable is not equal to 26 continue
        while


    // pass the type of the variable before the value and CASTING
        int a = 3;
        int b = 2;
        double points = a / (double)b;
        printf("%f", points);

    // Math trick to invert negative values ​​vs abs
        double LostPoints = (double)(guess - secretNumber) / (double)2 ;
            if(LostPoints < 0) {
                LostPoints = LostPoints * -1;
            }

    // abs or absolute IMPORTANT -> MUST PUT #include <stdlib.h> <-
        int absA = 3;
        int absB = -3;

        int absC = abs(absA * absB);

    // different number function: rand and srand
        rand(); // turns out to be the same number

    // IMPORTANT NOTE: USE -> #include <time.h>
        int seconds = time(0); // returns the number of seconds elapsed since January 1, 1970
        srand(seconds);        // accepts a value to generate rng based on seconds

    // Switch command that will save my life to end things
        int level; 
        int lifes;

    printf("What's the level of difficult?\n");
    printf("(1) easy (2) medium (3) hard \n\n");
    printf("Choose: ");
    scanf("%d", &level);

    switch(level) {
        case 1: 
            lifes = 20;
            break;

        case 2: 
            lifes = 15; 
            break;

        case 3: 
            lifes = 6; 
            break;
            
        default: 
            lifes = 1;
            break;
    }

}