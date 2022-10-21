import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

/**
 * 두 개 뽑아서 더하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/68644
 *
 * 문제 설명
 * 정수 배열 numbers가 주어집니다.
 * numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는 모든 수를
 * 배열에 오름차순으로 담아 return 하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
 * numbers의 길이는 2 이상 100 이하입니다.
 * numbers의 모든 수는 0 이상 100 이하입니다.
 *
 * 입출력 예
 *  numbers      result
 * [2,1,3,4,1]	[2,3,4,5,6,7]
 * [5,0,2,7]	[2,5,7,9,12]
 *
 * 푼 날짜 : 221021
 *
 * ※ TreeSet으로 풀면 자동정렬됨 (HashSet은 배열로 바꾼 뒤 Arrays.sort로 정렬 필요)
 */
public class PGS_Lv1_68644 {
    public static int[] solution(int[] numbers) {
        int[] answer = {};
//        Set<Integer> set = new HashSet<>();
        Set<Integer> set = new TreeSet<>();

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = (i + 1); j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }

        answer = new int[set.size()];
        int i = 0;
        for (int a : set) {
            answer[i++] = a;
        }
//        Arrays.sort(answer); // HashSet으로 했을 시 정렬 필요

        return answer;
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 1, 3, 4, 1};
        int[] arr2 = {5, 0, 2, 7};
        System.out.println(Arrays.toString(solution(arr1)));
        System.out.println(Arrays.toString(solution(arr2)));
    }
}
