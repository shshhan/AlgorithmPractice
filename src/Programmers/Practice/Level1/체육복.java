package Programmers.Practice.Level1;

/**
 * 2022.03.06
 * 정확성  테스트
 * 테스트 1 〉	통과 (0.05ms, 76.9MB)
 * 테스트 2 〉	통과 (0.07ms, 75.9MB)
 * 테스트 3 〉	통과 (0.05ms, 77.2MB)
 * 테스트 4 〉	통과 (0.07ms, 72.2MB)
 * 테스트 5 〉	통과 (0.08ms, 77.7MB)
 * 테스트 6 〉	통과 (0.06ms, 74.2MB)
 * 테스트 7 〉	통과 (0.07ms, 74.9MB)
 * 테스트 8 〉	통과 (0.05ms, 72.3MB)
 * 테스트 9 〉	통과 (0.05ms, 76.1MB)
 * 테스트 10 〉	통과 (0.07ms, 73MB)
 * 테스트 11 〉	통과 (0.06ms, 76.6MB)
 * 테스트 12 〉	통과 (0.05ms, 75.1MB)
 * 테스트 13 〉	통과 (0.05ms, 75.3MB)
 * 테스트 14 〉	통과 (0.04ms, 67.7MB)
 * 테스트 15 〉	통과 (0.04ms, 75.1MB)
 * 테스트 16 〉	통과 (0.05ms, 73MB)
 * 테스트 17 〉	통과 (0.04ms, 68.7MB)
 * 테스트 18 〉	통과 (0.05ms, 75.2MB)
 * 테스트 19 〉	통과 (0.04ms, 68.3MB)
 * 테스트 20 〉	통과 (0.04ms, 77.3MB)
 * 채점 결과
 * 정확성: 100.0
 * 합계: 100.0 / 100.0
 */

import java.util.HashSet;

public class 체육복 {
    public int solution(int n, int[] lost, int[] reserve) {
        HashSet<Integer> reserveSet = new HashSet<>();

        for(int i : reserve){
            reserveSet.add(i);
        }

        int temp = 0;

        for(int i=0; i < lost.length; i++){
            for(int j = i+1; j < lost.length; j++) {
                if (lost[i] > lost[i + 1]) {
                    temp = lost[i];
                    lost[i] = lost[j];
                    lost[j] = temp;
                }
            }
        }

        int availableStudent = n;

        for(int i = 0; i < lost.length; i++){
            if (reserveSet.contains(lost[i])){
                reserveSet.remove(lost[i]);
            } else if (reserveSet.contains(lost[i]-1)){
                reserveSet.remove(lost[i]-1);
            } else if (reserveSet.contains(lost[i]+1) && (lost[i] == lost[lost.length-1] || lost[i+1] != lost[i]+1)){
                reserveSet.remove(lost[i]+1);
            } else {
                availableStudent--;
            }
        }

        return availableStudent;
    }
}
