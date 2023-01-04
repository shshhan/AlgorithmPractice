package InflearnAlgorithm.Section01;

import java.util.Scanner;

/**
 * 설명
 *
 * 한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.
 *
 * 문장속의 각 단어는 공백으로 구분됩니다.
 *
 *
 * 입력
 * 첫 줄에 길이가 100을 넘지 않는 한 개의 문장이 주어집니다. 문장은 영어 알파벳으로만 구성되어 있습니다.
 *
 *
 * 출력
 * 첫 줄에 가장 긴 단어를 출력한다. 가장 길이가 긴 단어가 여러개일 경우 문장속에서 가장 앞쪽에 위치한
 * 단어를 답으로 합니다.
 */
public class c_문장속단어 {

    /**
     * split 활용
     * Time : 150ms
     * @param str
     * @return
     */
    public static String solution1(String str) {
        String result = "";
        int biggestLength = 0;

        String[] strAry = str.split(" ");
        for(String s : strAry) {
            if(s.length() > biggestLength) {
                biggestLength = s.length();
                result = s;
            }
        }

        return result;
    }

    /**
     * index of + substring 사용
     * Time : 160ms
     * @param str
     * @return
     */
    public static String solution2(String str) {
        String result = "";
        int biggestLength = Integer.MIN_VALUE;
        int pos;

        while((pos = str.indexOf(" ")) != -1) {
            String tempStr = str.substring(0, pos);

            if(tempStr.length() > biggestLength) {
                biggestLength = tempStr.length();
                result = tempStr;
            }

            str = str.substring(pos+1);
        }

        if(str.length() > biggestLength) {
            result = str;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(solution1(str));
        System.out.println(solution2(str));

    }
}
