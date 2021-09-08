package chapter4;

import java.util.Scanner;

public class Greedy4 {
    //각 자리가 숫자(0~9) 로만 이루어진 문자열 S가 주어졌을 때, 
    //왼쪽부터 오른쪽으로 하나씩 모든 숫자를 확인하며 숫자 사이에 'X' 혹은 '+' 연산자를 넣어
    // 결과적으로 만들어질 수 있는 가장 큰 수를 구하는 프로그램을 작성하시오
    //단, +보다 X를 먼저 계산하는 일반적인 방식과는 달리, 모든 연산은 왼쪽에서 부터 순서대로
    //이루어 진다고 가정한다.
    
    //예를 들어 02984라는 문자열로 만들수 있는 가장 큰 수는 ((((0+2) X 9) X 8)X 4) = 576입니다.
    //또한 만들어질수 있는 가장 큰 수는 항상 20억 이하의 정수가 되도록 입력이 주어집니다.
    
    /* 
     * 풀이시간 30분
     * 시간제한 1초
     * 메모리제한 128MB
     * 기출 Facebook 인터뷰
         
         -입력 조건
     * 첫쨰 줄에 여러개의 숫자로 구성된 하나의 문자열 S가 주어집니다 (1<= S의길이 <=20)
         
         -출력 조건
     *첫째 줄에 만들어질 수 있는 가장 큰 수를 출력합니다
         
     *입력 예시   출력예시
         1.02984     576
         2.567       210
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine(); 
       long result = s.charAt(0) - '0'; //JAVA에선 아스키코드 값이 나오기 때문에 '0'의 아스키코드값 48을 빼줘야
                                        //charAt(?)의 값이 본디 정수값이 나옴
       for(int i =1; i < s.length(); i++) {
           int num = s.charAt(i) -'0';
           if (num <= 1 || result <= 1) {
               //두 수 중 하나라도 0 or 1인경우 , 더하기가 이득
               result += num;
           }else {
               //나머진 곱하는게 값이 커짐
               result *= num;
           }
       }
       
       System.out.println(result);
       sc.close();
    }
}
