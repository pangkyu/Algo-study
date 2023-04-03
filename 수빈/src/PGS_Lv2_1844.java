import java.util.LinkedList;
import java.util.Queue;

class Point {
    public int x, y;

    Point(int y, int x) {
        this.y = y;
        this.x = x;
    }
}

public class PGS_Lv2_1844 {
    static int n, m;
    static int[] dy = {-1, 1, 0, 0}; // 상하좌우
    static int[] dx = {0, 0, -1, 1};
    static int[][] dis;

    static void bfs(int y, int x, int[][] maps) {
        Queue<Point> q = new LinkedList<>();
        q.offer(new Point(y, x));
        maps[y][x] = 0;
        dis[y][x] = 1;

        while (!q.isEmpty()) {
            Point curr = q.poll();
            for (int i = 0; i < 4; i++) {
                int ty = curr.y + dy[i];
                int tx = curr.x + dx[i];
                if (ty < 0 || tx < 0 || ty >= n || tx >= m || maps[ty][tx] == 0) continue;
                maps[ty][tx] = 0;
                q.offer(new Point(ty, tx));
                dis[ty][tx] = dis[curr.y][curr.x] + 1;
            }
        }
    }

    public static int solution(int[][] maps) {
        n = maps.length;
        m = maps[0].length;
        dis = new int[n][m];
        bfs(0, 0, maps);
        return dis[n - 1][m - 1] > 0 ? dis[n - 1][m - 1] : -1;
    }
}
