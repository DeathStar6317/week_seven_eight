import java.util.Random;

public class TeamHeights {

    // Sum
    public static int sum(int[] arr) {
        int s = 0;
        for (int x : arr)
            s += x;
        return s;
    }

    // Mean
    public static double mean(int[] arr) {
        return (double) sum(arr) / arr.length;
    }

    // Shortest
    public static int min(int[] arr) {
        int m = arr[0];
        for (int x : arr)
            if (x < m) m = x;
        return m;
    }

    // Tallest
    public static int max(int[] arr) {
        int m = arr[0];
        for (int x : arr)
            if (x > m) m = x;
        return m;
    }

    public static void main(String[] args) {
        int[] heights = new int[11];
        Random rand = new Random();

        // Generate random heights (150–250)
        for (int i = 0; i < heights.length; i++) {
            heights[i] = rand.nextInt(101) + 150;
        }

        System.out.print("Heights: ");
        for (int h : heights)
            System.out.print(h + " ");

        System.out.println("\nMean Height = " + mean(heights));
        System.out.println("Shortest Height = " + min(heights));
        System.out.println("Tallest Height = " + max(heights));
    }
}