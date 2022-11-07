/**
 * 삼성전자에 입사한 종민이는 회사 근처로 이사를 하게 되었다.

그런데 집의 위치가 두 수도 회사 A, B 중간에 위치하기에 원하는 수도 회사를 선택할 수 있게 되었는데, 두 회사 중 더 적게 수도 요금을 부담해도 되는 회사를 고르려고 한다.
 
종민이가 알아본 결과 두 회사의 수도 요금은 한 달 동안 사용한 수도의 양에 따라 다음과 같이 정해진다.
 
A사 : 1리터당 P원의 돈을 내야 한다.

B사 : 기본 요금이 Q원이고, 월간 사용량이 R리터 이하인 경우 요금은 기본 요금만 청구된다. 하지만 R 리터보다 많은 양을 사용한 경우 초과량에 대해 1리터당 S원의 요금을 더 내야 한다.
 */
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 1; i <=T; i++){
            int P = sc.nextInt();
            int Q = sc.nextInt();
            int R = sc.nextInt();
            int S = sc.nextInt();
            int W = sc.nextInt();
            int a_company , b_company= 0;

            a_company = P * W;
            if( W <= R){
                b_company = Q;
            }else{
                b_company = (W - R) * S + Q;
            }
            if(a_company > b_company){
                System.out.println("#" + i + " " + b_company );

            }else{
            System.out.println("#" + i + " " + a_company);
            }
            
        }

    }
}

// 이게 왜 어택?