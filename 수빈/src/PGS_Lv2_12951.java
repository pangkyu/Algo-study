/**
 * JadenCase 문자열 만들기
 * https://school.programmers.co.kr/learn/courses/30/lessons/12951
 *
 * 문제 설명
 * JadenCase란 모든 단어의 첫 문자가 대문자이고, 그 외의 알파벳은 소문자인 문자열입니다.
 * 단, 첫 문자가 알파벳이 아닐 때에는 이어지는 알파벳은 소문자로 쓰면 됩니다. (첫 번째 입출력 예 참고)
 * 문자열 s가 주어졌을 때, s를 JadenCase로 바꾼 문자열을 리턴하는 함수, solution을 완성해주세요.
 *
 * 제한 조건
 * s는 길이 1 이상 200 이하인 문자열입니다.
 * s는 알파벳과 숫자, 공백문자(" ")로 이루어져 있습니다.
 * 숫자는 단어의 첫 문자로만 나옵니다.
 * 숫자로만 이루어진 단어는 없습니다.
 * 공백문자가 연속해서 나올 수 있습니다.
 *
 * 입출력 예
 *  s	                     return
 * "3people unFollowed me"	"3people Unfollowed Me"
 * "for the last week"	    "For The Last Week"
 *
 * 푼 날짜 : 221021
 *
 * ※ 알파벳인지 확인하고 바꿔야 한다고 생각해서 solution1대로 짰는데 다른 사람 코드 보니까 숫자든 공백이든 다 lower,upper 가능해서
 *   아래 solution으로 바꿨는데 solution1보다 실행시간이 더 걸림
 */
public class PGS_Lv2_12951 {
    public static String solution1(String s) {
        String answer = "";
        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (i == 0 && Character.isAlphabetic(arr[i])) {
                arr[i] = Character.toUpperCase(arr[i]);
            } else if (i != 0 && Character.isAlphabetic(arr[i])) {
                if (arr[i - 1] == ' ') arr[i] = Character.toUpperCase(arr[i]);
                else arr[i] = Character.toLowerCase(arr[i]);
            }
        }

        answer = String.valueOf(arr);

        return answer;
    }

    public static String solution(String s) {
        String answer = "";
        String[] arr = s.split("");

        answer += arr[0].toUpperCase();

        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1].equals(" ")) answer += arr[i].toUpperCase();
            else answer += arr[i].toLowerCase();
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("3people unFollowed me"));
        System.out.println(solution("for the last week"));
    }
}
