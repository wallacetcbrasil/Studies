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

    if (prog == 1) {
        printf("| + for sum | - for subtraction | * for multiplication | / for division |");
        scanf("%c", &option);

        switch (option) {
            case '+':
                calc = "sum";
                prog = 2;
                break;
            case '-':
                calc = "subtraction";
                prog = 2;
                break;
            
            default:
                printf("This value is invalid ");
                printf("Rule: You write only the first character +");
                prog = 3;
                break;
        }

        if (prog == 2){
            printf("Now choose the first number ");

            switch (option) {
                case '+':
                    /* code */
                    break;
                
                default:
                    break;
            }
        } else if (prog == 3) {
            printf("| + for sum | - for subtraction | * for multiplication | / for division |");
            scanf("%c", &option);


        }
    } else {
        return;
    }

}

int codeblock() {
    
}