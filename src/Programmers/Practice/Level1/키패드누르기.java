package Programmers.Practice.Level1;

/**
 * 2022.03.01
 * 정확성  테스트
 * 테스트 1 〉	통과 (11.49ms, 78.6MB)
 * 테스트 2 〉	통과 (9.50ms, 76.5MB)
 * 테스트 3 〉	통과 (8.68ms, 80.7MB)
 * 테스트 4 〉	통과 (8.01ms, 76.1MB)
 * 테스트 5 〉	통과 (12.19ms, 78.9MB)
 * 테스트 6 〉	통과 (12.46ms, 82.8MB)
 * 테스트 7 〉	통과 (10.34ms, 86.2MB)
 * 테스트 8 〉	통과 (9.46ms, 75.7MB)
 * 테스트 9 〉	통과 (8.38ms, 72.5MB)
 * 테스트 10 〉	통과 (12.75ms, 77.6MB)
 * 테스트 11 〉	통과 (12.81ms, 78.9MB)
 * 테스트 12 〉	통과 (9.61ms, 77.1MB)
 * 테스트 13 〉	통과 (14.51ms, 84.8MB)
 * 테스트 14 〉	통과 (17.63ms, 78.9MB)
 * 테스트 15 〉	통과 (22.20ms, 81.3MB)
 * 테스트 16 〉	통과 (18.19ms, 79.5MB)
 * 테스트 17 〉	통과 (24.24ms, 76.5MB)
 * 테스트 18 〉	통과 (22.72ms, 91.1MB)
 * 테스트 19 〉	통과 (19.84ms, 84.5MB)
 * 테스트 20 〉	통과 (23.68ms, 81MB)
 * 채점 결과
 * 정확성 : 100.0
 * 합계 : 100.0 / 100.0
 */

class Solution {
    public String solution(int[] numbers, String hand) {
        int currentL = 10;
        int currentR = 12;

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i<numbers.length; i++){
            switch(numbers[i]){
                case 1: case 4: case 7:
                    currentL = numbers[i];
                    sb.append("L");
                    System.out.println(currentL + ", " + currentR);
                    break;

                case 3: case 6: case 9:
                    currentR = numbers[i];
                    sb.append("R");
                    System.out.println(currentL + ", " + currentR);
                    break;

                case 2: case 5: case 8: case 0:
                    int whichHand = whichHand(numbers[i], currentL, currentR);
                    if(whichHand > 0){
                        currentR = numbers[i];
                        sb.append("R");
                        System.out.println(currentL + ", " + currentR + ">>>>>>>>>>1");
                    } else if (whichHand < 0){
                        currentL = numbers[i];
                        sb.append("L");
                        System.out.println(currentL + ", " + currentR + ">>>>>>>>>>2");
                    } else if (hand.equals("right")) {
                        currentR = numbers[i];
                        sb.append("R");
                        System.out.println(currentL + ", " + currentR + ">>>>>>>>>>3");
                    } else {
                        currentL = numbers[i];
                        sb.append("L");
                        System.out.println(currentL + ", " + currentR + ">>>>>>>>>>4");
                    }
            }
        }

        String answer = sb.toString();

        return answer;
    }

    public int whichHand(int number, int left, int right){
        number = number == 0 ? 11 : number;
        left = left == 0 ? 11 : left;
        right = right == 0 ? 11 : right;

        int[] targetLoc = new int[2];
        int[] currentLLoc = new int[2];
        int[] currentRLoc = new int[2];

        for(int i = 0; i<2; i++){
            if(i==0){
                targetLoc[i] = (number - 1) /3;
                currentLLoc[i] = (left - 1) /3;
                currentRLoc[i] = (right -1) /3;
            } else{
                targetLoc[i] = (number -1) % 3;
                currentLLoc[i] = (left -1) % 3;
                currentRLoc[i] = (right -1) % 3;
            }
        }
        int fromLeft = Math.abs(targetLoc[0]-currentLLoc[0]) + Math.abs(targetLoc[1]-currentLLoc[1]);
        int fromRight = Math.abs(targetLoc[0]-currentRLoc[0]) + Math.abs(targetLoc[1]-currentRLoc[1]);

        return fromLeft - fromRight;

    }
}
