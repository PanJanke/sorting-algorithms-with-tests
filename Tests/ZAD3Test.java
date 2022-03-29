package pl.Tests;

import org.junit.BeforeClass;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pl.jano.ZAD3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static java.time.Duration.ofMillis;
import static org.junit.jupiter.api.Assertions.*;

class ZAD3Test {

    public ZAD3 object;
    public List<Integer> lista = new ArrayList<Integer>();
    public int border=60;
    public int borderToFind=20;
    public int n =20;


    @BeforeClass
    public void prepare(){
        object = new ZAD3();
    }

    @BeforeEach
    public void setUp(){
        object = new ZAD3();
        Random random = new Random();
        for(int i=0;i<n;i++)
            lista.add(random.nextInt(border));
    }




    @Test
    void missingNum_NotReturnNull(){

    List<Integer> result = object.missingNum(lista,borderToFind);
    assertNotNull(result);
    }

    @Test
    void missingNum_NotReturnBlank(){

        List<Integer> result = object.missingNum(lista,borderToFind);
        assertNotEquals((int)result.size(),0);
    }

    @Test
    public void timeoutTest()
    {
        assertTimeout(ofMillis(10),()->{
            List<Integer> result = object.missingNum(lista,borderToFind);
        });

    }

}