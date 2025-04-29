import java.util.Scanner;
// This program calculates the factorial of a number using recursion

class Factorial {
    public static int factorial(int num) {
        if(num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return -1; // Return -1 to indicate an error
        }
        if(num == 0 || num == 1) {
            return 1;
        } 
        else {
            return num * factorial(num - 1); 
        }
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a number to calculate its factorial: ");
        int num = inp.nextInt();
        int result = factorial(num);
        if(result != -1) {
            System.out.printf("The factorial of %d is %d\n", num, result);
        }
        inp.close();
    }
}