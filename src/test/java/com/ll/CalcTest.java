package com.ll;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalcTest {
    @Test
    @DisplayName("10+10=20")
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

    @Test
    @DisplayName("10+(10-10)")
    void r2t1(){
        int answer=Calc.run2("10+(10-10)");

    }
//    @Test
//    @DisplayName("3 * 1 + (1 - (4 * 1 - (1 - 1)))")
//    void t4(){
//        int answer = Calc.run2("3 * 1 + (1 - (4 * 1 - (1 - 1)))");
//        assertThat(answer).isEqualTo(0);
//    }
}
