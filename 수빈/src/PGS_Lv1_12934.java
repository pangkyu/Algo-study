/**
 * 정수 제곱근 판별
 * https://school.programmers.co.kr/learn/courses/30/lessons/12934
 *
 * 문제 설명
 * 임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
 * n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.
 *
 * 제한 사항
 * n은 1이상, 50000000000000 이하인 양의 정수입니다.
 *
 * 입출력 예
 * n	return
 * 121	144
 * 3	-1
 *
 * 푼 날짜 : 221021
 *
 * ※ 제곱근 구하기 Math.sqrt(n)
 * ※ 제곱 구하기 Math.sqrt(n, 2)
 * ※ 원래 for문으로 1부터 n의 제곱근까지 돌면서 i가 n의 제곱근이면 i + 1을 제곱하는 걸로 짰는데 그럴 필요가 없었음
 *   그냥 바로 n을 제곱근이 있는지 확인하고 (그 제곱근 + 1)의 제곱 구하면 됐는데...
 */
public class PGS_Lv1_12934 {
    public static long solution(long n) {
        if (Math.pow((int) Math.sqrt(n), 2) == n) {
            return (long) Math.pow(Math.sqrt(n) + 1, 2);
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(solution(121));
        System.out.println(solution(3));
    }
}
