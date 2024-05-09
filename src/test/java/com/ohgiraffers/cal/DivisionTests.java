package com.ohgiraffers.cal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DivisionTests {

    @Test
    @DisplayName("6,2")

    public void testDivision() {

        Division division = new Division();
        int result = division.divideTwoNumbers(6,2);

        Assertions.assertEquals(3, result);
    }

}
