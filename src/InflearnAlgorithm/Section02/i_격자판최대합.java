package InflearnAlgorithm.Section02;

import java.util.Scanner;

/**
 * 설명
 *
 * 5*5 격자판에 아래롸 같이 숫자가 적혀있습니다.
 *
 * Image1.jpg
 *
 * N*N의 격자판이 주어지면 각 행의 합, 각 열의 합, 두 대각선의 합 중 가 장 큰 합을 출력합니다.
 *
 *
 * 입력
 * 첫 줄에 자연수 N이 주어진다.(2<=N<=50)
 *
 * 두 번째 줄부터 N줄에 걸쳐 각 줄에 N개의 자연수가 주어진다. 각 자연수는 100을 넘지 않는다.
 *
 *
 * 출력
 * 최대합을 출력합니다.
 */
public class i_격자판최대합 {


    /**
     * 2중 for 문 + 각 행, 열의 합 최대값 비교
     * 마지막에 대각선 값 비교
     * @param n
     * @param ary
     * @return
     */
    private static int solution1(int n, int[][] ary) {
        int max = 0;
        int sumLeftToRight = 0;
        int sumRightToLeft = 0;

        for (int i=0; i<ary.length; i++) {
            int sum1 = 0;
            int sum2 = 0;

            for(int j=0; j<ary[0].length; j++) {
                sum1 += ary[i][j];
                sum2 += ary[j][i];
                if(i==j) {
                    sumLeftToRight += ary[i][j];
                }
                if(i+j == n) {
                    sumRightToLeft += ary[i][j];
                }
            }
            max = Math.max(max, Math.max(sum1, sum2));
        }

        return Math.max(max,Math.max(sumLeftToRight, sumRightToLeft));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] ary = new int[n][n];
        for (int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                ary[i][j] = sc.nextInt();
            }
        }

        System.out.println(solution1(n, ary));

    }
}
