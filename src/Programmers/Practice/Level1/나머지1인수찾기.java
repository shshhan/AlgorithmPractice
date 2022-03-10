package Programmers.Practice.Level1;

/**
 * 2022.03.10
 * 정확성  테스트
 * 테스트 1 〉	통과 (4.97ms, 77.2MB)
 * 테스트 2 〉	통과 (0.02ms, 74.6MB)
 * 테스트 3 〉	통과 (0.02ms, 73.8MB)
 * 테스트 4 〉	통과 (0.02ms, 79.1MB)
 * 테스트 5 〉	통과 (0.02ms, 72.1MB)
 * 테스트 6 〉	통과 (0.02ms, 75.1MB)
 * 테스트 7 〉	통과 (0.03ms, 77.2MB)
 * 테스트 8 〉	통과 (0.02ms, 66MB)
 * 테스트 9 〉	통과 (0.03ms, 72MB)
 * 테스트 10 〉	통과 (0.03ms, 74.1MB)
 * 테스트 11 〉	통과 (0.02ms, 74.9MB)
 * 채점 결과
 * 정확성: 100.0
 * 합계: 100.0 / 100.0
 *
 * 로직에서 n--;를 제거하고 if(n%i==1)로 변경했더니
 * 오히려 시간이 많게는 3배까지 더 오래걸렸다.
 * 나머지 연산의 결과를 0으로 계산하는게 더 빠르게 작동하는 것 같은데
 * 이부분에 대해서는 한번 알아봐야겠다.
 */

public class 나머지1인수찾기 {
    public int solution(int n) {
        n--;

        int i;
        for(i = 2; i <= n; i++){
            if(n%i == 0){
                break;
            }
        }

        return i;
    }
}
