class Solution {
    public int solution(int n, int m, int[] section) {
        
        int painting_cnt = 0;
        
        int roler = (m-1);
        int max_section = 0;
        
        for(int i = 0; i < section.length; i++) {
            if(max_section < section[i]) {
                painting_cnt++;
                max_section = section[i] + roler;
            }
        }
        
        return painting_cnt;
    }
}