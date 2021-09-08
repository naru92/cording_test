package chapter3;

import java.lang.reflect.*;
import java.util.*;

public class Complexity2 {
		public static void main(String[] args) {
			Random random = new Random();
			
			
			List<Integer> array = null; // 5개의 데이터 (N = 5)
			int count = 0;
			
			for(int i=1 ; i <= 10000; i++) {
				
				array.add(random.nextInt(100));
			}
			
			long beforeTime = System.currentTimeMillis();
			long afterTime = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기
			
			for(int i =0; i< array.size(); i++) {
				int min_index = i; // 가장 작은 원소의 인덱스
				
				for(int j= i+1; j< array.size();) {}
				
			}
		
		}
		
}


