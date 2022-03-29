package pl.Tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pl.jano.ZAD2;

import static java.time.Duration.ofMillis;
import static org.junit.jupiter.api.Assertions.*;

class ZAD2Test {

    public ZAD2 object;

    @BeforeEach
    void prepare(){
        object = new ZAD2(1000);
    }

    @Test
    void spot_Null1() {
        int tab[] = object.spot(1345345123);
        assertNull(tab);
    }
    @Test
    void spot_Null2() {
        int tab[] = object.spot(1399999);
        assertNull(tab);
    }

    @Test
    void spot_NotNull1() {
        int tab[] = object.spot(100);
        assertNotNull(tab);
    }

    @Test
    void spot_NotNull2() {
        int tab[] = object.spot(10);
        assertNotNull(tab);
    }


    @Test
    void spot_NotNull3() {
        int tab[] = object.spot(-2);
        assertNotNull(tab);
    }



    @Test
    void spot_NotNull4() {
        int tab[] = object.spot(99);
        assertNotNull(tab);
    }

    @Test
    void spot_NotNull5() {
        int tab[] = object.spot(1000);
        assertNotNull(tab);
    }
    @Test
    public void timeoutTest() {
        assertTimeout(ofMillis(70),()->{
                int tab[] = object.spot(1000);
        });

    }





}