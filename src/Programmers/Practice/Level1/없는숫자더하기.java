package Programmers.Practice.Level1;

/**
 * 2022.03.02
 * 정확성  테스트
 * 테스트 1 〉	통과 (0.03ms, 78.6MB)
 * 테스트 2 〉	통과 (0.02ms, 74.8MB)
 * 테스트 3 〉	통과 (0.03ms, 80.5MB)
 * 테스트 4 〉	통과 (0.02ms, 75.9MB)
 * 테스트 5 〉	통과 (0.03ms, 82MB)
 * 테스트 6 〉	통과 (0.02ms, 74.5MB)
 * 테스트 7 〉	통과 (0.02ms, 75.3MB)
 * 테스트 8 〉	통과 (0.02ms, 75.1MB)
 * 테스트 9 〉	통과 (0.03ms, 77.4MB)
 * 채점 결과
 * 정확성: 100.0
 * 합계: 100.0 / 100.0
 */

class Solution {
    public int solution(int[] numbers) {
        int total = 45;

        for(int i : numbers){
            total -= i;
        }

        return total;
    }
}