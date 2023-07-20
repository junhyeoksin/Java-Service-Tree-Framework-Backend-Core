package com.juhyeoksin.java;

import java.util.Arrays;

/**
 * 정수가 담긴 리스트 num_list 가 주어질 때,
 * 리스트의 길이가 11 이상이면 리스트에 있는 모든 원소의 합을 10 이하이면 모든 원소의 곱을 return 하도록 solution 함수를 완성
 */
public class DataStructure_03 {
    private int[] num_list;

    public DataStructure_03( int[] num_list) {
        this.num_list = num_list;
    }

    public int solution(int[] num_list) {
        int answer = 0;
        int sum = 0;
        int multiple= 1;
        for(int i=0; i<num_list.length; i++){
            if(num_list.length >= 11) {
                sum += num_list[i];  //
                answer = sum;
            }else {
                multiple *= num_list[i];
                answer = multiple;
            }
         }

         return answer;
    }
    public int solutionRefactoring( int[] num_list) {
        int answer = 0;
        int sum = 0;
        int multiple= 1;

        for (int i = 0; i < num_list.length; i++) {
            answer = num_list.length >= 11 ? (sum += num_list[i] ) :(multiple *= num_list[i]);
        }

        return answer;
    }
    @Override
    public String toString() {
        return "DataStructure [num_list=" + num_list +  "]";
    }
}

