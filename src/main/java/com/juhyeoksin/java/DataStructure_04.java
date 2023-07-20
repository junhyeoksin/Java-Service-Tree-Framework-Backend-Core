package com.juhyeoksin.java;

/**
 *  정수 num1과 num2가 주어질 때, num1에서 num2를 뺀 값을 return하도록 soltuion 함수를 완성해주세요.
 */
public class DataStructure_04 {
    private int num1;
    private int num2;

    public DataStructure_04(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int solution(int num1, int num2) {
        int answer = num1 - num2;
        return answer;
    }

    @Override
    public String toString() {
        return "DataStructure [num=" + num1 + ", n=" + num2 + "]";
    }
}

