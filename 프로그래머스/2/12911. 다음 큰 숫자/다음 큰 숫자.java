class Solution {
    public int solution(int n) {
        
        // 2진수로 변환 후 가장 큰 1만 왼쪽으로 옮기고 나머지 1은 오른쪽에서부터 채우기
        int before = n%2;
        int findOne = 0; // 그 외 1의 갯수
        int index = 0; // 가장 큰 1의 인덱스
        
        do {
            index++;
            n /= 2;
            if(before == 1 && n%2 == 0) {
                break;
            }
            if(before == 1) {
                findOne++;
            }
            before = n%2;
        } while(n > 0);
        
        n++;
        n *= ((int)Math.pow(2,index));
        n += ((int)Math.pow(2,findOne))-1;
        
        return n;
    }
}