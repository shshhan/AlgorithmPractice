package Programmers.Practice.Level1;
/**
    2022.02.28
        테스트 1 〉	통과 (0.44ms, 76.2MB)
        테스트 2 〉	통과 (1.57ms, 78MB)
        테스트 3 〉	통과 (2.08ms, 74.4MB)
        테스트 4 〉	통과 (0.50ms, 73.2MB)
        테스트 5 〉	통과 (0.50ms, 74.1MB)
        테스트 6 〉	통과 (0.74ms, 75.1MB)
        테스트 7 〉	통과 (0.47ms, 76.6MB)
        테스트 8 〉	통과 (0.49ms, 82.5MB)
        테스트 9 〉	통과 (1.53ms, 70.4MB)
        테스트 10 〉	통과 (0.45ms, 78.5MB)
        테스트 11 〉	통과 (0.49ms, 84.7MB)
        테스트 12 〉	통과 (0.66ms, 74.7MB)
        테스트 13 〉	통과 (1.54ms, 74MB)
        테스트 14 〉	통과 (0.56ms, 75.6MB)
        테스트 15 〉	통과 (0.55ms, 75.4MB)
        테스트 16 〉	통과 (0.88ms, 76.5MB)
        테스트 17 〉	통과 (1.75ms, 76.9MB)
        테스트 18 〉	통과 (2.54ms, 73.9MB)
        테스트 19 〉	통과 (3.53ms, 73.8MB)
        테스트 20 〉	통과 (1.56ms, 75MB)
        테스트 21 〉	통과 (2.77ms, 81.6MB)
        테스트 22 〉	통과 (2.62ms, 82.5MB)
        테스트 23 〉	통과 (4.29ms, 68.7MB)
        테스트 24 〉	통과 (3.57ms, 75.6MB)
        테스트 25 〉	통과 (2.79ms, 76.2MB)
        테스트 26 〉	통과 (3.05ms, 71.5MB)
        채점 결과
        정확성: 100.0
        합계: 100.0 / 100.0
**/
class Solution {
    public String solution(String new_id) {

        new_id = new_id.toLowerCase();

        String regEx = "[^\\w\\-_.]*";
        new_id = new_id.replaceAll(regEx, "");

        regEx = "[.]{2,}";
        new_id = new_id.replaceAll(regEx,".");

        regEx = "^[.]|[.]$}";
        new_id = new_id.replaceAll(regEx,"");

        if(new_id.isEmpty()){
            new_id = "a";
        }

        if(new_id.length() > 15){
            new_id = new_id.substring(0, 15);
        }
        new_id = new_id.replaceAll("[.]$", "");

        while(new_id.length()<=2){
            new_id = new_id + new_id.substring(new_id.length()-1, new_id.length());
        }

        return new_id;
    }
}
