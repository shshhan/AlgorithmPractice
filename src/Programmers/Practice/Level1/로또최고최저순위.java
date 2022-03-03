package Programmers.Practice.Level1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 2022.02.27
 * 정확성  테스트
 * 테스트 1 〉	통과 (1.51ms, 84.6MB)
 * 테스트 2 〉	통과 (2.38ms, 68.8MB)
 * 테스트 3 〉	통과 (1.48ms, 75.4MB)
 * 테스트 4 〉	통과 (1.60ms, 83.5MB)
 * 테스트 5 〉	통과 (1.83ms, 71.7MB)
 * 테스트 6 〉	통과 (2.14ms, 86.5MB)
 * 테스트 7 〉	통과 (1.64ms, 80.9MB)
 * 테스트 8 〉	통과 (1.58ms, 68MB)
 * 테스트 9 〉	통과 (1.49ms, 67.5MB)
 * 테스트 10 〉	통과 (1.70ms, 82.1MB)
 * 테스트 11 〉	통과 (1.46ms, 76.7MB)
 * 테스트 12 〉	통과 (1.82ms, 77MB)
 * 테스트 13 〉	통과 (1.55ms, 83.8MB)
 * 테스트 14 〉	통과 (1.77ms, 78.1MB)
 * 테스트 15 〉	통과 (1.35ms, 73.8MB)
 * 채점 결과
 * 정확성: 100.0
 * 합계: 100.0 / 100.0
 */

class 로또최고최저순위 {
    public int[] solution(int[] lottos, int[] win_nums) {
        int zeroCnt = 0;
        int correctCnt = 0;

        List<Integer> winNumList = Arrays.stream(win_nums).boxed().collect(Collectors.toList());

        for(int i = 0; i<lottos.length; i++){
            if(lottos[i] == 0){
                zeroCnt++;
            } else if(winNumList.contains(lottos[i])){
                correctCnt ++;
            }
        }

        int lowestResult ;
        int highestResult;

        if(zeroCnt == 6){
            lowestResult = 6;
            highestResult = 1;
        }else if (zeroCnt + correctCnt < 2){
            lowestResult = highestResult = 6;
        } else {
            highestResult = 7 - zeroCnt - correctCnt;
            lowestResult = highestResult + zeroCnt;
        }

        int[] answer = {highestResult, lowestResult};

        return answer;
    }

}