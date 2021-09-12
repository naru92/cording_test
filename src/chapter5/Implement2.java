package chapter5;

import java.util.Scanner;

public class Implement2 {
    
    /* 정수 N이 입력되면 00시 00분 00초 부터 N시 59분 59초 까지의 모든 시각중에서 3이 하나라도 포함되는
     * 모든 경우의 수를 구하는 프로그램을 작성하시오. 예를 들어 1을 입력했을 때 다음은 3이 하나
     * 라도 포함되어 있으므로 세어야 하는 시각이다.
    */
    
    // 00시 00분 03초
    // 00시 13분 30초
    
    /*
     * 반면 다음은 3이 하나도 포함되어 있지 않으므로 세지 않는 시각이다
     * */
    
    //00시 02분 55초
    //01시 27분 45초
    
    /*
     * 입력 조건 : 첫째 줄에 정수 N이 입력된다 (0<=N<=23)
     * 출력 조건: 00시 00분 00초로부터 N시 59분 59초 까지의 모든 시각 중에서 3이 하나라도 포함되는 모든 경우의 수를 출력한다.
     * 
     * 입력예시  출력예시
          5     11475
     * */
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        //단순하게 1씩 증가 시키면서 3이 포함되어있는지 확인(완전탐색)
        // 시, 분, 초 이므로 경우의수는 24 X 60 X 60
        // 3중 반복문을 이용
        
        for(int i = 0; i <= n; i++) {
            for(int j=0; j<=59; j++) {
                for(int k=0; k<=59; k++) {
                    if((String.valueOf(i)).contains("3") ||
                       (String.valueOf(j)).contains("3") ||
                       (String.valueOf(k)).contains("3")) {
                        count += 1;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
