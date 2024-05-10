package com.ohgiraffers.cal;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class plustest {

    @Test
    @DisplayName("1,2")
    public void plusnumber(){


        Plus adder =new Plus();
        int result = adder.plusnumber(1,2);

        Assertions.assertEquals(3,result);



    }

    @Test
    @DisplayName("3,5")
    public void plusnumber2(){


        Plus adder =new Plus();
        int result = adder.plusnumber(3,5);

        Assertions.assertEquals(8,result);

    }


}
