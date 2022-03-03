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
 *
 *
 * 2022.03.02
 * 정확성  테스트
 * 테스트 1 〉	통과 (0.02ms, 72.2MB)
 * 테스트 2 〉	통과 (0.04ms, 71.1MB)
 * 테스트 3 〉	통과 (0.03ms, 74.1MB)
 * 테스트 4 〉	통과 (0.05ms, 76.6MB)
 * 테스트 5 〉	통과 (0.04ms, 68MB)
 * 테스트 6 〉	통과 (0.05ms, 73.7MB)
 * 테스트 7 〉	통과 (0.05ms, 80.4MB)
 * 테스트 8 〉	통과 (0.05ms, 71.2MB)
 * 테스트 9 〉	통과 (0.05ms, 76.3MB)
 * 테스트 10 〉	통과 (0.05ms, 75.9MB)
 * 테스트 11 〉	통과 (0.05ms, 72.5MB)
 * 테스트 12 〉	통과 (0.04ms, 76.7MB)
 * 테스트 13 〉	통과 (0.06ms, 74.4MB)
 * 테스트 14 〉	통과 (0.09ms, 77.2MB)
 * 테스트 15 〉	통과 (0.15ms, 74.6MB)
 * 테스트 16 〉	통과 (0.18ms, 72.2MB)
 * 테스트 17 〉	통과 (0.39ms, 69.2MB)
 * 테스트 18 〉	통과 (0.26ms, 72.7MB)
 * 테스트 19 〉	통과 (0.26ms, 75.5MB)
 * 테스트 20 〉	통과 (0.26ms, 78MB)
 * 채점 결과
 * 정확성: 100.0
 * 합계: 100.0 / 100.0
 *
 *
 */

class 키패드누르기 {
    int currentL = 10;
    int currentR = 12;

    public String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i<numbers.length; i++){
            switch(numbers[i]){
                case 1: case 4: case 7:
                    this.currentL = numbers[i];
                    sb.append("L");
                    break;

                case 3: case 6: case 9:
                    this.currentR = numbers[i];
                    sb.append("R");
                    break;

                case 2: case 5: case 8: case 0:
                    int result = whichHand(numbers[i]);
                    if(result > 0){
                        this.currentR = numbers[i];
                        sb.append("R");
                    } else if (result < 0){
                        this.currentL = numbers[i];
                        sb.append("L");
                    } else if (hand.equals("right")) {
                        this.currentR = numbers[i];
                        sb.append("R");
                    } else {
                        this.currentL = numbers[i];
                        sb.append("L");
                    }
            }
        }

        String answer = sb.toString();

        return answer;

    }
    public int whichHand(int number){
        number = number == 0 ? 11 : number;
        this.currentL = this.currentL == 0 ? 11 : this.currentL;
        this.currentR = this.currentR == 0 ? 11 : this.currentR;

        int fromLeft = Math.abs((number-1)/3 - (this.currentL-1)/3) + Math.abs((number-1)%3 - (this.currentL-1)%3);
        int fromRight = Math.abs((number-1)/3 - (this.currentR-1)/3) + Math.abs((number-1)%3 - (this.currentR-1)%3);

        return fromLeft - fromRight;
    }

}