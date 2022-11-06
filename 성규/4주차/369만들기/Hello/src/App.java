/**
 * 3 6 9 게임을 프로그램으로 제작중이다. 게임 규칙은 다음과 같다.

 

1. 숫자 1부터 순서대로 차례대로 말하되, “3” “6” “9” 가 들어가 있는 수는 말하지 않는다.

  1 2 3 4 5 6 7 8 9…

2. "3" "6" "9"가 들어가 있는 수를 말하지 않는대신, 박수를 친다. 이 때, 박수는 해당 숫자가 들어간 개수만큼 쳐야 한다.  
예를 들어 숫자 35의 경우 박수 한 번, 숫자 36의 경우 박수를 두번 쳐야 한다.
 

입력으로 정수 N 이 주어졌을 때, 1~N 까지의 숫자를

게임 규칙에 맞게 출력하는 프로그램을 작성하라.

박수를 치는 부분은 숫자 대신, 박수 횟수에 맞게 “-“ 를 출력한다.

여기서 주의해야 할 것은 박수 한 번 칠 때는 - 이며, 박수를 두 번 칠 때는 - - 가 아닌 -- 이다. 
 

[제약사항]

N은 10이상 1,000이하의 정수이다. (10 ≤ N ≤ 1,000)

 

[입력]

입력으로 정수 N 이 주어진다.


[출력]

1 ~ N까지의 숫자를 게임 규칙에 맞게 출력한다.
 * 
 */


import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String result = "";
        String s;
        for( int i = 1; i <= number; i++){
            s = String.valueOf(i);
            if(s.contains("3")|| s.contains("6") || s.contains("9")){
                s = s.replace("3", "-");
                s = s.replace("6", "-");
                s = s.replace("9", "-");
                s = s.replace("1", "");
                s = s.replace("2", "");
                s = s.replace("4", "");
                s = s.replace("5", "");
                s = s.replace("7", "");
                s = s.replace("8", "");
                s = s.replace("0", "");
            }
            result += s + " ";
        }
        System.out.print(result);
    }
}

/*
 * 처음 풀었을때 if문에 만족하면 s값을 - 로 바꾸게 했으나 36등 여러개가 들어있어도 한개만 출력되어 
 * 3,6,9하나씩 다 매칭시켜서 replace되도록 수정했음 
 */