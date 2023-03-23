public class PGS_Lv2_87946 {
    static int answer = 0;
    static boolean[] visited;

    static void dfs(int rest, int[][] dungeons, int depth) {
        for (int i = 0; i < dungeons.length; i++) {
            if (!visited[i] && rest >= dungeons[i][0]) {
                visited[i] = true;
                dfs(rest - dungeons[i][1], dungeons, depth + 1);
                visited[i] = false;
            }
        }
        answer = Math.max(answer, depth);
    }

    public static int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length];
        dfs(k, dungeons, 0);
        return answer;
    }
}
