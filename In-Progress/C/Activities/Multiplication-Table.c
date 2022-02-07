// Make a program that take a number and does the multiplication table up to the number 10 (obs i add the function of recive the number max of table).

#include <stdio.h>

int main () {

    int userNumber;
    printf("Write the base number for multiplication")
    scanf("%d \n", &userNumber);

    // I DON'T KNOW WHY HE SCAN THE SECOND NUMBER BEFORE THE PRINT IT'S DON'T MAKE SENSE

    printf("Now write how many times you want to multiplicate this number: ");
    int multNumber;
    scanf("%d \n", &multNumber);

    for(int i = 0; i <= multNumber; i++) {
        int value =userNumber * i;
        printf("The result of %d X %d is %d \n", value, userNumber, i);
    };

}
