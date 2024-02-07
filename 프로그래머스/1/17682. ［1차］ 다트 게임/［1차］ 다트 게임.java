import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Solution {
    public int solution(String dartResult) {
        
        int answer = 0;
        
        String regex = "(\\d+)(\\D)([#*]?)"; // 숫자(1자리 이상), 문자(1자리), # 또는 *(0-1 자리)
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(dartResult); // 정규식 패턴과 일치하는 문자열을 반환
        
        int beforeScore = 0;
        int extraScore = 0;
        while (matcher.find()) {
            int score = Integer.parseInt(matcher.group(1));
            String operator = matcher.group(2);
            String extraOp = matcher.group(3);
            
            switch (operator) {
                case "S" :
                    score = (int)Math.pow(score, 1);
                    break;
                case "D" :
                    score = (int)Math.pow(score, 2);
                    break;
                case "T" :
                    score = (int)Math.pow(score, 3);
                    break;
            }
            
            switch (extraOp) {
                case "*" :
                    score *= 2;
                    extraScore = beforeScore;
                    break;
                case "#" :
                    score *= -1;
                    break;
            }
            
            answer += score + extraScore;
            beforeScore = score;
            extraScore = 0;
        }
        
        return answer;
    }
}