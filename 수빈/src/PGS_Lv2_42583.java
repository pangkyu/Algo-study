import java.util.LinkedList;
import java.util.Queue;

/**
 * 다리를 지나는 트럭 60분 (다른 사람 풀이 참고)
 *
 * ======
 * 처음에 코드 다 맞게 짰는데(큐 전체 출력했을 때 맞았음)
 * 6
 * 1
 * 10
 * 이렇게 모자르게 나오는 거임..
 * 이유는 마지막에 return 할 때 다리 길이 더해주지 않아서...
 * 삽질 엄청나게 했는데.. 내가 바보 같았음....
 */

public class PGS_Lv2_42583 {
    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0; // 걸리는 시간(초)
        Queue<Integer> q = new LinkedList<>();
        int w = 0; // 현재 무게

        for (int i = 0; i < truck_weights.length;) {
            if (q.size() == bridge_length) { // 제한트럭수가 곧 넘을 경우
                w -= q.poll(); // 큐에서 하나 제거
            } else if (w + truck_weights[i] > weight) { // 제한무게를 넘을 경우
                answer++; // 걸리는 시간 추가
                q.offer(0); // 큐에 0 추가(큐를 채워서 앞으로 밀어야 함)
            } else { // 트럭이 다리에 오를 수 있음
                answer++; // 걸리는 시간 추가
                w += truck_weights[i]; // 현재 무게에 현재 트럭의 무게 더하기
                q.offer(truck_weights[i++]); // 현재 트럭의 무게를 큐에 넣으면서 i++
            }
        }

        return answer + bridge_length; // 마지막 트럭은 큐에 들어가자마자 끝나므로 다리 길이 추가
    }

    public static void main(String[] args) {
        System.out.println(solution(2, 10, new int[]{7, 4, 5, 6}));
        System.out.println(solution(100, 100, new int[]{10}));
        System.out.println(solution(100, 100, new int[]{10,10,10,10,10,10,10,10,10,10}));
    }
}
