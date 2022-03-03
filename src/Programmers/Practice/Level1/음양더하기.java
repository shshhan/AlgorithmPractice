package Programmers.Practice.Level1;

/**
 * 2022.03.03
 * 정확성  테스트
 * 테스트 1 〉	통과 (0.03ms, 77.6MB)
 * 테스트 2 〉	통과 (0.04ms, 74.3MB)
 * 테스트 3 〉	통과 (0.04ms, 75MB)
 * 테스트 4 〉	통과 (0.04ms, 77.9MB)
 * 테스트 5 〉	통과 (0.06ms, 80.3MB)
 * 테스트 6 〉	통과 (0.04ms, 76.9MB)
 * 테스트 7 〉	통과 (0.04ms, 78.9MB)
 * 테스트 8 〉	통과 (0.04ms, 78.7MB)
 * 테스트 9 〉	통과 (0.05ms, 78.2MB)
 * 채점 결과
 * 정확성: 100.0
 * 합계: 100.0 / 100.0
 */
public class 음양더하기 {
    public int solution(int[] absolutes, boolean[] signs) {
        int total = 0;

        for(int i = 0; i < absolutes.length; i++){
            total = signs[i] ? total+absolutes[i] : total-absolutes[i];
        }

        return total;
    }
}
