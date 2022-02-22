#include <stdio.h>

int main() {

    // Variables
    int prog = 1;
    int num1;
    int num2;
    int result;
    char calc;
    char option;
    
        printf("| Welcome to my basic calculator!! |");
        printf("| First of all, choose your operation type |");
        printf("| + for sum | - for subtraction | * for multiplication | / for division |");
        scanf("%c", &option);
        if (option == '+' || option == '-' || option == '*' || option == '/' || prog == 2) {

            switch (option) {
                case '+':
                    calc = "sum";
                    break;
                case '-':
                    calc = "subtraction";
                    break;
                
                default:
                    return;
            }

            printf("Now choose the first number for the %c function: ", calc);
            scan("%i", &num1);
            Printf("Now choose the second number: ");
            scan("%i", &num2);

            switch (option) {
                case '+':
                    result = num1 + num2;
                    break;
                
                default:
                    break;
            }

            

        } else {
            codeblock();
        }
}

int codeblock() {
    char option;
    int prog;

    printf("| Choose your operation type |");
    printf("| + for sum | - for subtraction | * for multiplication | / for division |");
    scanf("%c", &option);
    prog == 2;

    return;
}