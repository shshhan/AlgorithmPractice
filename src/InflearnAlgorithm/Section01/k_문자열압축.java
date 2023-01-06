package InflearnAlgorithm.Section01;


import java.util.Scanner;

/**
 * 설명
 *
 * 알파벳 대문자로 이루어진 문자열을 입력받아 같은 문자가 연속으로 반복되는 경우 반복되는
 *
 * 문자 바로 오른쪽에 반복 횟수를 표기하는 방법으로 문자열을 압축하는 프로그램을 작성하시오.
 *
 * 단 반복횟수가 1인 경우 생략합니다.
 *
 *
 * 입력
 * 첫 줄에 문자열이 주어진다. 문자열의 길이는 100을 넘지 않는다.
 *
 *
 * 출력
 * 첫 줄에 압축된 문자열을 출력한다.
 */
public class k_문자열압축 {

    /**
     * 문자열 마지막에 공백을 추가하여 마지막 문자 해결
     * @param str
     * @return
     */
    private static String solution1(String str) {
        StringBuilder sb = new StringBuilder();
        String s = str + " ";

        int count = 1;

        for(int i=1; i<s.length(); i++) {

            if(s.charAt(i-1) == s.charAt(i)){
                count++;
            } else {
                sb.append(s.charAt(i-1));
                if(count>1){
                    sb.append(count);
                }
                count = 1;
            }
        }

        return sb.toString();

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(solution1(str));
    }

}
