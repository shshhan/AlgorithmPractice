package Programmers.Practice.Level1;

import java.util.ArrayList;
import java.util.Comparator;

public class K번째수 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i = 0; i < commands.length; i++){
            answer[i] = func(array, commands[i]);
        }

        return answer;

    }


    public int func(int[] array, int[] command){
        ArrayList<Integer> afterFunc = new ArrayList<>();

        for(int i = command[0]-1; i < command[1]; i++){
            afterFunc.add(array[i]);
        }

        afterFunc.sort(Comparator.naturalOrder());

        return afterFunc.get(command[2]-1);
    }
}
