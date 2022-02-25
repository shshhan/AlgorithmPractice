package Programmers.SkillCheck.Level1;

/**
 * 총점 : 50.0 / 50.0
 */
public class Day01_1 {
    boolean solution(String s) {
        boolean answer = true;

        int pCnt = 0;
        int yCnt = 0;

        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == 'p'|| s.charAt(i) == 'P'){
                pCnt++;
            }else if (s.charAt(i) == 'y'|| s.charAt(i) == 'Y'){
                yCnt++;
            }
        }

        answer = pCnt == yCnt;

        return answer;
    }
}
