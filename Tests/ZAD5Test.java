package pl.Tests;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pl.jano.ZAD5;

import static java.time.Duration.ofMillis;
import static org.junit.jupiter.api.Assertions.*;

class ZAD5Test {
    public ZAD5 object;

    @BeforeEach
    void setUP(){
        object = new ZAD5();
    }


    @Test
    void kaprekar_ThrowException_SameDigits() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            object.kaprekar(4444);
        });
    }

    @Test
    void kaprekar_ThrowException_TooBigNumber() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            object.kaprekar(123456);
        });
    }


    @Test
    void sortString_AssendingOrderTrue() {

        String result= object.sortString("34521",true);
        String expected = "12345";
        assertEquals(result,expected);
    }

    @Test
    void sortString_AssendingOrderFalse() {

        String result= object.sortString("167823459",false);
        String expected = "987654321";
        assertEquals(result,expected);
    }

    @Test
    public void timeoutTest() {
        assertTimeout(ofMillis(70),()->{
            object.kaprekar(1123);
        });

    }


}