package Programmers.Practice.Level1;

/**
 * 2022.03.08
 * 정확성  테스트
 * 테스트 1 〉	통과 (2.53ms, 73.5MB)
 * 테스트 2 〉	통과 (1.01ms, 70.2MB)
 * 테스트 3 〉	통과 (1.07ms, 77.5MB)
 * 테스트 4 〉	통과 (1.10ms, 72.8MB)
 * 테스트 5 〉	통과 (1.40ms, 80.6MB)
 * 테스트 6 〉	통과 (1.11ms, 73.9MB)
 * 테스트 7 〉	통과 (1.24ms, 77.1MB)
 * 테스트 8 〉	통과 (1.44ms, 79.7MB)
 * 테스트 9 〉	통과 (1.73ms, 74MB)
 * 테스트 10 〉	통과 (2.13ms, 77.9MB)
 * 테스트 11 〉	통과 (3.34ms, 76.2MB)
 * 테스트 12 〉	통과 (3.95ms, 77.5MB)
 * 테스트 13 〉	통과 (4.29ms, 72.6MB)
 * 테스트 14 〉	통과 (7.49ms, 68.9MB)
 * 테스트 15 〉	통과 (6.30ms, 80.6MB)
 * 테스트 16 〉	통과 (10.11ms, 80.4MB)
 * 테스트 17 〉	통과 (12.84ms, 89.2MB)
 * 테스트 18 〉	통과 (14.57ms, 95.1MB)
 * 테스트 19 〉	통과 (12.31ms, 92.3MB)
 * 테스트 20 〉	통과 (16.85ms, 95.2MB)
 * 채점 결과
 * 정확성: 100.0
 * 합계: 100.0 / 100.0
 *
 *
 * 성능개선!
 * Arrays.stream.max().getAsInt() 등의 메서드 대신
 * 단순 비교로 로직 변경 후 비약적인 속도 향상 성공
 *
 * 2022.03.08
 * 정확성  테스트
 * 테스트 1 〉	통과 (0.01ms, 73.4MB)
 * 테스트 2 〉	통과 (0.01ms, 79.7MB)
 * 테스트 3 〉	통과 (0.02ms, 75.3MB)
 * 테스트 4 〉	통과 (0.02ms, 71.5MB)
 * 테스트 5 〉	통과 (0.02ms, 68.6MB)
 * 테스트 6 〉	통과 (0.02ms, 72.9MB)
 * 테스트 7 〉	통과 (0.02ms, 74.4MB)
 * 테스트 8 〉	통과 (0.02ms, 82.8MB)
 * 테스트 9 〉	통과 (0.02ms, 72.1MB)
 * 테스트 10 〉	통과 (0.03ms, 73.7MB)
 * 테스트 11 〉	통과 (0.03ms, 77.7MB)
 * 테스트 12 〉	통과 (0.05ms, 76.5MB)
 * 테스트 13 〉	통과 (0.08ms, 74.8MB)
 * 테스트 14 〉	통과 (0.23ms, 76.1MB)
 * 테스트 15 〉	통과 (0.33ms, 82.5MB)
 * 테스트 16 〉	통과 (0.56ms, 84.7MB)
 * 테스트 17 〉	통과 (0.74ms, 78.6MB)
 * 테스트 18 〉	통과 (0.72ms, 80.9MB)
 * 테스트 19 〉	통과 (0.95ms, 93.4MB)
 * 테스트 20 〉	통과 (1.31ms, 81.2MB)
 * 채점 결과
 * 정확성: 100.0
 * 합계: 100.0 / 100.0
 */

public class 최소직사각형 {
    public int solution(int[][] sizes) {
        int max = 0;
        int min = 0;

        int tempMax = 0;
        int tempMin = 0;

        for (int[] eachSize : sizes){
            if(eachSize[0] > eachSize[1]){
                tempMax = eachSize[0];
                tempMin = eachSize[1];
            } else {
                tempMax = eachSize[1];
                tempMin = eachSize[0];
            }

            if(max < tempMax){
                max = tempMax;
            }
            if(min < tempMin){
                min = tempMin;
            }
        }


        return max*min;
    }
}
