import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 백준 나무 자르기 / 실버2 / 60분
 *
 * 시간초과 10번은 난 듯..
 */

public class BOJ_2805 {

    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        int min = 0;
        int max = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if (arr[i] > max) max = arr[i]; // max 값 구하기
        }
        // 여기까지 입력

        while (min < max) {
            int mid = (min + max) / 2; // 중간값 구하기
            long sum = 0;
            for (int a : arr) {
                // 자르려는 길이보다 길면 자르고 남은 길이 만큼 sum 에 더하기
                if (a > mid) {
                    sum += a - mid;
                }
            }

            // 그 더한 길이가 m 보다 작으면
            if (sum < m) {
                max = mid; // 범위 min~mid 로 변경
            } else { // 반대라면
                min = mid + 1; // 범위 mid~max 로 변경
            }
        }

        System.out.println(min - 1); // 설정할 수 있는 높이 최댓값 나오면 -1
    }
}
