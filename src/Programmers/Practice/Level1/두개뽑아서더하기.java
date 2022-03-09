package Programmers.Practice.Level1;

/**
 * 2022.03.07
 * HashSet
 * 정확성  테스트
 * 테스트 1 〉	통과 (0.38ms, 75.4MB)
 * 테스트 2 〉	통과 (0.44ms, 75.4MB)
 * 테스트 3 〉	통과 (0.58ms, 71.5MB)
 * 테스트 4 〉	통과 (0.36ms, 66MB)
 * 테스트 5 〉	통과 (0.50ms, 76.6MB)
 * 테스트 6 〉	통과 (0.69ms, 76.6MB)
 * 테스트 7 〉	통과 (1.51ms, 78.3MB)
 * 테스트 8 〉	통과 (1.08ms, 78MB)
 * 테스트 9 〉	통과 (1.01ms, 76.6MB)
 * 채점 결과
 * 정확성: 100.0
 * 합계: 100.0 / 100.0
 *
 * TreeSet
 * 정확성  테스트
 * 테스트 1 〉	통과 (0.50ms, 76.1MB)
 * 테스트 2 〉	통과 (0.51ms, 76.5MB)
 * 테스트 3 〉	통과 (0.48ms, 67.9MB)
 * 테스트 4 〉	통과 (0.67ms, 80.8MB)
 * 테스트 5 〉	통과 (0.60ms, 69.6MB)
 * 테스트 6 〉	통과 (0.89ms, 78.4MB)
 * 테스트 7 〉	통과 (3.38ms, 86.6MB)
 * 테스트 8 〉	통과 (2.05ms, 77.4MB)
 * 테스트 9 〉	통과 (1.57ms, 76.3MB)
 * 채점 결과
 * 정확성: 100.0
 * 합계: 100.0 / 100.0
 *
 * HashSet이 아닌 TreeSet으로 하면 정렬을 따로 하지 않아도 되어 TreeSet으로도 시도해봤지만
 * TreeSet이 테스트 케이스당 약 20%정도 더 느린 속도를 보여주었다.
 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;


public class 두개뽑아서더하기 {
    public int[] solution(int[] numbers) {
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < numbers.length; i++){
            for(int j = i+1; j < numbers.length; j++){
                set.add(numbers[i]+numbers[j]);
            }
        }

        int[] answer = new int[set.size()];

        int i = 0;
        Iterator it = set.iterator();

        while(it.hasNext()){
            answer[i] = (int)it.next();
            i++;
        }

        Arrays.sort(answer);
        return answer;
    }
}
