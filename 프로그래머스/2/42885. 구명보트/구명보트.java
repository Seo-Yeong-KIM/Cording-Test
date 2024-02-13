import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        
        int answer = 0;
        
        // 오름차순으로 정렬
        Arrays.sort(people);
        
        int start = 0;
        int end = people.length-1;
        
        while(start <= end) {
            int max_weight = people[start] + people[end];
            if(max_weight <= limit) { // 두 명을 태울 수 있다면 포인터 2개 다 옮김
                start++;
                end--;
            } else {
                end--; // 아닌 경우 무거운 쪽 1명만 태움
            }
            answer++;
        }
        
        return answer;
    }
}