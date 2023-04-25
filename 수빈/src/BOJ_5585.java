import java.util.Scanner;

/**
 * 백준 거스름돈 / 브론즈2 / 4분
 */

public class BOJ_5585 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int change = 1000 - n; // 거스름돈
        int cnt = 0; // 500엔, 100엔, 50엔, 10엔, 5엔, 1엔

        while (change > 0) {
            if (change >= 500) change -= 500;
            else if (change >= 100) change -= 100;
            else if (change >= 50) change -= 50;
            else if (change >= 10) change -= 10;
            else if (change >= 5) change -= 5;
            else change -= 1;
            cnt++;
        }

        System.out.println(cnt); // 결과 출력
    }
}
