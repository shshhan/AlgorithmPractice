package Programmers.Practice.Level1;

/**
 * 2022.03.04
 * 정확성  테스트
 * 테스트 1 〉	통과 (0.51ms, 72.4MB)
 * 테스트 2 〉	통과 (0.65ms, 81.5MB)
 * 테스트 3 〉	통과 (0.30ms, 74.8MB)
 * 테스트 4 〉	통과 (1.57ms, 88.1MB)
 * 테스트 5 〉	통과 (1.08ms, 71.2MB)
 * 테스트 6 〉	통과 (9.66ms, 70.5MB)
 * 테스트 7 〉	통과 (0.23ms, 86.9MB)
 * 테스트 8 〉	통과 (4.54ms, 66.5MB)
 * 테스트 9 〉	통과 (0.69ms, 76.4MB)
 * 테스트 10 〉	통과 (4.55ms, 73.2MB)
 * 테스트 11 〉	통과 (0.08ms, 77.9MB)
 * 테스트 12 〉	통과 (0.04ms, 79.1MB)
 * 테스트 13 〉	통과 (0.05ms, 68MB)
 * 테스트 14 〉	통과 (0.03ms, 73.9MB)
 * 테스트 15 〉	통과 (0.03ms, 71.2MB)
 * 테스트 16 〉	통과 (9.52ms, 76MB)
 * 테스트 17 〉	통과 (0.96ms, 72.7MB)
 * 테스트 18 〉	통과 (0.41ms, 78.3MB)
 * 테스트 19 〉	통과 (0.06ms, 72MB)
 * 테스트 20 〉	통과 (12.09ms, 68.5MB)
 * 테스트 21 〉	통과 (10.70ms, 77MB)
 * 테스트 22 〉	통과 (0.24ms, 76.5MB)
 * 테스트 23 〉	통과 (0.03ms, 73.7MB)
 * 테스트 24 〉	통과 (9.08ms, 76.2MB)
 * 테스트 25 〉	통과 (12.68ms, 73.2MB)
 * 테스트 26 〉	통과 (0.01ms, 71.7MB)
 * 채점 결과
 * 정확성: 100.0
 * 합계: 100.0 / 100.0
 */
public class 소수만들기 {
    public int solution(int[] nums) {

        int primeNumCnt = 0;

        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                for(int k = j+1; k < nums.length; k++){
                    if(isPrimeNum(nums[i] + nums[j] + nums[k])){
                        primeNumCnt++;
                    }
                }
            }
        }

        return primeNumCnt;

    }

    public boolean isPrimeNum(int sum){
        for(int i = 2; i < sum; i++){
            if(sum%i == 0){
                return false;
            }
        }

        return true;

    }
}
