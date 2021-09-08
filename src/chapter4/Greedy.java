package chapter4;

public class Greedy {
//1260원 거슬러주기 사용화폐 500,100,50,10
	
	public static void main(String[] args) {
		
		int n = 1260;
		int count = 0;
		
		int[] coin_type = {500, 100, 50, 10};
		
		for(int coin : coin_type) {
			
			if (coin > n) {
				continue;
			}
			
			count += n / coin;
			n %= coin;
		}
		System.out.println(count);
		
	}
	
	
	
}
