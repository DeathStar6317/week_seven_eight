import java.util.Scanner;

public class NaturalSumCompare {

    // Recursive method
    public static int recursiveSum(int n) {
        if (n == 1)
            return 1;
        return n + recursiveSum(n - 1);
    }

    // Formula method
    public static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input");
        } else {
            int rec = recursiveSum(n);
            int formula = formulaSum(n);

            System.out.println("Recursive Sum = " + rec);
            System.out.println("Formula Sum = " + formula);

            if (rec == formula)
                System.out.println("Both results are correct and equal.");
            else
                System.out.println("Mismatch in results.");
        }

        sc.close();
    }
}