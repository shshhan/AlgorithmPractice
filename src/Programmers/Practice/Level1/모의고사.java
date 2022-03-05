package Programmers.Practice.Level1;

/**
 * 2022.03.05
 * 정확성  테스트
 * 테스트 1 〉	통과 (0.02ms, 72.1MB)
 * 테스트 2 〉	통과 (0.01ms, 69.6MB)
 * 테스트 3 〉	통과 (0.02ms, 77.1MB)
 * 테스트 4 〉	통과 (0.02ms, 75.3MB)
 * 테스트 5 〉	통과 (0.02ms, 78MB)
 * 테스트 6 〉	통과 (0.02ms, 70.5MB)
 * 테스트 7 〉	통과 (0.49ms, 68.9MB)
 * 테스트 8 〉	통과 (0.12ms, 72.4MB)
 * 테스트 9 〉	통과 (0.52ms, 72MB)
 * 테스트 10 〉	통과 (0.26ms, 74.8MB)
 * 테스트 11 〉	통과 (0.58ms, 69.6MB)
 * 테스트 12 〉	통과 (0.52ms, 77.6MB)
 * 테스트 13 〉	통과 (0.04ms, 74.4MB)
 * 테스트 14 〉	통과 (0.60ms, 83.6MB)
 * 채점 결과
 * 정확성: 100.0
 * 합계: 100.0 / 100.0
 */

public class 모의고사 {
    public int[] solution(int[] answers) {
        int[] ary1 = {1, 2, 3, 4, 5};
        int[] ary2 = {2,1,2,3,2,4,2,5};
        int[] ary3 = {3,3,1,1,2,2,4,4,5,5};

        int[] cntAry = new int[3];

        for(int i = 0; i < answers.length; i++){
            if(answers[i] == ary1[i % ary1.length]){
                cntAry[0]++;
            }
            if(answers[i] == ary2[i % ary2.length]){
                cntAry[1]++;
            }
            if(answers[i] == ary3[i % ary3.length]){
                cntAry[2]++;
            }
        }

        int max = cntAry[0];
        int maxCnt = 1;

        for(int i = 1; i < cntAry.length; i++){
            if(max < cntAry[i]){
                max = cntAry[i];
                maxCnt = 1;
            } else if (max == cntAry[i]){
                maxCnt++;
            }
        }

        int[] answer = new int[maxCnt];
        int index = 0;

        for(int i = 0; i < cntAry.length; i++){
            if(cntAry[i] == max){
                answer[index] = i+1;
                index++;
            }
        }

        return answer;

    }
}
