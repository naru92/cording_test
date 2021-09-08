package chapter3;

public class Complexity {
		public static void main(String[] args) {
			
			int[] array = {3, 5, 1, 2, 4}; // 5개의 데이터 (N = 5)
			int summary = 0;
			
			// 모든 데이터를 하나씩 확인하며 합계를 계산
			for(int x : array) {
				summary += x;
			}
			
			System.out.println(summary);
		}
	
}


