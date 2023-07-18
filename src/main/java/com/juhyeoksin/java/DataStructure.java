package com.juhyeoksin.java;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * 정수 리스트 num_list 가 주어질 때,
 * 첫 번째로 나오는 음수의 인덱스를 return 하도록 solution 함수를 완성해주세요.
 * 음수가 없다면 -1을 return .
 */
public class DataStructure {
    private int[] num_list;
    public DataStructure(int[] num_list) {
        this.num_list = num_list;
    }


    /*
       int[] num_list = new int[]{10 ,20 ,30, 33,  2, 5}
       int[] num_list1 = {10 ,20 ,30, 33, -1, 2, 5} ; // new 생략 가능
    */
    public int solution(int[] num_list) {
        System.out.println("num_list -> " + num_list);
        int answer = -1;
        //첫 번째로 나오는 음수의 인덱스
        for (int i = 0; i < num_list.length; i++) {
            System.out.println("num_list[i] :: " + num_list[i]);
            System.out.println("answer = i " + i);

            if (num_list[i] < 0) {
                answer = i;
                break;
            }
        }
        System.out.println("answer -> " + answer);
        return answer;
     }
    // 다른 방식 풀이
    public int solutionRefactoring(int[] num_list) {
        final int LENGTH = num_list.length;
        return  IntStream.range(0, LENGTH).filter(i -> num_list[i] < 0).findFirst().orElse(-1);
    }

    @Override
    public String toString() {
        return "DataStructure [num_list=" + Arrays.toString(num_list) + "]";
    }
}

