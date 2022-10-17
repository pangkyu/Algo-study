/**
 * Lv1_12928 약수의 합
 * https://school.programmers.co.kr/learn/courses/30/lessons/12928
 *
 * 문제 설명
 * 정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.
 *
 * 제한 사항
 * n은 0 이상 3000 이하 정수
 *
 * 푼 날짜 : 221017
 */
public class PGS_Lv1_12928 {
    public static int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer += i;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(12));
        System.out.println(solution(5));
    }
}
