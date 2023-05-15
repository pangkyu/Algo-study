import java.util.ArrayList;
import java.util.List;

/**
 * 프로그래머스 모의고사 / Lv1 / 20분
 *
 * 어이가 없네.. 점수 계산하는 for 문이 for (int i = 0; i < answers.length; i++) {}여야 하는데
 * for (int i = 0; i < 3; i++) {} < 3 실화냐...
 * 이거 모르고 쓸데없는 거 고치다가 시간 다 보냄
 */

public class PGS_Lv1_42840 {

    public static int[] solution(int[] answers) {
        int[] score = new int[3]; // 3명의 점수 담을 배열
        int[] person1 = {1, 2, 3, 4, 5};
        int[] person2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] person3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        // 점수 계산
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == person1[i % person1.length]) score[0]++;
            if (answers[i] == person2[i % person2.length]) score[1]++;
            if (answers[i] == person3[i % person3.length]) score[2]++;
        }

        // 점수 최댓값 구하기
        int max = Math.max(score[0], Math.max(score[1], score[2]));

        // 점수 최대인 사람 리스트에 추가
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            if (score[i] == max) list.add(i + 1);
        }

        // 리스트 -> 배열
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
