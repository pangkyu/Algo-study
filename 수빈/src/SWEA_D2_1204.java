import java.util.Scanner;

/**
 * 1204. [S/W 문제해결 기본] 1일차 - 최빈수 구하기
 * https://swexpertacademy.com/main/code/problem/problemDetail.do?problemLevel=2&contestProbId=AV13zo1KAAACFAYh&categoryId=AV13zo1KAAACFAYh&categoryType=CODE&problemTitle=&orderBy=PASS_RATE&selectCodeLang=JAVA&select-1=2&pageSize=30&pageIndex=1
 *
 * 어느 고등학교에서 실시한 1000명의 수학 성적을 토대로 통계 자료를 만들려고 한다.
 * 이때, 이 학교에서는 최빈수를 이용하여 학생들의 평균 수준을 짐작하는데, 여기서 최빈수는 특정 자료에서 가장 여러 번 나타나는 값을 의미한다.
 * 다음과 같은 수 분포가 있으면,
 * 10, 8, 7, 2, 2, 4, 8, 8, 8, 9, 5, 5, 3
 * 최빈수는 8이 된다.
 * 최빈수를 출력하는 프로그램을 작성하여라 (단, 최빈수가 여러 개 일 때에는 가장 큰 점수를 출력하라).
 *
 * [제약 사항]
 * 학생의 수는 1000명이며, 각 학생의 점수는 0점 이상 100점 이하의 값이다.
 *
 * [입력]
 * 첫 번째 줄에 테스트 케이스의 수 T가 주어진다.
 * 각 테스트 케이스의 첫 줄에는 테스트 케이스의 번호가 주어지고 그 다음 줄부터는 점수가 주어진다.
 *
 * [출력]
 * #부호와 함께 테스트 케이스의 번호를 출력하고, 공백 문자 후 테스트 케이스에 대한 답을 출력한다.
 *
 * 푼 날짜 : 221101
 */
public class SWEA_D2_1204 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();

        for (int i = 1; i <= T; i++) {
            int num = in.nextInt();

            int[] arr = new int[101];
            int max = Integer.MIN_VALUE;

            for (int j = 0; j < 1000; j++) {
                int score = in.nextInt();
                arr[score]++;
                if (arr[score] > max) max = arr[score];
            }

            int mode = Integer.MIN_VALUE;

            for (int score = 0; score < arr.length; score++) {
                if (arr[score] == max) mode = Math.max(mode, score);
            }

            System.out.println("#" + num + " " + mode);
        }
    }
}
