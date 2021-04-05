package DataStructure;

import java.util.Scanner;

public class Java_2d_Array {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arriItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arriItems[j]);
                arr[i][j] = arrItem;
            }
        }

        scanner.close();

        System.out.println(maxHourglass(arr));
    }
    public static int maxHourglass(int [][] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int sum = findSum(arr, i, j);
                max = Math.max(max, sum);
            }
        }
        return max;
    }
    
    private static int findSum(int [][] arr, int i, int j) {
        int sum = arr[i+0][j+0] + arr[i+0][j+1] + arr[i+0][j+2] 
                                + arr[i+1][j+1] + 
                  arr[i+2][j+0] + arr[i+2][j+1] + arr[i+2][j+2];
        return sum;
    }
    
}
