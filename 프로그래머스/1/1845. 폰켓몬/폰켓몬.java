import java.util.*;

class Solution {
    public int solution(int[] nums) {
        
        List myMonster = new ArrayList<>();
        int max_cnt = (nums.length)/2;

        for(int category : nums) {
            if(!myMonster.contains(category)) {
                myMonster.add(category);
            }
            if(myMonster.size() == max_cnt) break;
        }
        
        return myMonster.size();
    }
}