package InflearnAlgorithm.Section01;

import java.util.Scanner;

/**
 * 설명
 *
 * 대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.
 *
 *
 * 입력
 * 첫 줄에 문자열이 입력된다. 문자열의 길이는 100을 넘지 않습니다.
 *
 * 문자열은 영어 알파벳으로만 구성되어 있습니다.
 *
 *
 * 출력
 * 첫 줄에 대문자는 소문자로, 소문자는 대문자로 변환된 문자열을 출력합니다.
 */
public class 대소문자변환 {
    /**
     * StringBuilder를 활용
     * Time : 148ms
     * @param str
     * @return
     */
    public static String solution1(String str) {
        StringBuilder sb = new StringBuilder();

        for(char c : str.toCharArray()) {
            if(Character.isLowerCase(c)){
                sb.append(Character.toUpperCase(c));
            } else {
                sb.append(Character.toLowerCase(c));
            }
        }
        return sb.toString();
    }

    /**
     * String에 + 연산
     * Time : 157ms
     * @param str
     * @return
     */
    public static String solution2(String str) {
        String result = "";

        for (char c : str.toCharArray()) {
            if (Character.isLowerCase(c)) {
                result += Character.toUpperCase(c);
            } else {
                result += Character.toLowerCase(c);
            }
        }
        return result;
    }

    /**
     * 아스키 코드 활용. 소문자 65 ~ 90 / 대문자 97 ~ 122
     * Time : 165ms
     * @param str
     * @return
     */
    public static String solution3(String str) {
        StringBuilder sb = new StringBuilder();

        for(char c : str.toCharArray()) {
            if(c >= 97 && c <= 122) {
                sb.append((char)(c -= 32));
            } else {
                sb.append((char)(c += 32));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(solution1(str));
        System.out.println(solution2(str));
        System.out.println(solution3(str));

    }
}
