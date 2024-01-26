class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        
        String[] treasure_map = new String [n];
        
        // 2개 배열의 i번째 값을 가져와서 2진수로 만든다음 비트연산하면 되지 않을까?
        for(int i = 0; i < n; i++) {
            
            String binary = Long.toBinaryString(arr1[i]|arr2[i]);
            String formatted = String.format("%0" + n + "d", Long.parseLong(binary));

            String decodeWall = "";
            for(String each : formatted.split("")) {
                decodeWall += each.equals("1") ? "#" : " ";
            }
            treasure_map[i] = decodeWall;
        }
        return treasure_map;
        
    }
}