package Programmers.Practice.Level1;

import java.util.Arrays;

/**
 * 2022.03.07
 * 정확성  테스트
 * 테스트 1 〉	통과 (0.46ms, 75.1MB)
 * 테스트 2 〉	통과 (0.43ms, 80MB)
 * 테스트 3 〉	통과 (0.44ms, 78.8MB)
 * 테스트 4 〉	통과 (0.35ms, 77.8MB)
 * 테스트 5 〉	통과 (0.34ms, 73.9MB)
 * 테스트 6 〉	통과 (0.46ms, 77MB)
 * 테스트 7 〉	통과 (0.45ms, 68.1MB)
 * 테스트 8 〉	통과 (0.40ms, 75.2MB)
 * 테스트 9 〉	통과 (0.50ms, 78.1MB)
 * 테스트 10 〉	통과 (0.34ms, 77.7MB)
 * 테스트 11 〉	통과 (0.52ms, 74.7MB)
 * 테스트 12 〉	통과 (0.37ms, 79.1MB)
 * 테스트 13 〉	통과 (0.37ms, 77.1MB)
 * 테스트 14 〉	통과 (0.52ms, 78.8MB)
 * 테스트 15 〉	통과 (0.36ms, 75.8MB)
 * 테스트 16 〉	통과 (0.44ms, 66.2MB)
 * 테스트 17 〉	통과 (0.48ms, 76.6MB)
 * 테스트 18 〉	통과 (0.42ms, 74.3MB)
 * 테스트 19 〉	통과 (0.45ms, 71.4MB)
 * 테스트 20 〉	통과 (0.48ms, 73.3MB)
 * 테스트 21 〉	통과 (0.47ms, 72.9MB)
 * 테스트 22 〉	통과 (0.36ms, 76.1MB)
 * 테스트 23 〉	통과 (0.48ms, 78.6MB)
 * 채점 결과
 * 정확성: 100.0
 * 합계: 100.0 / 100.0
 */

public class 예산 {
    public int solution(int[] d, int budget) {
        int answer = 0;

        Arrays.sort(d);

        for(int i : d){
            budget -= i;

            if(budget >= 0){
                answer++;
            } else{
                break;
            }
        }
        return answer;
    }
}
