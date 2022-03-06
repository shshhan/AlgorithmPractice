package Programmers.Practice.Level1;

/**
 * 2022.03.06
 * 정확성  테스트
 * 테스트 1 〉	실패 (1.20ms, 70.6MB)
 * 테스트 2 〉	통과 (2.55ms, 73.6MB)
 * 테스트 3 〉	통과 (46.34ms, 73.9MB)
 * 테스트 4 〉	통과 (447.82ms, 95.7MB)
 * 테스트 5 〉	통과 (1976.36ms, 116MB)
 * 테스트 6 〉	실패 (7.65ms, 80.3MB)
 * 테스트 7 〉	실패 (23.64ms, 80.2MB)
 * 테스트 8 〉	통과 (494.58ms, 98.3MB)
 * 테스트 9 〉	실패 (1916.26ms, 99.8MB)
 * 테스트 10 〉	통과 (436.30ms, 95.3MB)
 * 테스트 11 〉	통과 (477.09ms, 105MB)
 * 테스트 12 〉	통과 (1085.96ms, 103MB)
 * 테스트 13 〉	실패 (1105.52ms, 96.3MB)
 * 테스트 14 〉	통과 (1.86ms, 74.4MB)
 * 테스트 15 〉	통과 (154.43ms, 99.8MB)
 * 테스트 16 〉	통과 (58.32ms, 80.7MB)
 * 테스트 17 〉	통과 (193.27ms, 75.4MB)
 * 테스트 18 〉	통과 (58.62ms, 91.6MB)
 * 테스트 19 〉	통과 (6.84ms, 83.3MB)
 * 테스트 20 〉	통과 (109.85ms, 104MB)
 * 테스트 21 〉	통과 (364.68ms, 104MB)
 * 테스트 22 〉	통과 (2211.58ms, 109MB)
 * 테스트 23 〉	실패 (1822.04ms, 96.2MB)
 * 테스트 24 〉	실패 (1818.94ms, 101MB)
 * 테스트 25 〉	실패 (0.84ms, 84.1MB)
 * 테스트 26 〉	통과 (0.74ms, 77.9MB)
 * 테스트 27 〉	통과 (0.81ms, 79.7MB)
 * 채점 결과
 * 정확성: 70.4
 * 합계: 70.4 / 100.0
 *
 * 어떻게 해도 통과가 안된다.
 * 다음에 다시 시도해보기!
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class 실패율 {
    public int[] solution(int N, int[] stages) {
        Arrays.sort(stages);

        ArrayList<Integer> stageList = new ArrayList<>();

        for(int i = 0; i < stages.length; i++){
            stageList.add(stages[i]);
        }

        ArrayList<Double> failRatio = new ArrayList<>();

        for(int i = 1; i <= N; i++){
            failRatio.add(i-1, (double) Collections.frequency(stageList, i)/stageList.size());

            while(stageList.size() > 0 && stageList.get(0) == i){
                stageList.remove(0);
            }
        }

        System.out.println(failRatio);

        int[] answer = new int[N];

        for(int i = 0; i < answer.length; i++){
            answer[i] = failRatio.indexOf(Collections.max(failRatio)) + 1;
            System.out.println(answer[i]);
            failRatio.set(answer[i]-1, -1.0);
        }

        return answer;
    }
}
