package Programmers.Practice.Level1;

/**
 * 2022.03.11
 * 정확성  테스트
 * 테스트 1 〉	통과 (0.04ms, 77MB)
 * 테스트 2 〉	통과 (0.04ms, 79MB)
 * 테스트 3 〉	통과 (0.03ms, 80.9MB)
 * 테스트 4 〉	통과 (0.03ms, 82.7MB)
 * 테스트 5 〉	통과 (0.04ms, 77.4MB)
 * 테스트 6 〉	통과 (0.04ms, 71.2MB)
 * 테스트 7 〉	통과 (0.03ms, 75.5MB)
 * 테스트 8 〉	통과 (0.06ms, 67.9MB)
 * 테스트 9 〉	통과 (0.03ms, 78.8MB)
 * 테스트 10 〉	통과 (0.03ms, 64MB)
 * 테스트 11 〉	통과 (0.03ms, 77MB)
 * 테스트 12 〉	통과 (0.05ms, 81.8MB)
 * 테스트 13 〉	통과 (0.04ms, 75.5MB)
 * 테스트 14 〉	통과 (0.04ms, 73.3MB)
 * 테스트 15 〉	통과 (0.05ms, 77.4MB)
 * 테스트 16 〉	통과 (0.05ms, 64.8MB)
 * 채점 결과
 * 정확성: 100.0
 * 합계: 100.0 / 100.0
 */
public class 가운데글자가져오기 {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();

        sb.append(s.charAt((int)s.length()/2));

        if(s.length()%2 == 0){
            sb.insert(0, s.charAt((int)(s.length()/2)-1));
        }

        return sb.toString();
    }
}
