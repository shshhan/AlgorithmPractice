package Programmers.Practice.Level1;

/**
 * 2022.03.13
 * list.stream().mapToInt(i -> i).toArray();를 통해 arraylist에서 int[] 했을 때
 * 정확성  테스트
 * 테스트 1 〉	통과 (1.76ms, 75.9MB)
 * 테스트 2 〉	통과 (2.00ms, 77.8MB)
 * 테스트 3 〉	통과 (1.89ms, 73MB)
 * 테스트 4 〉	통과 (2.11ms, 77.2MB)
 * 테스트 5 〉	통과 (1.93ms, 75.7MB)
 * 테스트 6 〉	통과 (2.86ms, 76.2MB)
 * 테스트 7 〉	통과 (2.82ms, 77.9MB)
 * 테스트 8 〉	통과 (2.52ms, 74.7MB)
 * 테스트 9 〉	통과 (2.83ms, 82.7MB)
 * 테스트 10 〉	통과 (2.74ms, 75.1MB)
 * 테스트 11 〉	통과 (1.86ms, 72.9MB)
 * 테스트 12 〉	통과 (1.82ms, 79MB)
 * 테스트 13 〉	통과 (1.94ms, 79.2MB)
 * 테스트 14 〉	통과 (2.08ms, 75.1MB)
 * 테스트 15 〉	통과 (1.82ms, 76MB)
 * 테스트 16 〉	통과 (1.80ms, 77.9MB)
 * 테스트 17 〉	통과 (1.80ms, 73.4MB)
 * 효율성  테스트
 * 테스트 1 〉	통과 (33.31ms, 115MB)
 * 테스트 2 〉	통과 (33.57ms, 116MB)
 * 테스트 3 〉	통과 (31.08ms, 115MB)
 * 테스트 4 〉	통과 (34.87ms, 113MB)
 * 채점 결과
 * 정확성: 71.9
 * 효율성: 28.1
 * 합계: 100.0 / 100.0
 *
 * 단순 반복문으로 arraylist에서 int[] 했을 때
 * 정확성  테스트
 * 테스트 1 〉	통과 (0.02ms, 78.9MB)
 * 테스트 2 〉	통과 (0.10ms, 77.5MB)
 * 테스트 3 〉	통과 (0.07ms, 76.8MB)
 * 테스트 4 〉	통과 (0.05ms, 69.8MB)
 * 테스트 5 〉	통과 (0.07ms, 78.4MB)
 * 테스트 6 〉	통과 (0.05ms, 82.2MB)
 * 테스트 7 〉	통과 (0.06ms, 75MB)
 * 테스트 8 〉	통과 (0.07ms, 72.3MB)
 * 테스트 9 〉	통과 (0.09ms, 71.5MB)
 * 테스트 10 〉	통과 (0.04ms, 78.2MB)
 * 테스트 11 〉	통과 (0.05ms, 72.9MB)
 * 테스트 12 〉	통과 (0.04ms, 78.4MB)
 * 테스트 13 〉	통과 (0.08ms, 77.2MB)
 * 테스트 14 〉	통과 (0.09ms, 72MB)
 * 테스트 15 〉	통과 (0.06ms, 75.3MB)
 * 테스트 16 〉	통과 (0.08ms, 75.8MB)
 * 테스트 17 〉	통과 (0.02ms, 75.8MB)
 * 효율성  테스트
 * 테스트 1 〉	통과 (23.22ms, 109MB)
 * 테스트 2 〉	통과 (22.65ms, 115MB)
 * 테스트 3 〉	통과 (24.35ms, 115MB)
 * 테스트 4 〉	통과 (27.21ms, 126MB)
 * 채점 결과
 * 정확성: 71.9
 * 효율성: 28.1
 * 합계: 100.0 / 100.0
 *
 * 압도적으로 단순 반복문이 성능이 더 좋다!
 */

import java.util.ArrayList;


public class 같은숫자는싫어 {
    public int[] solution(int []arr) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < arr.length; i++){
            if(i > 0 && arr[i] == arr[i-1]){
                continue;
            }
            list.add(arr[i]);
        }

//        int[] answer = list.stream().mapToInt(i -> i).toArray();
        int[] answer= new int[list.size()];

        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }

        return answer;
    }
}
