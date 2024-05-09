package com.ohgiraffers.cal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MaltiplyTest {

    @Test
    @DisplayName("1*2")
    public void MaltiplyTwoNumbers1(){

        Maltiply maltiply = new Maltiply();
        int result = maltiply.MaltiplyTwoNumbers(1,2);

        Assertions.assertEquals(2, result);


    }

    @Test
    @DisplayName("3*5")
    public void MaltiplyTwoNumbers2(){

        Maltiply maltiply = new Maltiply();
        int result = maltiply.MaltiplyTwoNumbers(3,5);

        Assertions.assertEquals(15, result);

    }

}
