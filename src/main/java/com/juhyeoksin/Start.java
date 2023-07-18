package com.juhyeoksin;

import com.juhyeoksin.java.DataStructure;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class Start { // 클래스는 타입이다.
    private final Logger logger = LoggerFactory.getLogger(this.getClass());  // 필드명


    public Start() {  //생성자
        int[] num_list = new int[]{10 ,20 ,30, 33, 2, 5} ; // 배열 생성 및 초기화

        logger.info("=========================================================================");
        DataStructure dataStructure = new DataStructure(num_list);

        int result = dataStructure.solution(num_list);
        logger.info("result -> " +  result);
        // 스트림 사용
        int refactoringResult = dataStructure.solutionRefactoring(num_list);
        logger.info("refactoringResult -> " + refactoringResult);
        logger.info("=========================================================================");
    }
}

