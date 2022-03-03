package Programmers.Practice.Level1;

/**
 * 정확성  테스트
 * 테스트 1 〉	통과 (0.03ms, 75.2MB)
 * 테스트 2 〉	통과 (0.01ms, 74.1MB)
 * 테스트 3 〉	통과 (0.02ms, 72.5MB)
 * 테스트 4 〉	통과 (0.02ms, 77.6MB)
 * 테스트 5 〉	통과 (0.02ms, 75.8MB)
 * 테스트 6 〉	통과 (0.03ms, 75.4MB)
 * 테스트 7 〉	통과 (0.03ms, 77.1MB)
 * 테스트 8 〉	통과 (0.04ms, 77.7MB)
 * 테스트 9 〉	통과 (0.05ms, 71.7MB)
 * 채점 결과
 * 정확성: 100.0
 * 합계: 100.0 / 100.0
 */
public class 내적 {
    public int solution(int[] a, int[] b) {
        int total = 0;

        for (int i = 0; i < a.length; i++){
            total += a[i]*b[i];
        }

        return total;
    }
}

