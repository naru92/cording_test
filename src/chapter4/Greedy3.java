package chapter4;

import java.util.*;

public class Greedy3 {
	public static void main(String[] args) {

		//문제. 1이 될때까지
		// 어떠한 수 N이 1이 될때까지 두 과정중 하나를 반복적으로 선택하여 수행하려고 합니다.
		// 단, 두번째 연산은 N이 K로 나누어 떨어질 떄만 선택할 수 있습니다.
		
		/*
		 * 1. N에서 1을 뻅니다
		 * 2. N을 K로 나눕니다
		 * 
		 * N과 K가 주어 질때 n이 1이 될 때까지 1번 혹은 2번의 과정을 수행하는 최소 횟수를 구하는 프로그램을 작성하세요
		 * */
		long beforeTime = System.currentTimeMillis(); //코드 실행 전에 시간 받아오기
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		int result = 0;
		
		
		/*
		 * while(n != 1) {
		 * 
		 * if(n % k == 0) { //k로 나눠지면 k로 나눔 n = n / k; result++; } else { // k로 나눠지지않으면
		 * -1을함 n = n-1; result++; }
		 * 
		 * }
		 */
		
		while(true) {
			int target = (n / k) * k;
			result += (n - target);
			n = target;
			
			if(n < k) {
				break;
			}
			result += 1;
			n /= k;
		}
		
		
		result += (n-1);
		System.out.println(result);
		long afterTime = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기
		long secDiffTime = (afterTime - beforeTime)/1000; //두 시간에 차 계산
		System.out.println("시간차이(m) : "+secDiffTime);
		sc.close();
	}
}
