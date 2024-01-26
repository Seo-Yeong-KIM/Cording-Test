import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        
        Map<String, Integer> yearningScore = new HashMap<>();
        int[] result = new int[photo.length];
        
        // 인물 별 그리움 점수 할당
        for(int i = 0; i < name.length; i++) {
            yearningScore.put(name[i], yearning[i]);
        }
        
        // 각 사진 별 누적 그리움 점수 계산
        for(int index = 0; index < photo.length; index++) {
            int totalScore = 0;
            for(String person : photo[index]) {
                if(yearningScore.containsKey(person))
                totalScore += yearningScore.get(person);
            }
            result[index] = totalScore;
        }

        return result;
        
    }
}