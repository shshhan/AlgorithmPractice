package InflearnAlgorithm.Section01;

import java.util.Scanner;

/**
 * 설명
 *
 * N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.
 *
 *
 * 입력
 * 첫 줄에 자연수 N(3<=N<=20)이 주어집니다.
 *
 * 두 번째 줄부터 N개의 단어가 각 줄에 하나씩 주어집니다. 단어는 영어 알파벳으로만 구성되어 있습니다.
 *
 *
 * 출력
 * N개의 단어를 입력된 순서대로 한 줄에 하나씩 뒤집어서 출력합니다.
 */
public class 단어뒤집기 {

    /**
     * StringBuilder + charAt 활용
     * Time : 162ms
     * @param n
     * @param sc
     * @return
     */
    public static String solution1(int n, Scanner sc) {

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<n; i++) {
            String str = sc.next();
            for(int k=0; k<str.length(); k++) {
                sb.append(str.charAt(str.length()-k-1));
            }

            if (i != n-1) {
                sb.append("\n");
            }
        }

        return sb.toString();

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(solution1(n, sc));

    }
}
