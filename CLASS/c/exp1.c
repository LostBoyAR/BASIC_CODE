// write a simple factorial programe.

#include <stdio.h>
int factorial(int n) {
    if (n < 0) {
        return -1; // Error for negative numbers
    }
    if (n == 0 || n == 1) {
        return 1; // Base case
    }
    return n * factorial(n - 1); // Recursive case
}
int main() {
    int number;
    printf("Enter a positive integer: ");
    scanf("%d", &number);
    
    int result = factorial(number);
    if (result == -1) {
        printf("Error: Factorial of a negative number doesn't exist.\n");
    } else {
        printf("Factorial of %d is %d\n", number, result);
    }
    
    return 0;
}
