package InflearnAlgorithm.Section02;

import java.util.Scanner;

/**
 * 설명
 *
 * N명의 학생의 국어점수가 입력되면 각 학생의 등수를 입력된 순서대로 출력하는 프로그램을 작성하세요.
 *
 * 같은 점수가 입력될 경우 높은 등수로 동일 처리한다.
 *
 * 즉 가장 높은 점수가 92점인데 92점이 3명 존재하면 1등이 3명이고 그 다음 학생은 4등이 된다.
 *
 *
 * 입력
 * 첫 줄에 N(3<=N<=100)이 입력되고, 두 번째 줄에 국어점수를 의미하는 N개의 정수가 입력된다.
 *
 *
 * 출력
 * 입력된 순서대로 등수를 출력한다.
 */
public class h_등수구하기 {

    /**
     * 반복문에서 나보다 큰 수 갯수 구하기
     * @param ary
     * @return
     */
    private static int[] solution1(int[] ary) {
        int[] rankAry = new int[ary.length];

        for(int i=0; i<ary.length; i++) {
            int cnt = 1;
            for(int j=0; j<ary.length; j++) {
                if(ary[i] < ary[j]) {
                    cnt++;
                }
            }
            rankAry[i] = cnt;
        }
        return rankAry;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] ary = new int[n];
        for (int i = 0; i < n; i++) {
            ary[i] = sc.nextInt();
        }

        for(int x : solution1(ary)){
            System.out.print(x + " ");
        }
    }
}
