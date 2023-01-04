package InflearnAlgorithm.Section01;


import java.util.Scanner;

/**
 * 설명
 *
 * 한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.
 *
 *
 * 입력
 * 첫 번째 줄에 문자열 s와 문자 t가 주어진다. 문자열과 문자는 소문자로만 주어집니다.
 *
 * 문자열의 길이는 100을 넘지 않는다.
 *
 *
 * 출력
 * 첫 번째 줄에 각 문자열 s의 각 문자가 문자 t와 떨어진 거리를 순서대로 출력한다.
 */
public class j_가장짧은문자거리 {

    /**
     * 처음 -> 끝, 끝 -> 처음으로 두번 반복, 대입값은 매 반복시 최대값으로 설정.
     * 처음 -> 끝 : 문자가 다르면 부터 1씩 증가하며 대입, 문자가 같으면 대입값 0으로 초기화 후 대입
     * 끝 -> 처음 : 문자가 다르면 해당 값과 대입값 중 더 작은 값을 대입, 문자가 같으면 대입값 0으로 초기화
     * @param str
     * @param target
     * @return
     */
    private static String solution1(String str, char target) {
        int strLength = str.length();
        int[] result = new int[strLength];

        int number = 100;   //가장 큰 값

        for(int i = 0; i<strLength; i++) {
            if(str.charAt(i) == target) {
                number = 0;
            }
            result[i] = number++;
        }

        number = 100;

        for(int i=strLength-1; i>=0; i--) {
            if(str.charAt(i) == target) {
                number = 0;
            } else if(result[i]>number) {
                result[i] = ++number;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int n : result) {
            sb.append(n).append(" ");
        }

        return sb.deleteCharAt(sb.length()-1).toString();

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);

        System.out.println(solution1(str, c));
    }

}
