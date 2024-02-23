class Solution {
    public int solution(int[] numbers, int target) {
        return doOperation(numbers, 0, 0, target);
    }
    
    private static int doOperation(int[] numbers, int index, int sum, int target) {
        int answer = 0;
        
        // 배열의 끝까지 연산했으면 결과값 확인 후 재귀 탈출
        if (index == numbers.length) {
            if(sum == target) {
                return 1;
            }
            return 0;
        }

        // 다음 숫자의 연산 부호를 분기
        answer += doOperation(numbers, index + 1, sum + numbers[index], target);
        answer += doOperation(numbers, index + 1, sum - numbers[index], target);
        
        return answer;
    }
    
}