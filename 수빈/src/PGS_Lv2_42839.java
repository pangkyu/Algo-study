import java.util.ArrayList;
import java.util.List;

public class PGS_Lv2_42839 {
    static List<Integer> list = new ArrayList<>();
    static boolean[] visit;

    // 소수 찾기
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    static void dfs(String str, String temp, int n) {
        if (temp.length() == n) {
            int num = Integer.parseInt(temp);
            if (!list.contains(num) && isPrime(num)) {
                list.add(num);
                System.out.println(num + " 추가 | list 사이즈 : " + list.size());
            }
        }
        for (int i = 0; i < str.length(); i++) {
            if (!visit[i]) {
                visit[i] = true;
                temp += str.charAt(i);
                dfs(str, temp, n);
                visit[i] = false;
                temp = temp.substring(0, temp.length() - 1);
            }
        }
    }

    public static int solution(String numbers) {
        visit = new boolean[numbers.length()];

        for (int i = 0; i < numbers.length(); i++) {
            dfs(numbers, "", i + 1);
        }

        return list.size();
    }
}
