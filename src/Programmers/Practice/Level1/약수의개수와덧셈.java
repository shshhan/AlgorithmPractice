package Programmers.Practice.Level1;

/**
 * 2022.03.07
 * 정확성  테스트
 * 테스트 1 〉	통과 (0.59ms, 75.1MB)
 * 테스트 2 〉	통과 (0.14ms, 76.8MB)
 * 테스트 3 〉	통과 (0.17ms, 75.1MB)
 * 테스트 4 〉	통과 (0.05ms, 77.8MB)
 * 테스트 5 〉	통과 (0.45ms, 75.9MB)
 * 테스트 6 〉	통과 (0.10ms, 74.8MB)
 * 테스트 7 〉	통과 (0.06ms, 79.4MB)
 * 채점 결과
 * 정확성: 100.0
 * 합계: 100.0 / 100.0
 *
 * 약수를 구하려는 수 n의 제곱근까지의 약수를 구한 뒤
 * 이 약수들과 n을 나눈 몫이 n의 모든 약수.
 * ==> n의 제곱근까지의 약수를 구한 뒤 *2하고 혹시 이 중 n의 제곱근이 있다면 -1 해주기
 */
public class 약수의개수와덧셈 {
    public int solution(int left, int right) {
        int answer = 0;

        for(int i = left; i <= right; i++){
            int cnt = 0;

            for(int j = 1; j*j <= i; j++){
                if(i%j == 0){
                    cnt += 2;

                    if(i/j == Math.sqrt(i)){
                        cnt--;
                    }
                }
            }

            answer = cnt % 2 == 0 ? answer + i : answer - i;

        }

        return answer;
    }

}
