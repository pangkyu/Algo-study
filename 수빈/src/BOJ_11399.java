import java.util.Arrays;
import java.util.Scanner;

/**
 * 백준 ATM / 실버4 / 10분
 */

public class BOJ_11399 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // 사이즈 입력
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt(); // 걸리는 시간 입력
        }
        Arrays.sort(arr); // 배열 오름차순 정렬

        int sum = 0;
        int result = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i]; // 각 사람이 기다리는 시간
            result += sum; // 누적합
        }
        System.out.println(result);
    }
}
