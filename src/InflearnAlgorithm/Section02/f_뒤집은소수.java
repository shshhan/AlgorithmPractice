package InflearnAlgorithm.Section02;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 설명
 *
 * N개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면 그 소수를 출력하는 프로그램을 작성하세요.
 *
 * 예를 들어 32를 뒤집으면 23이고, 23은 소수이다. 그러면 23을 출력한다. 단 910를 뒤집으면 19로 숫자화 해야 한다.
 *
 * 첫 자리부터의 연속된 0은 무시한다.
 *
 *
 * 입력
 * 첫 줄에 자연수의 개수 N(3<=N<=100)이 주어지고, 그 다음 줄에 N개의 자연수가 주어진다.
 *
 * 각 자연수의 크기는 100,000를 넘지 않는다.
 *
 *
 * 출력
 * 첫 줄에 뒤집은 소수를 출력합니다. 출력순서는 입력된 순서대로 출력합니다.
 */
public class f_뒤집은소수 {

    /**
     * Integer.parseInt(StringBuilder.reversed())
     * 소수판정(반복문 + 나머지연산)
     * @param ary
     * @return
     */
    private static String solution1(int[] ary) {
        StringBuilder sb = new StringBuilder();

        for(int n : ary) {
            int reversedN = Integer.parseInt(
                    new StringBuilder(String.valueOf(n)).reverse().toString()
            );

            int flag = 1;
            for(int i=2; i<reversedN; i++) {
                if(reversedN%i == 0) {
                    flag = 0;
                }
            }

            if(flag == 1 && reversedN != 1) {
                sb.append(reversedN + " ");
            }
        }

        return sb.toString();
    }

    /**
     * 소수인지 판별하는 메서드
     * 소수이면 true, 소수가 아니면 false
     * @param n
     * @return
     */
    private static boolean isPrime(int n) {
        if(n == 1){
            return false;
        } else {
            for(int i=2; i<n; i++) {
                if(n%i == 0) {
                    return false;
                }
            }
        }

        return true;
    }

    /**
     * /, % 연산으로 숫자 뒤집기
     * @param ary
     * @return
     */
    private static ArrayList<Integer> solution2(int[] ary) {
        ArrayList<Integer> answerList = new ArrayList<>();

        for(int n : ary) {
            int temp = n;
            int reversed = 0;
            while(temp > 0) {
                int t = temp%10;
                reversed = reversed*10 + t;
                temp/=10;
            }

            if(isPrime(reversed)){
                answerList.add(reversed);
            }
        }

        return answerList;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] ary = new int[n];
        for(int i=0; i<n; i++) {
            ary[i] = sc.nextInt();
        }

//        System.out.println(solution1(ary));

        for(int number : solution2(ary)) {
            System.out.print(number + " ");
        }

    }
}
