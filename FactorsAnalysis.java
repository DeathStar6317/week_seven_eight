import java.util.Scanner;

public class FactorsAnalysis {

    // Method to get factors array
    public static int[] getFactors(int num) {
        int count = 0;

        // First loop → count factors
        for (int i = 1; i <= num; i++) {
            if (num % i == 0)
                count++;
        }

        int[] factors = new int[count];
        int index = 0;

        // Second loop → store factors
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    // Sum of factors
    public static int sum(int[] arr) {
        int s = 0;
        for (int x : arr)
            s += x;
        return s;
    }

    // Product of factors
    public static int product(int[] arr) {
        int p = 1;
        for (int x : arr)
            p *= x;
        return p;
    }

    // Sum of squares
    public static double sumOfSquares(int[] arr) {
        double s = 0;
        for (int x : arr)
            s += Math.pow(x, 2);
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int[] factors = getFactors(num);

        System.out.print("Factors: ");
        for (int f : factors)
            System.out.print(f + " ");

        System.out.println("\nSum = " + sum(factors));
        System.out.println("Product = " + product(factors));
        System.out.println("Sum of Squares = " + sumOfSquares(factors));

        sc.close();
    }
}