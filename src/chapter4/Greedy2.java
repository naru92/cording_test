package chapter4;

import java.util.*;

public class Greedy2 {
	// 풀이 시간 30분
	// 시간제한 1초
	// 메모리 제한 128MB
	// 기출 2019 국가기관 코딩 테스트
	
	/*
	 - 입력조건 
	 * 첫째 줄에 N(2<=N<=1000), M(1<=M<=10000),K(1<=K<=10000)의 자연수가 주어지며,
	   각 자연수는 공백으로 구분한다.
	 * 둘째 줄에 N개의 자연수가 주어진다. 각 자연수는 공백으로 구분한다. 단, 각각의 자연수는 1 이상
	   10,000 이하의 수로 주어진다.
	 * 입력으로 주어는 K는 항상 M보다 작거나 같다.
	 
	 - 출력조건
	 * 첫째 줄에 사용자의 큰 수의 법칙에 따라 더해진 답을 출력한다.
	 
	*/
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//N, M,K 을 공백을 기준으로 구분하여 입력받기
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int k = scanner.nextInt();
		
		int[] arr = new int[n];
		
		// N개의 수를 공백을 기준으로 구분하여 입력 받기
		for(int i = 0; i< n ; i++) {
			arr[i] = scanner.nextInt();
		}
		
		Arrays.sort(arr); // 받은수들 정렬하기
		int first = arr[n - 1]; //가장 큰수
		int second = arr[n - 2];//두 번째로 큰 수
		
		//가장 큰 수가 더해지는 횟수 계산
		int cnt = (m / (k+1)) * k;
		cnt += m % (k+1);
		
		int result = 0;
		result += cnt * first; //가장 큰 수 더하기
		result += (m-cnt) * second; //두번째 큰 수 더하기
		
		System.out.println(result);
		
    }
}