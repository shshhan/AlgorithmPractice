package Programmers.Practice.Level1;

import java.util.Arrays;

/**
 * 2022.03.04
 * 정확성  테스트
 * 테스트 1 〉	통과 (0.21ms, 77.5MB)
 * 테스트 2 〉	통과 (0.27ms, 74.8MB)
 * 테스트 3 〉	통과 (1.65ms, 76.7MB)
 * 테스트 4 〉	통과 (2.52ms, 75.6MB)
 * 테스트 5 〉	통과 (2.48ms, 81MB)
 * 효율성  테스트
 * 테스트 1 〉	통과 (138.81ms, 81.4MB)
 * 테스트 2 〉	통과 (206.49ms, 87.5MB)
 * 테스트 3 〉	통과 (296.99ms, 95.3MB)
 * 테스트 4 〉	통과 (279.17ms, 97.9MB)
 * 테스트 5 〉	통과 (276.04ms, 95.3MB)
 * 채점 결과
 * 정확성: 50.0
 * 효율성: 50.0
 * 합계: 100.0 / 100.0
 */

public class 완주하지못한선수 {
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(completion);
        Arrays.sort(participant);

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < completion.length; i++){
            if(!completion[i].equals(participant[i])) {
                sb.append(participant[i]);
                break;
            }
        }

        if(sb.length() == 0){
            sb.append(participant[participant.length-1]);
        }

        return sb.toString();

    }
}
