package InflearnAlgorithm.Section02;

import java.util.Scanner;

/**
 * 설명
 *
 * 1) 피보나키 수열을 출력한다. 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열이다.
 *
 * 2) 입력은 피보나치 수열의 총 항의 수 이다. 만약 7이 입력되면 1 1 2 3 5 8 13을 출력하면 된다.
 *
 *
 * 입력
 * 첫 줄에 총 항수 N(3<=N<=45)이 입력된다.
 *
 *
 * 출력
 * 첫 줄에 피보나치 수열을 출력합니다.
 */
public class d_피보나치수열 {

    /**
     * 배열 활용
     * @param n
     * @return
     */
    private static int[] solution1(int n) {
        int[] result = new int[n];
        result[0] = 1;
        result[1] = 1;

        for(int i=2; i<n; i++) {
            result[i] = result[i-2] + result[i-1];
        }

        return result;
    }

    /**
     * 배열없이 변수 세개로 직접 출력
     * @param n
     */
    private static void solution2(int n) {
        int a = 1;
        int b = 1;
        System.out.print(a + " " + b + " ");

        int c;

        for(int i=2; i<n; i++) {
            c = a+b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int x : solution1(n)) {
            System.out.print(x + " ");
        }

        solution2(n);
    }
}
