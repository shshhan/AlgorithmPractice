package Programmers.SkillCheck.Level1;

/**
 * 총점 : 39.1 / 50.0
 * 처음으로 프로그래머스 문제풀이를 시도해봤다.
 * 특별한 준비없이 처음이었어서 어떤 문제가 있어서 만점을 받지 못하는지 파악도 되지 않았다.
 * 그동안 웹 개발만 하다보니 온전한 자바 프로그래밍이 낯설기도 했다.
 * 앞으로 알고리즘 공부도 계속 해나가야겠다.
 */
public class Day01_2 {
    public long solution(int price, int money, int count) {
        long answer = -1;

        int total = 0;

        for(int i = 0; i < count; i++){
            total += price * (i+1);
        }

        if (money < total){
            answer = total - money;
        } else {
            answer = 0;
        }

        return answer;
    }
}
