import java.util.*;

public class Hourglass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read 6x6 array
        int[][] arr = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        scanner.close();

        // Find max hourglass sum
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                // Calculate hourglass sum
                int sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2]
                        + arr[i + 1][j + 1]
                        + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];

                // Update max
                maxSum = Math.max(maxSum, sum);
            }
        }

        // Print result
        System.out.println(maxSum);
    }
}