public class PGS_Lv2_43165 {
    static int cnt = 0;

    static void dfs(int L, int sum, int[] numbers, int target) {
        if (L == numbers.length) {
            if (sum == target) cnt++;
        } else {
            dfs(L + 1, sum + numbers[L], numbers, target);
            dfs(L + 1, sum - numbers[L], numbers, target);
        }
    }

    public static int solution(int[] numbers, int target) {
        dfs(0, 0, numbers, target);
        return cnt;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[] {1, 1, 1, 1, 1}, 3)); // 5
        cnt = 0;
        System.out.println(solution(new int[] {4, 1, 2, 1}, 4)); // 2
    }
}
