package Programmers.Practice.Level1;

/**
 * 2022.03.10
 * 정확성  테스트
 * 테스트 1 〉	통과 (0.02ms, 77.9MB)
 * 테스트 2 〉	통과 (0.02ms, 78.8MB)
 * 테스트 3 〉	통과 (0.04ms, 97.1MB)
 * 테스트 4 〉	통과 (0.02ms, 74.6MB)
 * 테스트 5 〉	통과 (0.02ms, 73MB)
 * 테스트 6 〉	통과 (0.04ms, 76.6MB)
 * 테스트 7 〉	통과 (0.02ms, 77.2MB)
 * 테스트 8 〉	통과 (0.02ms, 78.8MB)
 * 테스트 9 〉	통과 (0.03ms, 78.1MB)
 * 테스트 10 〉	통과 (0.03ms, 83.3MB)
 * 테스트 11 〉	통과 (0.03ms, 70.8MB)
 * 테스트 12 〉	통과 (0.02ms, 80.4MB)
 * 테스트 13 〉	통과 (0.04ms, 76.2MB)
 * 테스트 14 〉	통과 (0.03ms, 80.1MB)
 * 채점 결과
 * 정확성: 100.0
 * 합계: 100.0 / 100.0
 */
public class 이천십육년 {
    public String solution(int a, int b) {
        int[]daysCntPerMonth ={31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[]date ={"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED",};

        int days = b;
        for(int i = 0; i < a-1; i++){
            days += daysCntPerMonth[i];
        }

        return date[days%7];
    }
}
