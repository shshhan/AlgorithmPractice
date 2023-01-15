package InflearnAlgorithm.Section02;

import java.util.Scanner;

/**
 * 설명
 *
 * 자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요.
 *
 * 만약 20이 입력되면 1부터 20까지의 소수는 2, 3, 5, 7, 11, 13, 17, 19로 총 8개입니다.
 *
 *
 * 입력
 * 첫 줄에 자연수의 개수 N(2<=N<=200,000)이 주어집니다.
 *
 *
 * 출력
 * 첫 줄에 소수의 개수를 출력합니다.
 */
public class e_소수 {

    /**
     * 입력받은 수까지의 배열 생성(n+1)
     * 배열 원소의 값은 모두 0
     * 2부터 순서대로 체크하며 값이 0 이면 소수
     * 소수로 체크되면 해당 수의 배수의 값을 1로 변경
     * @param n
     * @return
     */
    private static int solution1(int n) {
        int answer = 0;

        int[] ary = new int[n+1];
        for(int i=2; i<=n; i++) {
            if(ary[i] == 0 ) {
                answer++;
                for(int j=i;j<=n;j+=i) {
                    ary[j] = 1;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(solution1(n));

    }
}
