package Programmers.Practice.Level1;

/**
 * 2022.03.14
 * 정확성  테스트
 * 테스트 1 〉	통과 (0.36ms, 80.2MB)
 * 테스트 2 〉	통과 (0.24ms, 72.6MB)
 * 테스트 3 〉	통과 (0.29ms, 77MB)
 * 테스트 4 〉	통과 (0.41ms, 77.1MB)
 * 테스트 5 〉	통과 (0.57ms, 82MB)
 * 테스트 6 〉	통과 (2.36ms, 88.3MB)
 * 테스트 7 〉	통과 (0.15ms, 66.8MB)
 * 테스트 8 〉	통과 (0.03ms, 77.4MB)
 * 테스트 9 〉	통과 (0.30ms, 78.1MB)
 * 테스트 10 〉	통과 (0.93ms, 77MB)
 * 테스트 11 〉	통과 (0.44ms, 75.7MB)
 * 테스트 12 〉	통과 (0.34ms, 74.4MB)
 * 테스트 13 〉	통과 (0.21ms, 73.7MB)
 * 테스트 14 〉	통과 (0.68ms, 76.5MB)
 * 테스트 15 〉	통과 (0.46ms, 78.2MB)
 * 테스트 16 〉	통과 (0.65ms, 74.7MB)
 * 채점 결과
 * 정확성: 100.0
 * 합계: 100.0 / 100.0
 */

import java.util.ArrayList;
import java.util.Comparator;

public class 나누어떨어지는숫자배열 {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i : arr){
            if(i % divisor == 0){
                list.add(i);
            }
        }

        if(list.size() == 0){
            list.add(-1);
        } else{
            list.sort(Comparator.naturalOrder());
        }

        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }

        return answer;
    }
}
