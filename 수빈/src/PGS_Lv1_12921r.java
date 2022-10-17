/**
 * Lv1_12921 소수 찾기
 * https://school.programmers.co.kr/learn/courses/30/lessons/12921
 *
 * 문제 설명
 * 1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환하는 함수, solution을 만들어 보세요.
 * 소수는 1과 자기 자신으로만 나누어지는 수를 의미합니다.
 * (1은 소수가 아닙니다.)
 *
 * 제한 조건
 * n은 2이상 1000000이하의 자연수입니다.
 *
 * 푼 날짜 : 221017
 *
 * ※ 에라토스테네스의 체 이용해서 풀어야 함 (모든 숫자 일일이 검사하는 코드는 시간초과 뜸)
 */
public class PGS_Lv1_12921r {
    public static int solution(int n) {
        int answer = 0;

        // n까지 넣을 배열 생성
        int[] arr = new int[n + 1];

        // 2부터 n까지 해당 숫자 배열에 넣기 (0과 1은 소수가 아니기 때문에 넣을 필요없이 그대로 0)
        for (int i = 2; i < arr.length; i++) {
            arr[i] = i;
        }

        // 2부터 n까지 소수면 그대로 두고, 소수가 아니면 배열 0 처리
        for (int i = 2; i <= n; i++) {
            // 0 또는 1 또는 소수의 배수이면 넘어감
            if (arr[i] == 0) continue;

            // 소수의 배수는 배열에서 0 처리
            for (int j = i * 2; j <= n; j += i) { // i*2는 해당 숫자를 0 처리하면 안 되기 때문. i+1은 만약 i가 2일 때 (i+1)은 3으로 소수인데 0 처리 되니까 안 됨. 가장 작은 2를 곱해서 그 숫자부터 0 처리
                arr[j] = 0;
            }
        }

        // 배열에서 소수 개수 세기
        for (int i : arr) {
            if (i != 0) answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(10));
        System.out.println(solution(5));
    }
}
