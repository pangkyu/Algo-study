import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * 백준 단지번호붙이기 / 실버1 / 20분
 */

public class BOJ_2667 {
    static int[] dy = {-1, 1, 0, 0}; // y좌표 상하좌우
    static int[] dx = {0, 0, -1, 1}; // x좌표 상하좌우

    static int n;
    static int[][] arr;
    static int[][] visit; // 방문 체크

    static int cnt = 0;
    static ArrayList<Integer> list = new ArrayList<>();

    static int dfs(int y, int x) {
        int house = 0;
        for (int i = 0; i < 4; i++) {
            int ty = y + dy[i];
            int tx = x + dx[i];
            // 범위 벗어나거나 집이 없는 곳이거나 이미 방문한 곳이면 continue
            if (ty < 0 || tx < 0 || ty >= n || tx >= n || arr[ty][tx] == 0 || visit[ty][tx] == 1) continue;
            visit[ty][tx] = 1; // 방문 표시(dfs 돌 때 재방문 안 하게)
            house++; // 집 개수 세기
            house += dfs(ty, tx); // dfs 다녀온 거 더하기
        }
        return house;
    }

    public static void main(String args[]) {
        // 입력
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        arr = new int[n][n];
        visit = new int[n][n];
        for (int i = 0; i < n; i++) {
            String[] tmp = in.next().split("");
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(tmp[j]);
            }
        }
        // 여기까지 입력

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // for 문 돌면서 집이 있는 곳이고 방문한 적 없으면
                if (arr[i][j] == 1 && visit[i][j] == 0) {
                    visit[i][j] = 1; // 방문 표시(재방문 안 하게)
                    cnt++;
                    list.add(dfs(i, j) + 1); // 단지수 리스트에 추가
                }
            }
        }

        // 출력
        System.out.println(cnt);
        Collections.sort(list); // list 정렬
        for (int i : list) {
            System.out.println(i);
        }
    }
}
