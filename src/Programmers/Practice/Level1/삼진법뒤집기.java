package Programmers.Practice.Level1;

/**
 * 2022.03.09
 * 정확성  테스트
 * 테스트 1 〉	통과 (0.05ms, 76.8MB)
 * 테스트 2 〉	통과 (0.08ms, 77.4MB)
 * 테스트 3 〉	통과 (0.13ms, 80.1MB)
 * 테스트 4 〉	통과 (0.05ms, 75.9MB)
 * 테스트 5 〉	통과 (0.07ms, 76.3MB)
 * 테스트 6 〉	통과 (0.06ms, 76.2MB)
 * 테스트 7 〉	통과 (0.07ms, 75.1MB)
 * 테스트 8 〉	통과 (0.08ms, 75.8MB)
 * 테스트 9 〉	통과 (0.09ms, 71.9MB)
 * 테스트 10 〉	통과 (0.07ms, 72.7MB)
 * 채점 결과
 * 정확성: 100.0
 * 합계: 100.0 / 100.0
 */

public class 삼진법뒤집기 {
    public int solution(int n) {
        StringBuilder sb = new StringBuilder();

        while(n/3 > 0){
            sb.append(n%3);
            n /= 3;
        }

        sb.append(n);

        String reversed = sb.toString();

        int answer = 0;
        int length = reversed.length()-1;

        for(int i = 0; i <= length; i++){
            answer += Integer.parseInt(String.valueOf(reversed.charAt(i))) * (int)Math.pow(3, length-i);
        }

        return answer;
    }
}
