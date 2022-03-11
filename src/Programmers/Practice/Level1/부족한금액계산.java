package Programmers.Practice.Level1;

/**
 * 2022.03.11
 * 정확성  테스트
 * 테스트 1 〉	통과 (0.23ms, 74.4MB)
 * 테스트 2 〉	통과 (0.06ms, 73MB)
 * 테스트 3 〉	통과 (0.10ms, 72.9MB)
 * 테스트 4 〉	통과 (0.07ms, 76.8MB)
 * 테스트 5 〉	통과 (0.08ms, 76.3MB)
 * 테스트 6 〉	통과 (0.12ms, 77MB)
 * 테스트 7 〉	통과 (0.12ms, 74.7MB)
 * 테스트 8 〉	통과 (0.12ms, 73.4MB)
 * 테스트 9 〉	통과 (0.17ms, 79.4MB)
 * 테스트 10 〉	통과 (0.15ms, 79.9MB)
 * 테스트 11 〉	통과 (0.35ms, 74.2MB)
 * 테스트 12 〉	통과 (0.48ms, 78.8MB)
 * 테스트 13 〉	통과 (0.35ms, 68.8MB)
 * 테스트 14 〉	통과 (0.42ms, 72.7MB)
 * 테스트 15 〉	통과 (0.35ms, 77.6MB)
 * 테스트 16 〉	통과 (0.30ms, 79.1MB)
 * 테스트 17 〉	통과 (0.43ms, 76.1MB)
 * 테스트 18 〉	통과 (0.53ms, 79.8MB)
 * 테스트 19 〉	통과 (0.60ms, 69.7MB)
 * 테스트 20 〉	통과 (0.61ms, 69.7MB)
 * 테스트 21 〉	통과 (0.42ms, 70.3MB)
 * 테스트 22 〉	통과 (0.76ms, 75.9MB)
 * 테스트 23 〉	통과 (0.38ms, 75.1MB)
 * 채점 결과
 * 정확성: 100.0
 * 합계: 100.0 / 100.0
 */

public class 부족한금액계산 {
    public long solution(int price, int money, int count) {

        Long total = Long.valueOf(0);
        for(int i = 1; i <= count ; i++){
            total += price*i;
        }

        Long answer = Long.valueOf(0);
        if(total > money){
            answer = total - money;
        }
        return answer;
    }
}
