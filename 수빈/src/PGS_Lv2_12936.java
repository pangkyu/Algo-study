import java.util.*;

public class PGS_Lv2_12936 {
    public static int[] solution(int n, long k) {
        int[] answer = new int[n];
        ArrayList<Integer> list = new ArrayList<>();
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            list.add(i);
            factorial *= i;
        }

        int i = 0;
        long remain = k - 1;

        while (i < n) {
            factorial /= (n - i);
            long value = remain / factorial;
            answer[i++] = list.get((int) value);
            list.remove((int) value);
            remain %= factorial;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(3, 5)));
    }
}
