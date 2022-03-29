package pl.Tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import pl.jano.ZAD4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static java.time.Duration.ofMillis;
import static org.junit.jupiter.api.Assertions.*;

class ZAD4Test {
    public ZAD4 test;
    public List<Integer> lista;

    @BeforeEach
    public void setUp(){
        test = new ZAD4();
        lista = new ArrayList<>();
    }

    @Test
    void recorderDigits_ExceptionThrow_WrongString() {

        Random random= new Random();
        for(int i=0;i<100;i++)
            lista.add(random.nextInt(1000));

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            test.recorderDigits(lista,"dzgdzg");
        });
    }


    @Test
    void recorderDigits_ExceptionThrow_BlankList() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            test.recorderDigits(lista,"desc");
        });
    }


    @Test
    public void timeoutTest() {

        Random random= new Random();
        for(int i=0;i<100;i++)
            lista.add(random.nextInt(1000));

        assertTimeout(ofMillis(70),()->{
            test.recorderDigits(lista,"desc");
        });

    }


}

