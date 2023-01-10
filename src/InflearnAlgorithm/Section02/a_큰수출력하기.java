package InflearnAlgorithm.Section02;

import java.util.Scanner;

/**
 * 설명
 *
 * N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요.
 *
 * (첫 번째 수는 무조건 출력한다)
 *
 *
 * 입력
 * 첫 줄에 자연수 N(1<=N<=100)이 주어지고, 그 다음 줄에 N개의 정수가 입력된다.
 *
 *
 * 출력
 * 자신의 바로 앞 수보다 큰 수만 한 줄로 출력한다.
 */
public class a_큰수출력하기 {

    /**
     * 단순 반복문 + 비교
     * @param intAry
     */
    private static void solution1(int[] intAry) {
        System.out.print(intAry[0] + " ");
        for(int i=1; i<intAry.length; i++) {
            if(intAry[i] > intAry[i-1]) {
                System.out.print(intAry[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] intAry = new int[n];
        for(int i=0; i<n; i++) {
            intAry[i] = sc.nextInt();
        }

        solution1(intAry);
    }
}
