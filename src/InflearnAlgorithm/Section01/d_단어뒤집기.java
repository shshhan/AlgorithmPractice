package InflearnAlgorithm.Section01;

import java.util.ArrayList;
import java.util.List;
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
public class d_단어뒤집기 {

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

    /**
     * ArrayList + StringiBuilder.reverse 활용
     * Time : 172ms
     * @param strAry
     * @return
     */
    public static List<String> solution2(String[] strAry) {
        List<String> stringList = new ArrayList<>();
        for(String s : strAry){
            stringList.add(new StringBuilder(s).reverse().toString());
        }

        return stringList;
    }

    /**
     * ArrayList + 뒤집기 알고리즘 직접 구현 활용
     * Time : 153ms
     * @param strAry
     * @return
     */
    public static ArrayList<String> solution3(String[] strAry) {
        ArrayList<String> stringList = new ArrayList<>();

        for(String s : strAry) {
            char[] charAry = s.toCharArray();
            int lt = 0;
            int rt = charAry.length-1;

            while(lt < rt) {
                char temp = charAry[lt];
                charAry[lt] = charAry[rt];
                charAry[rt] = temp;
                lt++;
                rt--;
            }
            stringList.add(String.valueOf(charAry));
        }

        return stringList;
    }

    /**
     * StringBuilder + 뒤집기 알고리즘 직접 구현
     * Time : 159ms
     * ArrayList보다 StringBuilder가 더 빠를 것이라고 예상했는데 근소하게 ArrayList가 더 빠르다
     * @param strAry
     * @return
     */
    public static String solution4(String[] strAry) {
        StringBuilder sb = new StringBuilder();

        for(String s : strAry) {
            char[] charAry = s.toCharArray();
            int lt = 0;
            int rt = charAry.length-1;

            while(lt < rt) {
                char temp = charAry[lt];
                charAry[lt] = charAry[rt];
                charAry[rt] = temp;
                lt++;
                rt--;
            }
            sb.append(String.valueOf(charAry));
            sb.append("\n");
        }
        sb.deleteCharAt(sb.length()-1);

        return sb.toString();
    }


    /**
     * solution3 기준 forEach 355ms , enhanced For 153ms
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        //        System.out.println(solution1(n, sc));

        String[] strAry = new String[n];
        for(int i=0; i<n; i++){
            strAry[i] = sc.next();
        }

//        for(String s : solution3(strAry)) {
//            System.out.println(s);
//        }
//        solution3(strAry).forEach(s -> System.out.println(s)); //시간에 불리함

        System.out.println(solution4(strAry));

    }
}
