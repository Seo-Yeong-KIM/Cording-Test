class Solution {
    public int solution(int n) {
        
        // 2진수로 변환 후 가장 큰 1만 왼쪽으로 옮기고 나머지 1은 오른쪽에서부터 채우기
        
        int target = n;
        int oneCnt = 0; // 그 외 1의 갯수
        int maxOneIndex = 0; // 가장 큰 1의 인덱스
        
        do {
            if(target%2 == 1 && (target/2)%2 == 0) {
                target++;
                break;
            }
            oneCnt += target%2;
            maxOneIndex++;
            target /= 2;
        } while(target > 0);
        
        target *= ((int)Math.pow(2,maxOneIndex));
        target += ((int)Math.pow(2,oneCnt))-1;
        
        return target;
    }
}