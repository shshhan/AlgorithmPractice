package Programmers.Practice.Level1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/**
 * 2022.02.26
 * 정확성  테스트
 * 테스트 1 〉	통과 (2.58ms, 73.2MB)
 * 테스트 2 〉	통과 (2.97ms, 75.7MB)
 * 테스트 3 〉	실패 (시간 초과)
 * 테스트 4 〉	통과 (3.83ms, 77.9MB)
 * 테스트 5 〉	통과 (2.99ms, 73.6MB)
 * 테스트 6 〉	통과 (10.71ms, 89.3MB)
 * 테스트 7 〉	통과 (34.58ms, 93.3MB)
 * 테스트 8 〉	통과 (68.08ms, 102MB)
 * 테스트 9 〉	통과 (5986.38ms, 414MB)
 * 테스트 10 〉	통과 (100.61ms, 148MB)
 * 테스트 11 〉	실패 (시간 초과)
 * 테스트 12 〉	통과 (27.28ms, 93MB)
 * 테스트 13 〉	통과 (8.44ms, 69.2MB)
 * 테스트 14 〉	통과 (8172.71ms, 401MB)
 * 테스트 15 〉	통과 (518.01ms, 341MB)
 * 테스트 16 〉	통과 (10.77ms, 78.5MB)
 * 테스트 17 〉	통과 (6.07ms, 69.6MB)
 * 테스트 18 〉	통과 (27.54ms, 97.3MB)
 * 테스트 19 〉	통과 (39.38ms, 99.2MB)
 * 테스트 20 〉	통과 (7404.15ms, 415MB)
 * 테스트 21 〉	실패 (시간 초과)
 * 테스트 22 〉	통과 (3.72ms, 82.4MB)
 * 테스트 23 〉	통과 (3.45ms, 82.3MB)
 * 테스트 24 〉	통과 (2.87ms, 76.7MB)
 * 채점 결과
 * 정확성: 87.5
 * 합계: 87.5 / 100.0
 */

public class 신고결과받기 {
    public static void main(String[] args) {

        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
        int k = 2;

        HashMap<String, Integer> reportCnt = new HashMap<>();
        HashSet<String> fromTo = new HashSet<>(Arrays.asList(report));
        HashMap<String, Integer> mailCnt = new HashMap<>();

        for (int i = 0; i < id_list.length; i++) {
            reportCnt.put(id_list[i], 0);
            mailCnt.put(id_list[i], 0);
        }

        System.out.println(reportCnt);

        fromTo.forEach(str -> {
            String[] reportContent = str.split(" ");
            reportCnt.replace(reportContent[1], reportCnt.get(reportContent[1]) + 1);
        });

        reportCnt.forEach( (key, value) -> {
            if(value >= k){
                fromTo.forEach( el -> {
                    String[] str = el.split(" ");
                    if(str[1].equals(key)){
                        mailCnt.replace(str[0], mailCnt.get(str[0]) + 1);
                    }
                });
            }
        });

        System.out.println(reportCnt);
        System.out.println(mailCnt);
        System.out.println(mailCnt);

        int[] answer = new int[id_list.length];

        for(int i=0; i<id_list.length; i++){
            answer[i] = mailCnt.get(id_list[i]);
        }

    }
}
