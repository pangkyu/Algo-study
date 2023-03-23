import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BOJ_16173 {
    /**
     * bfs 풀이
     */
    static int[] dx = {0, 1}; // 오른쪽 이동, 아래 이동
    static int[] dy = {1, 0};
    static int n;
    static int[][] arr;
    static boolean[][] visited;

    static void bfs() {
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[] {0, 0});
        visited[0][0] = true;

        while (!q.isEmpty()) {
            int[] current = q.poll();
            int now = arr[current[0]][current[1]];

            if (now == -1) {
                System.out.println("HaruHaru");
                return;
            }

            for (int i = 0; i < 2; i++) {
                int tx = current[0] + dx[i] * now;
                int ty = current[1] + dy[i] * now;

                // 범위 벗어나거나 이미 방문했으면 pass
                if (tx < 0 || ty < 0 || tx >= n || ty >= n || visited[tx][ty]) continue;

                visited[tx][ty] = true;
                q.offer(new int[] {tx, ty});
            }
        }

        System.out.println("Hing");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        visited = new boolean[n][n];
        bfs();
    }
}
