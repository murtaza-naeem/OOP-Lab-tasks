// Compute the factorial of n.
public class Q1 {
    // Print factorial of n
    public static void main(String[] args) {
        int n = 10;
        int factorial = 1;
        // n! = 1*2*3...*n
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("The Factorial of " + n + " is: " + factorial);
    }
}
