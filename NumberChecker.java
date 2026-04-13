public class NumberChecker {

    // Count digits
    public static int countDigits(int num) {
        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        return count;
    }

    // Store digits
    public static int[] getDigits(int num) {
        int count = countDigits(num);
        int[] digits = new int[count];

        int index = 0;
        while (num != 0) {
            digits[index++] = num % 10;
            num /= 10;
        }
        return digits;
    }

    // Duck number (contains zero)
    public static boolean isDuck(int[] digits) {
        for (int d : digits)
            if (d == 0)
                return true;
        return false;
    }

    // Armstrong number
    public static boolean isArmstrong(int num, int[] digits) {
        int power = digits.length;
        int sum = 0;

        for (int d : digits)
            sum += Math.pow(d, power);

        return sum == num;
    }

    // Largest & second largest
    public static void largest(int[] arr) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;

        for (int x : arr) {
            if (x > max1) {
                max2 = max1;
                max1 = x;
            } else if (x > max2 && x != max1) {
                max2 = x;
            }
        }

        System.out.println("Largest = " + max1);
        System.out.println("Second Largest = " + max2);
    }

    // Smallest & second smallest
    public static void smallest(int[] arr) {
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;

        for (int x : arr) {
            if (x < min1) {
                min2 = min1;
                min1 = x;
            } else if (x < min2 && x != min1) {
                min2 = x;
            }
        }

        System.out.println("Smallest = " + min1);
        System.out.println("Second Smallest = " + min2);
    }
}