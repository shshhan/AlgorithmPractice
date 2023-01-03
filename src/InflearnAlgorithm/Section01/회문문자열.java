package InflearnAlgorithm.Section01;


import java.util.Scanner;

/**
 * 설명
 *
 * 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 합니다.
 *
 * 문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES", 회문 문자열이 아니면 “NO"를 출력하는 프로그램을 작성하세요.
 *
 * 단 회문을 검사할 때 대소문자를 구분하지 않습니다.
 *
 *
 * 입력
 * 첫 줄에 길이 100을 넘지 않는 공백이 없는 문자열이 주어집니다.
 *
 *
 * 출력
 * 첫 번째 줄에 회문 문자열인지의 결과를 YES 또는 NO로 출력합니다.
 */
public class 회문문자열 {

    /**
     * toCharArray() 활용
     * Time : 157ms
     * @param str
     * @return
     */
    private static String solution1(String str) {
        boolean result = true;

        str = str.toLowerCase();
        char[] chars = str.toCharArray();
        int lt = 0;
        int rt = chars.length-1;

        while(lt < rt) {
            if(chars[lt] != chars[rt]){
                result = false;
                break;
            }
            lt++;
            rt--;
        }
        return result == true ? "YES" : "NO";
    }

    /**
     * charAt(i) 활용
     * Time : 159ms
     * @param str
     * @return
     */
    private static String solution2(String str) {
        boolean result = true;

        str = str.toLowerCase();
        for(int i=0; i<str.length()/2; i++) {
            if(str.charAt(i) != str.charAt(str.length()-i-1)) {
                result = false;
                break;
            }
        }

        return result == true ? "YES" : "NO";
    }

    /**
     * StringBuilder.reverse + compareToIgnoreCase
     * Time : 148ms
     * @param str
     * @return
     */
    public static String solution3(String str) {
        return str.compareToIgnoreCase(
                new StringBuilder(str).reverse().toString()
                ) == 0 ? "YES" : "NO";
    }

    /**
     * StringBuilder.reverse + equalsIgnoreCase
     * @param str
     * @return
     */
    public static String solution4(String str) {
        return str.equalsIgnoreCase(
                new StringBuilder(str).reverse().toString()
        ) == true ? "YES" : "NO";
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(solution4(str));

    }

}
