package chapter4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Greedy5 {
    /* 
      모험가 길드
     - 한 마을에 모험가가 N명있습니다. 모험가 길드에서는 n명의 모험가를 대상으로 '공포도'를 측정했는데,
      '공포도'가 높은 모험가는 쉽게 공포를 느껴 위험 상황에서 제대로 대처 할 능력이 떨어집니다.
     - 모험가 길드장인 사용자는 모험가 그룹을 안전하게 구성하고자 공포도가 X인 모험가는 반드시 X명 이상으로 구성한 모험가 그룹에 참여해야
       여행을 떠날 수 있도록 규정했습니다.
     - 사용자는 최대 몇 개의 모험가 그룹을 만들 수 있는지 궁금합니다. N명의 모험가에 대한 정보가 주어졌을때, 여행을 떠날 수 있는
       그룹 수의 최댓값을 구하는 프로그램을 작성하세요.
    */
    
    // N=5 , 공포도는 각각 2 3 1 2 2 이라 가정한다.
    
    /*
     * 풀이시간 30분
     * 시간제한 1초
     * 메모리제한 128MB
     * 기출 핵심유형
     * */
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); //인원수
        
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i=0 ; i < n; i++) {
            arr.add(scanner.nextInt());    
        }
        Collections.sort(arr); //Collection 클래스의 sort사용 (arrayList)
                               //현재 그룹은 오름차순으로 정렬 됨
        
        int result = 0; // 총 그룹의 수
        int count = 0; // 총 모험가의 수
        
        for(int i =0 ; i < arr.size(); i++) { // 공포도가 낮은순으로 리스트 순회
            count += 1; // 현재 그룹에 모험가 포함(증가)
            if( count >= arr.get(i)) { //공포도가 인원수 보다 작거나 같다면
                result += 1; //그룹하나 새로 만들어짐
                count = 0; // 모험가수 초기화
            }
        }
        System.out.println(result);
    }
}
