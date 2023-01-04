package InflearnAlgorithm.Section01;


import java.util.ArrayList;
import java.util.Scanner;

/**
 * 설명
 *
 * 소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.
 *
 * 중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.
 *
 *
 * 입력
 * 첫 줄에 문자열이 입력됩니다. 문자열의 길이는 100을 넘지 않는다.
 *
 *
 * 출력
 * 첫 줄에 중복문자가 제거된 문자열을 출력합니다.
 */
public class f_중복문자제거 {

    /**
     * ArrayList를 순회하며 중복 조회
     * Time : 163ms
     * @param str
     * @return
     */
    private static String solution1(String str) {
        ArrayList<Character> list= new ArrayList<>();

        for(int i=0; i<str.length(); i++) {
            if(!list.contains(str.charAt(i))) {
                list.add(str.charAt(i));
            }
        }

        StringBuilder sb = new StringBuilder();
        for(char c : list) {
            sb.append(c);
        }
        return sb.toString();


    }

    /**
     * indexOf(charAt(i)) == i 활용
     * Time : 153ms
     * @param str
     * @return
     */
    private static String solution2(String str) {
        StringBuilder sb = new StringBuilder();
        for(int i =0; i<str.length(); i++) {
            if(str.indexOf(str.charAt(i)) == i ) {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(solution2(str));

    }

}
