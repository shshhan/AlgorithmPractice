package InflearnAlgorithm.Section01;


import java.util.Scanner;

/**
 * 설명
 *
 * 문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫자만 추출하여 그 순서대로 자연수를 만듭니다.
 *
 * 만약 “tge0a1h205er”에서 숫자만 추출하면 0, 1, 2, 0, 5이고 이것을 자연수를 만들면 1205이 됩니다.
 *
 * 추출하여 만들어지는 자연수는 100,000,000을 넘지 않습니다.
 *
 *
 * 입력
 * 첫 줄에 숫자가 섞인 문자열이 주어집니다. 문자열의 길이는 100을 넘지 않습니다.
 *
 *
 * 출력
 * 첫 줄에 자연수를 출력합니다.
 */
public class i_숫자만추출 {

    /**
     * replaceAll() 활용
     * @param str
     * @return
     */
    private static int solution1(String str) {
        return Integer.parseInt(str.toLowerCase().replaceAll("[a-z]", ""));

    }

    /**
     * char 아스키 값 비교
     * @param str
     * @return
     */
    private static int solution2(String str) {
        StringBuilder sb = new StringBuilder();
        for(char c : str.toCharArray()) {
            if(c >= '0' && c <= '9') {
                sb.append(c);
            }
        }
        return Integer.parseInt(sb.toString());
    }

    /**
     * 숫자 아스키 코드 값 48 ~ 57 활용
     * @param str
     * @return
     */
    private static int solution3(String str) {
        int answer = 0;
        for(char c : str.toCharArray()) {
            if(c >= 48 && c <= 57) {
                answer = answer*10+(c-48);  //c-48 => 숫자 문자의 숫자 값
            }
        }

        return answer;
    }

    /**
     * Chracter.isDigit() 활용
     * @param str
     * @return
     */
    private static int solution4(String str) {
        int answer = 0;
        for(char c : str.toCharArray()) {
            if(Character.isDigit(c)) {
                answer = answer*10+(c-48);  //c-48 => 숫자 문자의 숫자 값
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(solution4(str));
    }

}
