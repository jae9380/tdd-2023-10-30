package com.ll;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalcTest {
    @Test
    @DisplayName("Calc에 runMethod는 int를 return 한다")
    void t1(){
        int answer = Calc.run1("10+10");
    }
}
