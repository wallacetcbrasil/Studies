// Make a program that prints the sum of all numbers from 1 to 100, the program will calculate the result of 1+2+3+4+...+100.

#include <stdio.h>

int main() {

    int count = 1;
    int result = 1;

    while(1) {

        if (count <- 100) {
            printf("This is the print count and he is in %d of 100 \n", count);
            printf("Result of sun: %d \n\n", result);

            count++;
            result = count + result;
            
        } else {
            break;
        }
    }
}

/* OBSERVATION
I WILL SHOW THE TWO CODES BUT I WILL CONTINUE WITH MY CODE BECAUSE IS MORE EASIER TO VISUALIZE WHAT HE DOES
THE FIRST PART IS MY CODE AND THIS IS THE TEACHER CODE: 
#include <stdio.h>
int main() {
  int soma = 0;
  for(int i = 1; i <= 100; i++) {
    soma = soma + i;
  }
  printf("A soma eh %d", soma);
}
*/