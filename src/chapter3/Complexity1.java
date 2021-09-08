package chapter3;

public class Complexity1 {
		public static void main(String[] args) {
			
			int[] array = {3, 5, 1, 2, 4}; // 5개의 데이터 (N = 5)
			int count = 0;
			
			// 모든 데이터를 하나씩 확인하며 합계를 계산
			for(int i : array) {
				for(int j : array) {
					
					int temp = i * j ;
					System.out.println(temp);
					count++;
				}
			}			
			System.out.println("실행숫자 : " +  count);
		}
	
		
}


