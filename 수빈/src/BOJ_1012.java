import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point {
    public int x, y;

    Point(int y, int x) {
        this.y = y;
        this.x = x;
    }
}

public class BOJ_1012 {
    static int w; // 가로 길이
    static int h; // 세로 길이
    static int[][] board; // 배추밭

    static int[] dy = {-1, 1, 0, 0}; // y좌표 상하좌우 이동 인덱스
    static int[] dx = {0, 0, -1, 1}; // x좌표 상하좌우 이동 인덱스

    static void bfs(int y, int x) {
        Queue<Point> q = new LinkedList<>();
        q.offer(new Point(y, x));

        while (!q.isEmpty()) {
            Point curr = q.poll(); // 큐에서 하나 꺼내기
            for (int i = 0; i < 4; i++) {
                int ty = curr.y + dy[i]; // 다음 y좌표
                int tx = curr.x + dx[i]; // 다음 x좌표
                if (ty < 0 || tx < 0 || ty >= h || tx >= w || board[ty][tx] == 0) continue; // 범위 밖이거나 배추 안 심었으면 pass
                board[ty][tx] = 0;
                q.offer(new Point(ty, tx));
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt(); // 테스트 케이스 개수 입력
        for (int i = 0; i < t; i++) {
            w = in.nextInt(); // 가로 길이 입력
            h = in.nextInt(); // 세로 길이 입력
            int n = in.nextInt(); // 배추가 심어져 있는 위치의 개수 입력
            board = new int[h][w]; // 배추밭 사이즈 초기화

            // 배추 심은 위치 입력
            for (int j = 0; j < n; j++) {
                int a = in.nextInt();
                int b = in.nextInt();
                board[b][a] = 1; // 배추의 위치에 1 넣기
            }

            int cnt = 0; // 배추흰지렁이 마리 수

            // bfs
            for (int j = 0; j < h; j++) {
                for (int k = 0; k < w; k++) {
                    if (board[j][k] == 1) {
                        cnt++; // 마리수 세기
                        board[j][k] = 0; // bfs 돌 때 더 세지 않게 0으로 바꿔주기
                        bfs(j, k);
                    }
                }
            }

            System.out.println(cnt); // 배추흰지렁이 마리 수 출력
        }
    }
}
