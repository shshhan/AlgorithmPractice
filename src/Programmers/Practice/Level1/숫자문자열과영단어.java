package Programmers.Practice.Level1;

/**
 * 2022.03.01
 * 정확성  테스트
 * 테스트 1 〉	통과 (0.21ms, 77.1MB)
 * 테스트 2 〉	통과 (0.18ms, 74.2MB)
 * 테스트 3 〉	통과 (0.22ms, 78.4MB)
 * 테스트 4 〉	통과 (0.20ms, 72MB)
 * 테스트 5 〉	통과 (0.46ms, 71.9MB)
 * 테스트 6 〉	통과 (0.30ms, 74.6MB)
 * 테스트 7 〉	통과 (0.36ms, 74.4MB)
 * 테스트 8 〉	통과 (0.37ms, 75.3MB)
 * 테스트 9 〉	통과 (0.45ms, 73.9MB)
 * 테스트 10 〉	통과 (0.04ms, 75.9MB)
 * 채점 결과
 * 정확성: 100.0
 * 합계: 100.0 / 100.0
 */

class 숫자문자열과영단어 {
    public int solution(String s) {
        String[] engNum = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "zero"};

        for(int i = 0; i<engNum.length; i++){
            if(s.contains(engNum[i])){
                s = s.replaceAll(engNum[i], String.valueOf(i));
            }
        }

        int answer = Integer.parseInt(s);
        return answer;
    }
}