package com.juhyeoksin.java;

/**
 * 문자열 my_string과 정수 n이 매개변수로 주어질 때,
 * my_string의 뒤의 n글자로 이루어진 문자열을 return 하는 solution 함수를 작성
 */
public class DataStructure_02 {
    private String my_string;
    private int n;

    public DataStructure_02(String my_string, int n) {
        this.my_string = my_string;
        this.n = n;
    }

    public String solution(String my_string, int n) {
        return my_string.substring(my_string.length() - n);  // 문자열의 특정 부분을 잘라냄
    }

    @Override
    public String toString() {
        return "DataStructure [my_string=" + my_string + ", n=" + n + "]";
    }
}

