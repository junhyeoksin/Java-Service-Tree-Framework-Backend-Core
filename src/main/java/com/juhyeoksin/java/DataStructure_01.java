package com.juhyeoksin.java;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * 정수 num과 n이 매개 변수로 주어질 때, num이 n의 배수이면 1을 return
 * n의 배수가 아니라면 0을 return하도록 solution 함수를 완성
 */
public class DataStructure_01 {
    private int num;
    private int n;

    public DataStructure_01(int num, int n) {
        this.num = num;
        this.n = n;
    }


    public int solution(int num, int n) {
        int answer = 0;
        if (num % n == 0) {  // num이 n의 배수
            return answer + 1;
        } else {
            return 0;
        }
    }

    public int solutionRefactoring(  int num, int n) {
        int answer = num % n == 0 ? 1 : 0;

        return answer;
    }

    @Override
    public String toString() {
        return "DataStructure [num=" + num + ", n=" + n + "]";
    }
}

