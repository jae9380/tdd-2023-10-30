package com.ll;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalcTest {
    @Test
    @DisplayName("Calc에 runMethod는 int를 return 한다")
    void t1(){
        int answer = Calc.run1("10+10");
        assertThat(answer).isEqualTo(20);
    }
    @Test
    @DisplayName("10-10=0")
    void t2(){
        int answer = Calc.run1("10-10");
        assertThat(answer).isEqualTo(0);
    }
    @Test
    @DisplayName("10*3=30")
    void t3(){
        int answer= Calc.run1("10*3");
        assertThat(answer).isEqualTo(30);
    }
}
