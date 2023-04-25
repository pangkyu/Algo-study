import java.util.Scanner;

/**
 * 백준 전자레인지 / 브론즈3 / 6분
 */

public class BOJ_10162 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int a = 0; // 5분 == 300초
        int b = 0; // 1분 == 60초
        int c = 0; // 10초

        // 최소단위인 10초로 나누어 떨어지지 않으면 -1 출력 후 리턴
        if (t % 10 != 0) {
            System.out.println(-1);
            return;
        }

        while (t > 0) {
            if (t >= 300) { // A(300초) 이상
                a++;
                t -= 300;
            } else if (t >= 60) { // B(60초) 이상
                b++;
                t -= 60;
            } else { // C(10초) 이상
                c++;
                t -= 10;
            }
        }

        System.out.println(a + " " + b + " " + c); // 결과 출력
    }
}
